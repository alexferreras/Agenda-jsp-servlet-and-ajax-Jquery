
package servlret;

import Clases.ContactoDao;
import Pojo.Contacto;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Editor", urlPatterns = {"/Editor"})
public class Editor extends HttpServlet {

    //utilizo el metodo get para borrar los registros
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String msj= "exito";
         int id= Integer.parseInt(request.getParameter("id"));
        
            ContactoDao cs = new ContactoDao();
        try {
            cs.eliminar(id);
        } catch (SQLException ex) {
           ex.printStackTrace();
            msj= ex.getMessage();
        } catch (ClassNotFoundException ex) {
           ex.printStackTrace();
            msj= ex.getMessage();
        }
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.write(msj);
       
    }

  //el post para actualizarlos
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
        ContactoDao cs = new ContactoDao();
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
