<%-- 
    Document   : AgregarContacto
    Created on : 08-dic-2017, 19:38:03
    Author     : alexf
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<center><h1 class="h1">Ingresar Contacto</h1></center>
<div class="col col-sm-3"></div>
    <div class="container col col-sm-6">
        <form id="formagregar">
            
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
            
            <input class="btn btn-primary active right" type="button" id="agregar" value="Registrar">
            
            <input class="btn btn-danger active left" type="reset" value="Limpiar">
        </form>
        
    </div>
        
    
    
  