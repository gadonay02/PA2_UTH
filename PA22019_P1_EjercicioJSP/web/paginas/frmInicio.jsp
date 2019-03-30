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
        <title>Avanzada 2</title>
    </head>
    <body>
        <h1>Juego de operaciones matematicas!</h1>
        <form action="../servletInicioControlador" method="post">
            Usuario:
            <input type="text" name="usuario">
            <br><br>
            Universidad:
            <input type="text" name="universidad">
            <br>
            <input type="submit" value="ingresar">
        </form>
    </body>
</html>
