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
    <link rel="stylesheet" href="style.css">
    <title>Document</title>
</head>
<body>
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
       <form action="">
            <div class="economicas__container">
                <div class="programing__economica">
                    <h2>Economicas para Programadores</h2>
                    <div class="pc">
                        <h3>TRX 3100</h3>
                        <div class="pc__img__container">
                            <img src="img/epc1.png" alt="">
                        </div>
                        <p>Ram 8gb</p>
                        <p>Proc Intel i5 7ma Gen</p>
                        <p>Gabinete Z</p>
                        <h2 class="precio">$6000</h2>
                        <input type="submit" value="Comprar">
                    </div>

                    <div class="pc">
                        <h3>TRX 3100</h3>
                        <div class="pc__img__container">
                            <img src="img/epc2.png" alt="">
                        </div>
                        <p>Ram 8gb</p>
                        <p>Proc Intel i5 7ma Gen</p>
                        <p>Gabinete Z</p>
                        <h2 class="precio">$6000</h2>
                        <input type="submit" value="Comprar">
                    </div>
                </div>
                <div class="gamer__economica">
                    <h2>Economicas Gamers</h2>
                    <div class="pc">
                        <h3>TRX 3100</h3>
                        <div class="pc__img__container">
                            <img src="img/eg1.png" alt="">
                        </div>
                        <p>Ram 8gb</p>
                        <p>Proc Intel i5 7ma Gen</p>
                        <p>Gabinete Z</p>
                        <h2 class="precio">$6000</h2>
                        <input type="submit" value="Comprar">
                    </div>
                    <div class="pc">
                        <h3>TRX 3100</h3>
                        <div class="pc__img__container">
                            <img src="img/eg2.png" alt="">
                        </div>
                        <p>Ram 8gb</p>
                        <p>Proc Intel i5 7ma Gen</p>
                        <p>Gabinete Z</p>
                        <h2 class="precio">$6000</h2>
                        <input type="submit" value="Comprar">
                    </div>
                </div>
            </div>
            
        </form>
    </div>
</body>
</html>
