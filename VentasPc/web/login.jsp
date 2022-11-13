<%-- 
    Document   : login
    Created on : 13 nov 2022, 19:12:12
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
        <%@ page import="controller.Login" %>
        
        <form action="Login" method="post">
            <input type="text" name="user">
            <input type="submit">
        </form>
    </body>
</html>
