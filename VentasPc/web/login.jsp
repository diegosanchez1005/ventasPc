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
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%@ page import="controller.Login" %>

        <form action="Login" method="post">
            <input type="text" name="user">
            <input type="submit">
        </form>
    </body>
</html>
