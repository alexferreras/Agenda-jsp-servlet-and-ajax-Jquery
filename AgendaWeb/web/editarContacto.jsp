<%-- 
    Document   : editarContacto
    Created on : 02-ene-2018, 16:21:51
    Author     : alexf
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
    <!--Adamix method -->


</head>

<body id="page-top">

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

    
<br><br><br>
<br><br><br> 
  <center><h1 class="h1">Editar Contacto</h1></center>
    
    <div class="container col col-sm-6">
        <form action="HomeRegistro" method="POST">
            
                <div class="form-group">
                <label for="nombre" >Nombre:</label>
                <input type="text" class="form-control" id="nombre" name="nombre" required>
                </div>
                
                <div class="form-group">
                <label for="apellido"  >Apellido:</label>
                <input type="text" class="form-control" id="apellido" name="apellido" required/>
                </div>
                
                <div class="form-group">
                <label for="correo"  >Correo</label>
                <input type="email" class="form-control" id="correo" name="correo"/>
                </div>
            
                <div class="form-group">
                <label for="telefono"  >Telefono</label>
                <input type="text" class="form-control" id="telefono" name="telefono" required/>
                </div>
            
                <div class="form-group">
                <label for="direccion"  >Direccion</label>
                <input type="text" class="form-control" id="direccion" name="direccion"/>
                </div>
            
            <input class="btn btn-primary active right" type="submit" value="Registrar">
            
            <input class="btn btn-danger active left" type="reset" value="Limpiar">
        </form>
        
    </div>
        
    
          
          
      </div>
     
    </body>
</html>
