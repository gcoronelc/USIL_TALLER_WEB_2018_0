package pe.egcc.edutec.prueba;

import pe.egcc.edutec.service.NegocioService;

public class Prueba_REQNEG002 {

  public static void main(String[] args) {
    
    try {
      // Datos
      String ciclo = "2018-02";
      String curso = "C012";
      String profesor = ""; //"P038";
      int vacantes = 20;
      String horario = "MA y JU de 8 a 11 Horas";
      // Proceso
      NegocioService negocioService = new NegocioService();
      int id = negocioService.programarCurso(ciclo, curso, profesor, vacantes, horario);
      // Reporte
      System.out.println("ID = " + id);
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    
  }
  
}
