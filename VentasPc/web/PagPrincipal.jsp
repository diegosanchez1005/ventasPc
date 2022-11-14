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
    <%Pc pc1= new Pc("Programmer One",5000); 
      Pc pc2= new Pc("Programmer Two",65000); 
      Pc pc3= new Pc("Gamming One",55000); 
      Pc pc4= new Pc("Gaming Two",73000); 
      
      
      Ram ram1 = new Ram("Fury","USA",8000,8);
      Procesador p1 = new Procesador("Intel I5","USA",30000,5000);
      Gabinete gab1= new Gabinete("TzLight","Arg",10000,"Negro/Led");
      
      pc1.agregarComp(ram1);
      pc1.agregarComp(p1);
      pc1.agregarComp(gab1);
    
    
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
                <div class="programing__economica">
                    <h2>Economicas para Programadores</h2>
                    <div class="pc">
                        <h3> <%= pc1.getNombre()%> </h3>
                        <div class="pc__img__container">
                            <img src="img/epc1.png" alt="">
                        </div>
                        <p><%= ram1.toString()%></p>
                        <p><%= p1.toString()%></p>
                        <p><%= gab1.toString()%></p>
                        <h2 class="precio">$<%= pc1.calcularTotalPc()%></h2>
                        <input type="submit" value="Comprar" name="eleccion">
                    </div>

                    <div class="pc">
                        <h3><%= pc2.getNombre()%></h3>
                        <div class="pc__img__container">
                            <img src="img/epc2.png" alt="">
                        </div>
                        <p>Ram 8gb</p>
                        <p>Proc Intel i5 7ma Gen</p>
                        <p>Gabinete Z</p>
                        <h2 class="precio">$<%= pc2.getPrecio()%></h2>
                        <input type="submit" value="Comprar" name="eleccion">
                    </div>
                </div>
                <div class="gamer__economica">
                    <h2>Economicas Gamers</h2>
                    <div class="pc">
                        <h3><%= pc3.getNombre()%></h3>
                        <div class="pc__img__container">
                            <img src="img/eg1.png" alt="">
                        </div>
                        <p>Ram 8gb</p>
                        <p>Proc Intel i5 7ma Gen</p>
                        <p>Gabinete Z</p>
                        <h2 class="precio">$<%= pc3.getPrecio()%></h2>
                        <input type="submit" value="Comprar" name="eleccion">
                    </div>
                    <div class="pc">
                        <h3><%= pc4.getNombre()%></h3>
                        <div class="pc__img__container">
                            <img src="img/eg2.png" alt="">
                        </div>
                        <p>Ram 8gb</p>
                        <p>Proc Intel i5 7ma Gen</p>
                        <p>Gabinete Z</p>
                        <h2 class="precio">$<%= pc4.getPrecio()%></h2>
                        <input type="submit" value="Comprar" name="eleccion">
                    </div>
                </div>
            </div>

        </form>
    </div>
</body>
</html>
