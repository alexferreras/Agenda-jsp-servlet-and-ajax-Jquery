
package servlret;

import Clases.UsuarioDao;
import Pojo.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "LoginController", urlPatterns = {"/LoginController"})
public class LoginController extends HttpServlet {
HttpSession session;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Cerrar sesion
        session.invalidate();
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.write("exito");
       
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String correo = request.getParameter("correo");
        String contraseña= request.getParameter("contraseña");
        String msj=null;
        
        RequestDispatcher rd;
        try {
            Usuario us= new UsuarioDao().Login(correo, contraseña);
            if(us.getId()>0)
            {
                session= request.getSession();
                session.setAttribute("usuario", us);
                msj= "exito";
            }else{
            msj ="Usuario o Contraseña Incorrecta";
            }
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            msj =ex.getMessage();
        } catch (SQLException ex) {
             ex.printStackTrace();
             msj =ex.getMessage();
        }finally{
           response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.write(msj);
        }
        
   
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
