<%-- 
    Document   : editarContacto
    Created on : 02-ene-2018, 16:21:51
    Author     : alexf
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Clases.Contacto"%>
<%@page import="Clases.Consultas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


    <% 
    int id =Integer.parseInt( request.getParameter("id") );
    String sql="select * from contacto where contactoId="+id;
    Consultas cs = new Consultas();
    
    ArrayList<Contacto>ListaContacto = (ArrayList<Contacto>)cs.Buscar(sql);
  
    %>


  <center><h1 class="h1">Editar Contacto</h1></center>
<div class="col col-sm-3"></div>
    <div class="container col col-sm-6">
        <form action="Editor" method="POST">
            <%
             for(int i=0;i < ListaContacto.size();i++ ){
            %>
                <div class="form-group">
                <label for="id" >Id:</label>
                <input type="text" class="form-control" value="<%=ListaContacto.get(i).getId()%>" id="id" name="id" readonly>
                </div>
                
                <div class="form-group">
                <label for="nombre" >Nombre:</label>
                <input type="text" class="form-control" value="<%=ListaContacto.get(i).getNombre()%>" id="nombre" name="nombre" required>
                </div>
                
                <div class="form-group">
                <label for="apellido"  >Apellido:</label>
                <input type="text" class="form-control" value="<%=ListaContacto.get(i).getApellido()%>" id="apellido" name="apellido" required/>
                </div>
                
                <div class="form-group">
                <label for="correo"  >Correo</label>
                <input type="email" class="form-control" value="<%=ListaContacto.get(i).getCorreo()%>" id="correo" name="correo"/>
                </div>
            
                <div class="form-group">
                <label for="telefono"  >Telefono</label>
                <input type="text" class="form-control" id="telefono" value="<%=ListaContacto.get(i).getTelefono()%>" name="telefono" required/>
                </div>
            
                <div class="form-group">
                <label for="direccion"  >Direccion</label>
                <input type="text" class="form-control" id="direccion" value="<%=ListaContacto.get(i).getDireccion()%>" name="direccion"/>
                </div>
            
            <input class="btn btn-primary active right" type="submit" value="Editar">
            
            <input class="btn btn-danger active left" type="reset" value="Limpiar">
            <%}%>
        </form>
        
    </div>
        
    

