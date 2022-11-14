<%-- 
    Document   : Registrar
    Created on : 7 nov 2022, 21:29:28
    Author     : Diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="indexStyle.css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@ page import="controller.Registro" %>
        <%@ page import="modelo.*" %>
        
      <header>
        <div class="logo__container">
            <h1>Nombre de la pag</h1>
        </div>
        <div class="login">
            <p>¿Tienes una cuenta?</p>
            <a href="login.jsp">Logearme</a>
        </div>
    </header>
    <div class="all__container">
        <div class="form__container">
            <form action="Registro" method="POST">

                <div class="input__container">
                    <h4>Nombre:  </h4>  
                    <input type="text" name="nombre">
                </div>

                <div class="input__container">
                    <h4>Apellido:</h4>
                    <input type="text" name="apellido">
                </div>

                <div class="input__container">
                    <h4>Direccion:</h4>
                    <input type="text" name="direccion">
                </div>

                <div class="input__container">
                    <h4>Telefono:</h4>
                    <input type="text" name="telefono">
                </div>

                <div class="input__container">
                    <h4>Correo:</h4>
                    <input type="text" name="correo">
                </div>


                <button class="submit" type="submit">Enviar</button>
            </form>
        </div>
        <div class="img__logo_container">
            <img src="img/logo_pag.png" alt="">
        </div>
    </div>  
    </body>
</html>
