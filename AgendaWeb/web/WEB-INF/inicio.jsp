
<%@page import="Pojo.Usuario"%>
<%@page import="Pojo.Contacto"%>
<%@page import="Clases.ContactoDao"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
        
<% 
ContactoDao cs= new ContactoDao();

ArrayList<Contacto> cont = null;
 Usuario user = (Usuario) session.getAttribute("usuario");
 int id=  user.getId();
        try {
           cont=( ArrayList<Contacto>)cs.Buscar(id);
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
           ex.printStackTrace();
        }
            
%>
<center>
    

 <div class="table-responsive ">
    
     <table class="table table-bordred table-striped" style=" border-bottom: 1px solid #ddd; border:1px solid #ddd ">
         <h1 class="table-title">Mis Contactos ${usuario.nombre}</h1>        
         <thead>
                
                <th>Nombre Completo</th>
                <th>Telefono</th>
                <th>Direccion</th>
                <th>Correo</th>
                <th>Fecha Ingreso</th>
                <th>Editar</th>
                  <th>Eliminar</th> 
                </thead>
                <tbody>
              
                <% for (int i =0; i<cont.size(); i++){%>
                <tr>
                    
                    <td><%= cont.get(i).getNombre()+" "+cont.get(i).getApellido() %></td>
                    <td><%= cont.get(i).getTelefono() %></td>
                   <td><%= cont.get(i).getDireccion() %></td>
                   <td><%= cont.get(i).getCorreo()%></td>
                   <td><%= cont.get(i).getFecha()%></td>
                    <td><p data-placement="top" data-toggle="tooltip" title="Edit"><a class="btn btn-primary btn-ms" href="index.jsp?page=editarContacto&id=<%=cont.get(i).getId()%>"  >Editar</a></p></td>
                    <td><p data-placement="top" data-toggle="tooltip" title="Delete"><button class="btn btn-danger btn-ms" onclick="eliminar(this)" id="<%=cont.get(i).getId()%>">Eliminar</button></p></td>
    
                  
                </tr>
               <%}%>                
                </tbody>           
            </table>
    </div>
 </center>  
                

 
