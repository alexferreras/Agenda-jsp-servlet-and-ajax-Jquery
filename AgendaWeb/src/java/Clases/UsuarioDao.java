
package Clases;

import Pojo.Usuario;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alexf
 */
public class UsuarioDao extends DBconnection{
    
    public void Guardar(Usuario user) throws SQLException, ClassNotFoundException{
    Conectar();
    String sql="insert into usuario(nombre, apellido, correo, contraseña)"+"values(?, ?, ?, ?)";
    estado= con.prepareStatement(sql);
    estado.setString(1, user.getNombre());
    estado.setString(2, user.getApellido());
    estado.setString(3, user.getCorreo());
    estado.setString(4, user.getContrasena());
    estado.execute();
    System.out.println("Guarde");
    Desconectar();
    
    }
    
    public Usuario Login(String user, String pass) throws  ClassNotFoundException, SQLException{
        Usuario usuario= new Usuario(0);
        Conectar();
        String sql="select * from usuario where correo=? and contraseña=? limit 1";
        estado= con.prepareStatement(sql);
        estado.setString(1, user);
        estado.setString(2, pass);
        rs= estado.executeQuery();
        try {
            while(rs.next())
            {
                usuario.setId(rs.getInt("usuarioId"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido(rs.getString("apellido"));
                usuario.setCorreo(rs.getString("correo"));
            }
            Desconectar();
            return usuario;
        } catch (SQLException ex) {
            System.out.println("error usuario login:" + ex.getMessage());
             return null;
        }
    
    }
    
    
    
}
