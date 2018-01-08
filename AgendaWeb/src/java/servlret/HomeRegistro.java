package servlret;
import Clases.Consultas;
import Clases.Contacto;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;

@WebServlet(name = "HomeRegistro", urlPatterns = {"/HomeRegistro"})
public class HomeRegistro extends HttpServlet {

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
          
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String telefono = request.getParameter("telefono");
        String direccion = request.getParameter("direccion");
        String correo = request.getParameter("correo");
        Contacto c = new Contacto();
        c.setNombre(nombre);
        c.setApellido(apellido);
        c.setDireccion(direccion);
        c.setTelefono(telefono);
        c.setCorreo(correo);
        Consultas cs = new Consultas();
        try {
            cs.Guardar(c);
        } catch (SQLException ex) {
           ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
          ex.printStackTrace();
        }
      
        
        RequestDispatcher rd = request.getRequestDispatcher("index.jsp?page=inicio");
        rd.forward(request, response);
      
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
