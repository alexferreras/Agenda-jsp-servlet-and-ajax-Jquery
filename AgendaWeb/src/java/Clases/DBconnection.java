package Clases;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DBconnection {
    String host="localhost";
    String user ="root";
    String password="admin";
    String db="agendaweb";
    Connection con;
    PreparedStatement estado;
    ResultSet rs;
    Date date= new Date();
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    String fecha = dateFormat.format(date); 
  
    
    public DBconnection() {
    }
    
   public void Conectar() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
    String url = "jdbc:mysql://" + host + "/" + db +"?user="+user+"&password="+ password;
        con = DriverManager.getConnection(url);
    }
   
    public void Desconectar() throws SQLException{
    
        if (con !=null){
        con.close();
        System.out.println("desconecte!");
        }
    }

    
    
    
    
}
