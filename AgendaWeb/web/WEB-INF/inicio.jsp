
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Clases.Contacto"%>
<%@page import="Clases.Consultas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
        
<% 
Consultas cs= new Consultas();

ArrayList<Contacto> cont = null;
        try {
           cont=( ArrayList<Contacto>)cs.Buscar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
           ex.printStackTrace();
        }
            
%>
<center>
<h1>Mis Contactos</h1> 

 <div class="table-responsive ">
     <table class="table table-bordred table-striped" style=" border-bottom: 1px solid #ddd; border:1px solid #ddd ">
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
                    <td><p data-placement="top" data-toggle="tooltip" title="Delete"><a class="btn btn-danger btn-ms" href="index.jsp?page=eliminarContacto&id=<%=cont.get(i).getId()%>" >Eliminar</a></p></td>
    
                  
                </tr>
               <%}%>                
                </tbody>           
            </table>
    </div>
 </center>  
                


