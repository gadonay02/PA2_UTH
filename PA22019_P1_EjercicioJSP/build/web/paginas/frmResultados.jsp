<%-- 
    Document   : frmResultados
    Created on : 23-mar-2019, 8:07:27
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
        noIntento--; //debido a que se queda un intento en blanco, se resta el menos menos
        
        String usuario=(String)request.getSession().getAttribute("usuario");
        
    %>
    <body>
        <h1>Los resultados de <%=usuario%>!</h1>
        <h4>Exito: <%=noExito%></h4>
        <h4>Error: <%=noError%></h4>
        <h4>Numero de intentos: <%=noIntento%></h4>
        
        <a href="frmInicio.jsp"><p>Volver a Jugar</p></a>
    </body>
</html>
