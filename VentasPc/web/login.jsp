<%--GONZALO GIMENEZ--%>
<%-- 
    Document   : login
    Created on : 14 nov. 2022, 10:22:17
    Author     : localuser
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="login.css"/>
        <title>JSP Page</title>
    </head>
    <body>
        
        <%@ page import="controller.Login" %>
        
        <div class="container">
            <h1>Ingresa tu Correo</h1>
        <form action="Login" method="post">
            <input class="correo" type="text" name="user">
            <input type="submit">
        </form>
        </div>
    </body>
</html>
