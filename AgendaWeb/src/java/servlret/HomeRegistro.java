package servlret;
import Clases.ContactoDao;
import Pojo.Contacto;
import Pojo.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

@WebServlet(name = "HomeRegistro", urlPatterns = {"/HomeRegistro"})
public class HomeRegistro extends HttpServlet {

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        Usuario user = (Usuario) session.getAttribute("usuario");
       
        int id=  user.getId();
        
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
        ContactoDao cs = new ContactoDao();
        String msj= "exito";
        try {
            cs.Guardar(c, id);
        } catch (SQLException ex) {
           ex.printStackTrace();
           msj = ex.getMessage();
        } catch (ClassNotFoundException ex) {
          ex.printStackTrace();
           msj = ex.getMessage();
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
