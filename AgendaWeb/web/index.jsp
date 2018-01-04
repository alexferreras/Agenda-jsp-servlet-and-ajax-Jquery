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
    
	<link rel="icon" href="image/logo.jpg">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Do something diferent</title>

    <!-- Bootstrap core CSS -->
    
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    
    <!-- Custom styles for this template -->
    <link href="css/scrolling-nav.css" rel="stylesheet">
    <!-- jQuery called-->
    <script src="vendor/jquery/jquery.js"></script>
  

</head>


    <!-- Navigation -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top" id="mainNav">
        <div class="container">
            <a class="navbar-brand js-scroll-trigger" href="/AgendaWeb/index.jsp">Inicio</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
            <div class="collapse navbar-collapse" id="navbarResponsive">
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item">
                        <a class="nav-link js-scroll-trigger" href="/AgendaWeb/AgregarContacto.jsp">Agregar Contacto</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link js-scroll-trigger" href="/AgendaWeb/Registrar.jsp">Registrarse</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link js-scroll-trigger" href="/AgendaWeb/Login.jsp">Loguiarse</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link js-scroll-trigger" href="#contact">Salir</a>
                    </li>
                </ul>
               
            </div>
        </div>
    </nav>
  
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
 <h1>Mis Contactos</h1>    
 <div class="table-responsive">
            <table class="table table-bordred table-striped">
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
                   <td><p data-placement="top" data-toggle="tooltip" title="Edit"><a href="/AgendaWeb/editarContacto.jsp?id=<%=cont.get(i).getId()%>" class="btn btn-primary btn-xs" >Editar</a></p></td>
                   <td><p data-placement="top" data-toggle="tooltip" title="Delete"><button class="btn btn-danger btn-xs" data-title="Delete" id="<%=cont.get(i).getId()%>" >Eliminar</button></p></td>
    
                </tr>
               <%}%>                
                </tbody>           
            </table>
    </div>

                
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
    <script src="js/scrolling-nav.js"></script>



</html>

