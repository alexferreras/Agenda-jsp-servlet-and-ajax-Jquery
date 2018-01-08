package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("    <title>Do something diferent</title>\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- jQuery called-->\n");
      out.write("    <script src=\"Js/jquery.js\"></script>\n");
      out.write("  \n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Navigation -->\n");
      out.write("    <nav class=\"navbar navbar-default navbar-fixed-top navbar-inverse\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n");
      out.write("        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("      </button>\n");
      out.write("      <a class=\"navbar-brand\" href=\"index.jsp\">Inicio</a> \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("      \n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("           <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link js-scroll-trigger\" href=\"AgregarContacto.jsp\">Agregar Contacto</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link js-scroll-trigger\" href=\"Registrar.jsp\">Registrarse</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link js-scroll-trigger\" href=\"Login.jsp\">Loguiarse</a>\n");
      out.write("                    </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("           <a class=\"nav-link js-scroll-trigger\" href=\"#contact\">Salir</a>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("   \n");
      out.write("  </div><!-- /.container-fluid -->\n");
      out.write("</nav>\n");
      out.write("  \n");
      out.write("    \n");
      out.write("     <div class=\"container\">\n");
      out.write("  <h2>Modal Login Example</h2>\n");
      out.write("  \n");
      out.write("\n");
      out.write("  <!-- Modal -->\n");
      out.write("  <div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("    \n");
      out.write("      <!-- Modal content-->\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\" style=\"padding:35px 50px;\">\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("          <h4><span class=\"glyphicon glyphicon-lock\"></span> Login</h4>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-body\" style=\"padding:40px 50px;\">\n");
      out.write("          <form role=\"form\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"usrname\"><span class=\"glyphicon glyphicon-user\"></span> Username</label>\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"usrname\" placeholder=\"Enter email\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"psw\"><span class=\"glyphicon glyphicon-eye-open\"></span> Password</label>\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"psw\" placeholder=\"Enter password\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"checkbox\">\n");
      out.write("              <label><input type=\"checkbox\" value=\"\" checked>Remember me</label>\n");
      out.write("            </div>\n");
      out.write("              <button type=\"submit\" class=\"btn btn-success btn-block\"><span class=\"glyphicon glyphicon-off\"></span> Login</button>\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-footer\">\n");
      out.write("          <button type=\"submit\" class=\"btn btn-danger btn-default pull-left\" data-dismiss=\"modal\"><span class=\"glyphicon glyphicon-remove\"></span> Cancel</button>\n");
      out.write("          <p>Not a member? <a href=\"#\">Sign Up</a></p>\n");
      out.write("          <p>Forgot <a href=\"#\">Password?</a></p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div> \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("  \n");
      out.write("<br><br><br>\n");
      out.write("    <!-- Footer -->\n");
      out.write("    <footer class=\"py-5 bg-dark\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <p class=\"m-0 text-center text-white\">Alex Ferreras &copy; Contact Saver 2017</p>\n");
      out.write("        </div>\n");
      out.write("        <!-- /.container -->\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core JavaScript -->\n");
      out.write("\n");
      out.write("    <script src=\"vendor/popper/popper.min.js\"></script>\n");
      out.write("    <script src=\"vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Plugin JavaScript -->\n");
      out.write("    <script src=\"vendor/jquery-easing/jquery.easing.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Custom JavaScript for this theme -->\n");
      out.write("    <script src=\"Js/scrolling-nav.js\"></script>\n");
      out.write("\n");
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
