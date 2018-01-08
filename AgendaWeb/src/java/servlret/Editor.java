
package servlret;

import Clases.Consultas;
import Clases.Contacto;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Editor", urlPatterns = {"/Editor"})
public class Editor extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String msj= "exito";
        int id= Integer.parseInt(request.getParameter("id"));
        String nombre = request.getParameter("ednombre");
        String apellido = request.getParameter("edapellido");
        String telefono = request.getParameter("edtelefono");
        String direccion = request.getParameter("eddireccion");
        String correo = request.getParameter("edcorreo");
        Contacto c = new Contacto(id, nombre, apellido, telefono, direccion, correo);
        Consultas cs = new Consultas();
        try {
            cs.Editar(c);
        } catch (SQLException ex) {
            ex.printStackTrace();
            msj= ex.getMessage();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            msj=ex.getMessage();
        }
        
       response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.write(msj);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
