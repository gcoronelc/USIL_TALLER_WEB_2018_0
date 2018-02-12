package pe.egcc.edutec.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pe.egcc.edutec.service.NegocioService;

@WebServlet({ "/ProgramarCurso", "/ProgramarCursoProc", "/bbb" })
public class NegocioController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   String path = request.getServletPath();
	    switch (path) {
	    case "/ProgramarCurso":
	      programarCurso(request,response);
	      break;
	    case "/ProgramarCursoProc":
	      programarCursoProc(request,response);
	      break;
	    }
	}

  private void programarCursoProc(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    try {
      // Datos
      String ciclo = request.getParameter("ciclo");
      String curso = request.getParameter("curso");
      String profesor = request.getParameter("profesor");
      String horario = request.getParameter("horario");
      int vacantes = Integer.parseInt(request.getParameter("vacantes"));
      // Proceso
      NegocioService service = new NegocioService();
      int id = service.programarCurso(ciclo, curso, profesor, vacantes, horario);
      request.setAttribute("mensaje", "ID: " + id);
    } catch (Exception e) {
      request.setAttribute("error", "ERROR: " + e.getMessage());
    }
    // Dispatcher
    String pagina = "programarCurso.jsp";
    RequestDispatcher dispatcher;
    dispatcher = request.getRequestDispatcher(pagina);
    dispatcher.forward(request, response);
  }

  private void programarCurso(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    // Pagina destino
    String pagina = "programarCurso.jsp";
    
    // Dispatcher
    RequestDispatcher dispatcher;
    dispatcher = request.getRequestDispatcher(pagina);
    dispatcher.forward(request, response);
  }

}
