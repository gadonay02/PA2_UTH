<%-- 
    Document   : frmJuego
    Created on : 23-mar-2019, 8:07:19
    Author     : eliucinho
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>uth</title>
    </head>
    <%
        int noExito=Integer.parseInt(request.getSession().getAttribute("noExito").toString());
        int noError=Integer.parseInt(request.getSession().getAttribute("noError").toString());
        int noIntento=Integer.parseInt(request.getSession().getAttribute("noIntento").toString());
        int resultadoFormula=Integer.parseInt(request.getSession().getAttribute("resultadoFormula").toString());
        String fraseFormula=(String)request.getSession().getAttribute("fraseFormula");
        String fraseExito=(String)request.getSession().getAttribute("fraseExito");
        String fraseError=(String)request.getSession().getAttribute("fraseError");
        

    %>
    <body>
        <h1>Bienvenido a juego de matematicas!</h1>
        <%
            if (!fraseExito.equals("")) {
                out.println("<p style=\"color:green\">"+fraseExito+"</p>");
            }
            if (!fraseError.equals("")) {
                out.println("<p style=\"color:red\">"+fraseError+"</p>");
            }
        %>
        <h3>¿cuanto es <%=fraseFormula%>?</h3>
        <form action="../servletJuegoControlador" method="post">
            Respuesta:
            <input type="text" name="respuestaUsuario">
            <br>
            <input type="submit" value="contestar">            
        </form>
        <br>
        <a href="frmResultados.jsp"><p>Salir</p></a>
    </body>
</html>
