
package Clases;

import Clases.DBconnection;
import Pojo.Contacto;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContactoDao extends DBconnection{
    
    
    public void Guardar(Contacto contacto, int id) throws SQLException, ClassNotFoundException{
        Conectar();
        String sql="insert into contacto(nombre, apellido ,telefono , direccion,correo,status, fecha, usuario_id)"+"values(?, ?, ?, ?, ?, ?, ?, ?)";
        estado= con.prepareStatement(sql);
        estado.setString(1, contacto.getNombre());
        estado.setString(2, contacto.getApellido());
        estado.setString(3, contacto.getTelefono());
        estado.setString(4, contacto.getDireccion());
         estado.setString(5, contacto.getCorreo());
         estado.setInt(6, 0);
        estado.setString(7,fecha );
        estado.setInt(8, id);
        estado.execute();
        System.out.println("Guarde");
        Desconectar();
    }
    
    public void Editar(Contacto contacto) throws SQLException, ClassNotFoundException{
        Conectar();
        String sql = "update contacto set nombre = ?, apellido = ?,telefono= ?, direccion =?,correo=?,status=?, fecha=? "+"where contactoId = ?";
        estado= con.prepareStatement(sql);
        estado.setString(1, contacto.getNombre());
        estado.setString(2, contacto.getApellido());
        estado.setString(3, contacto.getTelefono());
        estado.setString(4, contacto.getDireccion());
         estado.setString(5, contacto.getCorreo());
         estado.setInt(6, 0);
        estado.setString(7,fecha );
        estado.setInt(8, contacto.getId());
        estado.execute();
        System.out.println("Edite");
        Desconectar();
    }
    
    
      public void eliminar(int id) throws SQLException, ClassNotFoundException{
        Conectar();
        String sql = "update contacto set status=1 "+"where contactoId = '"+id+"'";
        estado= con.prepareStatement(sql);
        estado.execute();
        System.out.println("elimine");
        Desconectar();
    }
    
    public List<Contacto> Buscar(int id) throws SQLException, ClassNotFoundException{
        Conectar();
        ArrayList<Contacto> contacto= new ArrayList<>(); 
        String sql="select * from contacto  where status = 0 and usuario_id=" + id+" order by nombre";
        estado= con.prepareStatement(sql);
        rs= estado.executeQuery();
        while(rs.next()){
        Contacto c= new Contacto(rs.getInt("contactoId"), rs.getString("nombre"), rs.getString("apellido"),rs.getString("telefono"), rs.getString("direccion"),rs.getString("correo"),rs.getInt("status"),rs.getString("fecha"));
       contacto.add(c);
        }
       Desconectar();
       
       return contacto;
        
    }
    
       public List<Contacto> Buscar(String sql) throws SQLException, ClassNotFoundException{
        Conectar();
        ArrayList<Contacto> contacto= new ArrayList<>(); 
        estado= con.prepareStatement(sql);
        rs= estado.executeQuery();
        while(rs.next()){
        Contacto c= new Contacto(rs.getInt("contactoId"), rs.getString("nombre"), rs.getString("apellido"),rs.getString("telefono"), rs.getString("direccion"),rs.getString("correo"),rs.getInt("status"),rs.getString("fecha"));
       contacto.add(c);
        }
       Desconectar();
       
       return contacto;
        
    }
    
   
    
}
