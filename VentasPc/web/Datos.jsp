<%-- 
    Document   : Datos
    Created on : 7 nov 2022, 22:11:57
    Author     : Diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@ page import="modelo.Cliente" %>
        <% Cliente c1= (Cliente) request.getAttribute("atrib"); %>
        
        <h1>Tus datos:</h1>
        <p>Nombre: <%= c1.getNombre()%> </p><br>
        <p>Apellido: <%= c1.getApellido()%> </p><br>
        <p>Direccion: <%= c1.getDirec()%> </p><br>
        <p>Telefono: <%= c1.getTelefono()%> </p><br>
        <p>Correo: <%= c1.getCorreo()%> </p><br>
        
        
    </body>
</html>
