<%-- 
    Document   : eliminarContacto
    Created on : 05-ene-2018, 20:55:09
    Author     : alexf
--%>


<%@page import="Clases.Consultas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            int id= Integer.parseInt(request.getParameter("id"));
            Consultas cs = new Consultas();
            cs.eliminar(id);
            RequestDispatcher rd= request.getRequestDispatcher("index.jsp?page=inicio");
            rd.forward(request, response);
        %>
        
        
        
    </body>
</html>
