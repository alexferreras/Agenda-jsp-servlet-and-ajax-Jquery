<%-- 
    Document   : login
    Created on : 10-ene-2018, 13:16:33
    Author     : alexf
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<form id="loginform"  class="formulario animated bounceInLeft " accept-charset="utf-8">
		<h2 class="titulo animated bounceInDown" >Ingrese sus Datos</h2>
		<div>
		<input type="email" name="correo" placeholder="Correo" class="correo input"  required/>
		<input type="password" name="contraseña" class=" input"  placeholder="Contraseña" required/>
		<br>
                <div id="msj" style="color: red;" ></div>
                <br>
                <input type="button" id="loginaction" class="boton input" name="Entrar" value="Entrar"/>
		<input type="reset" class="boton input" name="Borrar" value="Limpiar"/>
		</div>
		<p class="registrarse">¿ya tienes una cuenta? no? <a href="index.html?page=Registrar" class="rel">Ingresa aquí,</a>
		</p>
</form>
