 
 
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<h1 class=" animated infinite swing">Ingresa tus datos Doctor y unace!</h1>
<form  class="formulario" id="registroform" >
			<h2 class="titulo animated bounceInDown">Ingresar datos</h2>
			<div class="contenedor-inputs">
			<input type="text" name="rnombre"  placeholder="Nombre" required class="input-50 input">
			<input type="text" name="rapellido"  placeholder="Apellidos" required class="input-50  input">
			<input type="email" name="rcorreo"  placeholder="Correo" required class="input-50 input">
			
			<input type="password" name="psw"  placeholder="Contraseña" required class="input-50 input">
			
			<input id="nuevoUser" type="button" value="Registrate" class="boton input">
			<input type="reset" value="Borrar Datos" class="boton input">
		</form>	