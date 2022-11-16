<%-- 
    Document   : Datos
    Created on : 7 nov 2022, 22:11:57
    Author     : Diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="style.css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
  <body>
    <%@page import="modelo.*"%>
    <%
      Vendedor v1= new Vendedor("Caleb",1123564);  
      Vendedor v2= new Vendedor("Cristian",157738);  
      Vendedor v3= new Vendedor("Dylan",1136789);  
      
        
      Pc pc1= new Pc("HP Atlon One",5000,v1); 
      Pc pc2= new Pc("HP All In One",5000,v1); 
      Pc pc3= new Pc("Gaming InPlus",15000,v2); 
      Pc pc4= new Pc("Gaming AMD",20000,v3); 
      
      
      Ram ram1 = new Ram("Fury","USA",8000,8);
      Ram ram2 = new Ram("LXR","Arg",13000,16);
      Ram ram3 = new Ram("Fury","USA",5500,4);
      Ram ram4 = new Ram("HP","USA",7000,8);
      
      
      Procesador p1 = new Procesador("Intel I5","USA",30000,3500);
      Procesador p2 = new Procesador("Intel I7","USA",45000,4800);
      Procesador p3 = new Procesador("AMD Rayzen 5","Arg",40000,3900);
      Procesador p4 = new Procesador("AMD Rayzen 7","USA",50000,5100);
      
      
      Gabinete gab1= new Gabinete("HP","USA",10000,"Negro/Led");
      Gabinete gab2= new Gabinete("HP","Arg",8000,"Negro Mate");
      Gabinete gab3= new Gabinete("TzLight","Arg",10000,"Negro/Led");
      Gabinete gab4= new Gabinete("Velor","Arg",10000,"Negro/Led");
      
      pc1.agregarComp(ram1);
      pc1.agregarComp(p1);
      pc1.agregarComp(gab1);
      
      pc2.agregarComp(ram2);
      pc2.agregarComp(p2);
      pc2.agregarComp(gab2);
      
      pc3.agregarComp(ram3);
      pc3.agregarComp(p3);
      pc3.agregarComp(gab3);
      
      pc4.agregarComp(ram4);
      pc4.agregarComp(ram4);
      pc4.agregarComp(p4);
      pc4.agregarComp(gab4);

    %>
    <header>
        <div class="logo__container">
            <div class="logo">
                <img src="img/logo_pag.png" alt="">
            </div>
        </div>
        <div class="links">
            <a href="#">Inicio</a>
            <a href="#">About us</a>
            <a href="#">Estadisticas</a>
        </div>
    </header>
    <div class="Main">

        <h1>Bienvenidos a TecnoWorld</h1>
       <form action="Compra">
            <div class="economicas__container">
                <div class="pcs__container">
                    <h2>Computadoras HP</h2>
                    <div class="pc">
                        <h3> <%= pc1.getNombre()%> </h3>
                        <div class="pc__img__container">
                            <img src="img/epc1.png" alt="">
                        </div>
                        <p><%= ram1.toString()%></p>
                        <p><%= p1.toString()%></p>
                        <p><%= gab1.toString()%></p>
                        <h3>Publicado por <%=pc1.toString()%></h3>
                        <h2 class="precio">$<%= pc1.calcularTotalPc()%></h2>
                        <input type="submit" value="Comprar" name="pc1">
                    </div>

                    <div class="pc">
                        <h3><%= pc2.getNombre()%></h3>
                        <div class="pc__img__container">
                            <img src="img/epc2.png" alt="">
                        </div>
                       <p><%= ram2.toString()%></p>
                        <p><%= p2.toString()%></p>
                        <p><%= gab2.toString()%></p>
                        <h3>Publicado por <%=pc2.toString()%></h3>
                        <h2 class="precio">$<%= pc2.calcularTotalPc()%></h2>
                        <input type="submit" value="Comprar" name="pc2">
                    </div>
                </div>
                <div class="pcs__container">
                    <h2>Computadoras Armadas</h2>
                    <div class="pc">
                        <h3><%= pc3.getNombre()%></h3>
                        <div class="pc__img__container">
                            <img src="img/eg1.png" alt="">
                        </div>
                        <p><%= ram3.toString()%></p>
                        <p><%= p3.toString()%></p>
                        <p><%= gab3.toString()%></p>
                        <h3>Publicado por <%=pc3.toString()%></h3>
                        <h2 class="precio">$<%= pc3.calcularTotalPc()%></h2>
                        <input type="submit" value="Comprar" name="pc3">
                    </div>
                    <div class="pc">
                        <h3><%= pc4.getNombre()%></h3>
                        <div class="pc__img__container">
                            <img src="img/eg2.png" alt="">
                        </div>
                        <p><%= ram4.toString()%></p>
                        <p><%= p4.toString()%></p>
                        <p><%= gab4.toString()%></p>
                        <h3>Publicado por <%=pc4.toString()%></h3>
                        <h2 class="precio">$<%= pc4.calcularTotalPc()%></h2>
                        <input type="submit" value="Comprar" name="pc4">
                    </div>
                </div>
            </div>

        </form>
    </div>
</body>
</html>
