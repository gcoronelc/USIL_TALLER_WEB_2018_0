package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html lang=\"en\" >\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <title>Login</title>\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, user-scalable=yes\">\n");
      out.write("  \n");
      out.write("  <link rel='stylesheet prefetch' href='https://fonts.googleapis.com/css?family=Open+Sans'>\n");
      out.write("      <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("  <div class=\"cont\">\n");
      out.write("  <div class=\"demo\">\n");
      out.write("    <div class=\"login\">\n");
      out.write("        <center> <img src=\"FOTOS/user-login.png\"></center>\n");
      out.write("      <div class=\"login__form\">\n");
      out.write("        <div class=\"login__row\">\n");
      out.write("          <svg class=\"login__icon name svg-icon\" viewBox=\"0 0 20 20\">\n");
      out.write("            <path d=\"M0,20 a10,8 0 0,1 20,0z M10,0 a4,4 0 0,1 0,8 a4,4 0 0,1 0,-8\" />\n");
      out.write("          </svg>\n");
      out.write("          <input type=\"text\" class=\"login__input name\" placeholder=\"Username\"/>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"login__row\">\n");
      out.write("          <svg class=\"login__icon pass svg-icon\" viewBox=\"0 0 20 20\">\n");
      out.write("            <path d=\"M0,20 20,20 20,8 0,8z M10,13 10,16z M4,8 a6,8 0 0,1 12,0\" />\n");
      out.write("          </svg>\n");
      out.write("          <input type=\"password\" class=\"login__input pass\" placeholder=\"Password\"/>\n");
      out.write("        </div>\n");
      out.write("        <button type=\"button\" class=\"login__submit\">Ingresar</button>\n");
      out.write("        <a href=\"main.jsp\"><h1>pagina principal</h1></a>\n");
      out.write("        <p class=\"login__signup\">No tienes una cuenta? &nbsp;<a>Registrate</a></p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("</div>  \n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
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
