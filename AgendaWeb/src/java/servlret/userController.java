
package servlret;

import Clases.UsuarioDao;
import Pojo.Usuario;
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


@WebServlet(name = "userController", urlPatterns = {"/userController"})
public class userController extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String msj= "exito";
        Usuario user = new Usuario(request.getParameter("rnombre"),request.getParameter("rapellido"),request.getParameter("rcorreo"),request.getParameter("psw"));
        
        UsuarioDao  uD= new UsuarioDao();
        try {
            uD.Guardar(user);
        } catch (SQLException ex) {
            ex.printStackTrace();
            msj=ex.getMessage();
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
