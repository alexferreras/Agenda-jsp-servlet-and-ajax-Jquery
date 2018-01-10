<%-- 
    Document   : editarContacto
    Created on : 02-ene-2018, 16:21:51
    Author     : alexf
--%>

<%@page import="Clases.ContactoDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Pojo.Contacto"%>


    <% 
    int id =Integer.parseInt( request.getParameter("id") );
    String sql="select * from contacto where contactoId="+id;
    ContactoDao cs = new ContactoDao();
    
    ArrayList<Contacto>ListaContacto = (ArrayList<Contacto>)cs.Buscar(sql);
  
    %>


  <center><h1 class="h1">Editar Contacto</h1></center>
<div class="col col-sm-3"></div>
    <div class="container col col-sm-6">
        <form id="formeditor">
            <%
             for(int i=0;i < ListaContacto.size();i++ ){
            %>
                <div class="form-group">
                <label for="id" >Id:</label>
                <input type="text" class="form-control" value="<%=ListaContacto.get(i).getId()%>" id="id" name="id" readonly>
                </div>
                
                <div class="form-group">
                <label for="ednombre" >Nombre:</label>
                <input type="text" class="form-control" value="<%=ListaContacto.get(i).getNombre()%>"  name="ednombre" required>
                </div>
                
                <div class="form-group">
                <label for="edapellido"  >Apellido:</label>
                <input type="text" class="form-control" value="<%=ListaContacto.get(i).getApellido()%>"  name="edapellido" required/>
                </div>
                
                <div class="form-group">
                <label for="edcorreo"  >Correo</label>
                <input type="email" class="form-control" value="<%=ListaContacto.get(i).getCorreo()%>"  name="edcorreo"/>
                </div>
            
                <div class="form-group">
                <label for="edtelefono"  >Telefono</label>
                <input type="text" class="form-control"  value="<%=ListaContacto.get(i).getTelefono()%>" name="edtelefono" required/>
                </div>
            
                <div class="form-group">
                <label for="eddireccion"  >Direccion</label>
                <input type="text" class="form-control"  value="<%=ListaContacto.get(i).getDireccion()%>" name="eddireccion" />
                </div>
            
                <input class="btn btn-primary active right" type="button" id="editar" value="Editar">
            
            <%}%>
        </form>
        
    </div>
        
    

