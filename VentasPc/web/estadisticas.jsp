<%--DIEGO SANCHEZ--%>
<%-- 
    Document   : estadisticas
    Created on : 17 nov 2022, 00:17:55
    Author     : Diego
--%>

<%@page import="modelo.Cliente"%>
<%@page import="java.util.Arrays"%>
<%@page import="modelo.Pc"%>
<%@page import="modelo.Conexion"%>
<%@page import="modelo.Factura"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="estadistica.css">
        <title>JSP Page</title>
    </head>
    <body>
        <%  Conexion con = new Conexion();
            ArrayList<Factura> facturas = con.devolverFacturas();
            
    //ACA SACAMOS DEL ARRAYLIST DE FACTURAS CUAL FUE LA PC MAS REPETIDA, ES DECIR LA MAS COMPRADA        
            Pc pcMasComprada = new Pc();
            int[] ids = new int[4];
            
            for(Factura f: facturas){
                int id= f.getPc().getId();
                switch(id){
                case 1:
                    ids[0]+= 1;
                    break;
                case 2:
                    ids[1]+= 1;
                    break;
                case 3:
                    ids[2]+= 1;
                    break;
                case 4:
                    ids[3]+= 1;
                    break;
                }
            }
            int mayor= 0;
            int idMayor= 0;
            for(int i = 0; i < ids.length; i++){
                if(ids[i]>mayor ){
                mayor= ids[i];
                idMayor= i;
            }
            }
            pcMasComprada= con.getPcById(idMayor+1);
        %>
        
        <h1>Nuestra Pc mas Comprada: <%= pcMasComprada.getNombre()%></h1>
        <h2>Lo facturado el Ultimo CyberMonday es:  <%=con.cyber()%></h2>
        
        
    </body>
</html>
