<%-- 
    Document   : Registrar
    Created on : 7 nov 2022, 21:29:28
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
        <%@ page import="controller.Registro" %>
        <%@ page import="modelo.*" %>
        
      <%
      //  Cliente c=new Cliente("dylan","seltzer","tucumas",233444,"dylancapo");
        //Conexion con= new Conexion();
        //con.agregarCliente(c);
      %>
        <form action="Registro" method="POST">
            <table>
                <tr>
                    <td>
                        Nombre:
                        <input type="text" name="nombre">
                    </td>
                </tr>
                 <tr>
                    <td>
                        Apellido
                        <input type="text" name="apellido">
                    </td>
                 </tr><!-- comment -->
                  <tr>
                    <td>
                        Direccion
                        <input type="text" name="direccion">
                    </td>
                  </tr><!-- comment -->
                   <tr>
                    <td>
                        Telefono
                        <input type="text" name="telefono">
                    </td>
                </tr>
                 <tr>
                    <td>
                        Correo
                        <input type="text" name="correo">
                    </td>
                </tr>
            </table>
            <button type="submit">Enviar</button>
        </form>
    </body>
</html>
