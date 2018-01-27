package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<div class=\"menu\"> \n");
      out.write("    <ul>   \n");
      out.write("        \n");
      out.write("        <li><a href=\"main.jsp\" >HOME</a></li>\n");
      out.write("        <li><a href=\"#\">Consultas</a>\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"\">Producto</a></li>\n");
      out.write("                <li><a href=\"\">Categoria</a></li>\n");
      out.write("                <li><a href=\"\">Campaña</a></li>\n");
      out.write("                <li><a href=\"\">Promocion</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </li>\n");
      out.write("        <li><a href=\"#\">Mantenimiento</a>\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"\">Tarifas</a></li>\n");
      out.write("                <li><a href=\"\">Cursos</a></li>\n");
      out.write("                <li><a href=\"\">Profesores</a></li>\n");
      out.write("                <li><a href=\"\">Alunmos</a></li>\n");
      out.write("                <li><a href=\"\">Empleados</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </li>\n");
      out.write("        <li><a href=\"#\">Matricula</a>\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"matricula.jsp\">Realizar Matricula</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </li>    \n");
      out.write("        <li><a href=\"#\">Reportes</a>\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"\">Ventas</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </li>  \n");
      out.write("        <li><a href=\"#\">Util</a>                   \n");
      out.write("        </li>\n");
      out.write("    </ul> \n");
      out.write("</div>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
