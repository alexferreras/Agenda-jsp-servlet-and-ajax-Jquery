<%-- 
    Document   : Inicio
    Created on : 08-dic-2017, 19:41:48
    Author     : alexf
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Clases.Contacto"%>
<%@page import="Clases.Consultas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Do something diferent</title>
    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- jQuery called-->
    <script src="Js/jquery.js"></script>
  
</head>


    <!-- Navigation -->
    <nav class="navbar navbar-default navbar-fixed-top navbar-inverse">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="index.jsp">Inicio</a> 
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
      
      <ul class="nav navbar-nav navbar-right">
           <li class="nav-item">
                        <a class="nav-link js-scroll-trigger" href="AgregarContacto.jsp">Agregar Contacto</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link js-scroll-trigger" href="Registrar.jsp">Registrarse</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link js-scroll-trigger" href="Login.jsp">Loguiarse</a>
                    </li>
        <li class="nav-item">
           <a class="nav-link js-scroll-trigger" href="#contact">Salir</a>
        </li>
      </ul>
   
  </div><!-- /.container-fluid -->
</nav>
  
    <div class="col col-sm-2"></div>
    <div class="container col col-sm-8" style="margin-top: 100px;">
        
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
                    <td><p data-placement="top" data-toggle="tooltip" title="Edit"><a class="btn btn-primary btn-ms" href="editarContacto.jsp?id=<%=cont.get(i).getId()%>"  >Editar</a></p></td>
                    <td><p data-placement="top" data-toggle="tooltip" title="Delete"><a class="btn btn-danger btn-ms" href="eliminarContacto.jsp?id=<%=cont.get(i).getId()%>" >Eliminar</a></p></td>
    
                  
                </tr>
               <%}%>                
                </tbody>           
            </table>
    </div>
 </center>  
                
</div>
             
      
    <!-- Footer -->
    <footer class="py-5 bg-dark">
        <div class="container">
            <p class="m-0 text-center text-white">Alex Ferreras &copy; Contact Saver 2017</p>
        </div>
        <!-- /.container -->
    </footer>

    <!-- Bootstrap core JavaScript -->

    <script src="vendor/popper/popper.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

    <!-- Custom JavaScript for this theme -->
    <script src="Js/scrolling-nav.js"></script>



</html>

