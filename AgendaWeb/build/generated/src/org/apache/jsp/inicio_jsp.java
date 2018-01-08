package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import java.util.List;
import java.sql.SQLException;
import java.util.ArrayList;
import Clases.Contacto;
import Clases.Consultas;

public final class inicio_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
 
Consultas cs= new Consultas();

ArrayList<Contacto> cont = null;
        try {
           cont=( ArrayList<Contacto>)cs.Buscar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
           ex.printStackTrace();
        }
            

      out.write("\n");
      out.write("<center>\n");
      out.write("<h1>Mis Contactos</h1> \n");
      out.write("\n");
      out.write(" <div class=\"table-responsive \">\n");
      out.write("     <table class=\"table table-bordred table-striped\" style=\" border-bottom: 1px solid #ddd; border:1px solid #ddd \">\n");
      out.write("                <thead>\n");
      out.write("                \n");
      out.write("                <th>Nombre Completo</th>\n");
      out.write("                <th>Telefono</th>\n");
      out.write("                <th>Direccion</th>\n");
      out.write("                <th>Correo</th>\n");
      out.write("                <th>Fecha Ingreso</th>\n");
      out.write("                <th>Editar</th>\n");
      out.write("                  <th>Eliminar</th> \n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("              \n");
      out.write("                ");
 for (int i =0; i<cont.size(); i++){
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    \n");
      out.write("                    <td>");
      out.print( cont.get(i).getNombre()+" "+cont.get(i).getApellido() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( cont.get(i).getTelefono() );
      out.write("</td>\n");
      out.write("                   <td>");
      out.print( cont.get(i).getDireccion() );
      out.write("</td>\n");
      out.write("                   <td>");
      out.print( cont.get(i).getCorreo());
      out.write("</td>\n");
      out.write("                   <td>");
      out.print( cont.get(i).getFecha());
      out.write("</td>\n");
      out.write("                    <td><p data-placement=\"top\" data-toggle=\"tooltip\" title=\"Edit\"><a class=\"btn btn-primary btn-ms\" href=\"editarContacto.jsp?id=");
      out.print(cont.get(i).getId());
      out.write("\"  >Editar</a></p></td>\n");
      out.write("                    <td><p data-placement=\"top\" data-toggle=\"tooltip\" title=\"Delete\"><a class=\"btn btn-danger btn-ms\" href=\"eliminarContacto.jsp?id=");
      out.print(cont.get(i).getId());
      out.write("\" >Eliminar</a></p></td>\n");
      out.write("    \n");
      out.write("                  \n");
      out.write("                </tr>\n");
      out.write("               ");
}
      out.write("                \n");
      out.write("                </tbody>           \n");
      out.write("            </table>\n");
      out.write("    </div>\n");
      out.write(" </center>  \n");
      out.write("                \n");
      out.write("\n");
      out.write("\n");
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
