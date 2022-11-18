<%--DIEGO SANCHEZ--%>
<%-- 
    Document   : compra
    Created on : 14 nov. 2022, 11:39:59
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
        <%@page import="modelo.*"%>
        <%
           Conexion con= new Conexion(); 
            
           String e1= request.getParameter("pc1");
           String e2= request.getParameter("pc2");
           String e3= request.getParameter("pc3");
           String e4= request.getParameter("pc4");

           Vendedor v1= con.getVendedorById(1);
           Vendedor v2= con.getVendedorById(2);
           Vendedor v3= con.getVendedorById(3);
           
           Pc pc1= con.getPcById(1);
           Pc pc2= con.getPcById(1);
           Pc pc3= con.getPcById(1);
           Pc pc4= con.getPcById(1);
           
           Cliente cliente= (Cliente)request.getAttribute("Atrib");

           Factura f1= new Factura(cliente,pc1,v1);
           Factura f2= new Factura(cliente,pc2,v1);
           Factura f3= new Factura(cliente,pc3,v2);
           Factura f4= new Factura(cliente,pc4,v3);
        %>
       
     
        <h1>Tu compra: <%if(e1 != null){ %></h1>
        
           <%=pc1.getNombre()%><br>
           <%=con.getVendedorById(1)%><br>
           <%=pc1.calcularTotalPc()%><br>
           <p>El Vendedor Factura:</p><br>
           <%=f1.facturacionVendedor(v1)%><br>
           <% } %>
           
           <%if(e2 != null){ %></h1>
           <%=pc2.getNombre()%><br>
           <%=con.getVendedorById(1)%><br>
           <%=pc2.calcularTotalPc()%><br>
           <p>El Vendedor Factura:</p><br>
           <%=f2.facturacionVendedor(v1)%><br>
           <% } %>
           
           
           <%if(e3 != null){ %></h1>
           <%=pc3.getNombre()%><br>
           <%=con.getVendedorById(3)%><br>
           <%=pc3.calcularTotalPc()%><br>
           <p>El Vendedor Factura:</p><br>
           <%=f3.facturacionVendedor(v2)%><br>
           <% } %>
    
           <%if(e4 != null){ %></h1>
           <%=pc4.getNombre()%><br>
           <%=con.getVendedorById(4)%><br>
           <%=pc4.calcularTotalPc()%><br>
           <p>El Vendedor Factura:</p><br>
           <%=f4.facturacionVendedor(v3)%><br>
           <% } %>
           


    </body>
</html>
