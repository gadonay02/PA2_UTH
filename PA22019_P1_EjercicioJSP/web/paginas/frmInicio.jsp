<%-- 
    Document   : frmInicio
    Created on : 23-mar-2019, 8:07:11
    Author     : eliucinho
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>uth</title>
    </head>
    <body>
        <h1>Bienvenido a juego de matematicas!</h1>
        <form action="../servletInicioControlador" method="post">
            Usuario:
            <input type="text" name="usuario">
            <br>
            <input type="submit" value="ingresar">
        </form>
    </body>
</html>
