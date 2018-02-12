package pe.egcc.edutec.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import pe.egcc.edutec.db.AccesoDB;

public class NegocioService {

  public int programarCurso(String ciclo,String 
      codCurso, String codProfesor, int vacantes, String horario
      ){
    int codCursoProg = 0;
    Connection cn = null;
    
    try {
      // Inicio de Tx.
      cn = AccesoDB.getConnection();
      cn.setAutoCommit(false);
      // Validar el ciclo
      int anio = Integer.parseInt(ciclo.substring(0,4));
      int mes = Integer.parseInt(ciclo.substring(5,7));
      Calendar fechaActual = Calendar.getInstance();
      int anioSistema = fechaActual.get(Calendar.YEAR);
      int mesSistema = fechaActual.get(Calendar.MONTH) + 1;      
      if(anio < anioSistema){
        throw new SQLException("Ciclo incorrecto.");
      }
      if(anio == anioSistema && mes < mesSistema){
        throw new SQLException("Ciclo incorrecto.");
      }
      // Leer precio
      String sql = "select t.PrecioVenta precio "
          + "from Tarifa t join Curso c "
          + "on t.IdTarifa = c.IdTarifa "
          + "where c.IdCurso = ?";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, codCurso);
      ResultSet rs = pstm.executeQuery();
      if(!rs.next()){
        throw new SQLException("Codigo de curso no existe.");
      }
      double precio = rs.getDouble("precio");
      rs.close();
      pstm.close();      
      // Profesor
      if(codProfesor != null && codProfesor.length() == 0){
        codProfesor = null;
      }
      // Insertar registro
      sql = "insert into cursoprogramado(IdCurso,"
          + "IdCiclo,IdProfesor,Vacantes,Matriculados,"
          + "PreCursoProg,Horario,Activo) "
          + "values(?,?,?,?,?,?,?,?)";
      pstm = cn.prepareStatement(sql);
      pstm.setString(1, codCurso);
      pstm.setString(2, ciclo);
      pstm.setString(3, codProfesor);
      pstm.setInt(4, vacantes);
      pstm.setInt(5, 0);
      pstm.setDouble(6, precio);
      pstm.setString(7, horario);
      pstm.setInt(8, 1);
      pstm.executeUpdate();
      pstm.close();
      // Leer el codigo del curso programado
      sql = "SELECT IDENT_CURRENT('cursoprogramado') id";
      pstm = cn.prepareStatement(sql);
      rs = pstm.executeQuery();
      rs.next();
      codCursoProg = rs.getInt("id");
      rs.close();
      pstm.close();
      // Terminar Tx
      cn.commit();
    } catch (Exception e) {
      try {
        cn.rollback();
      } catch (Exception e2) {
      }
      throw new RuntimeException(e.getMessage());
    } finally{
      try {
        cn.close();
      } catch (Exception e2) {
      }      
    }
    return codCursoProg;
  }
  
  
  public void registrarMatricula(int idCursoProg, String idAlumno){
    
  }
  
}
