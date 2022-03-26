<%-- 
    Document   : reporte2
    Created on : 31-ene-2019, 10:28:52
    Author     : José
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Remiseria</title>
    </head>
    <body>
        <h1>Cantidad de Viajes por tipo de Auto (según plazas)</h1>
        
        <table border="1">
            
            <tr><th>Plazas</th><th>Total de Viajes</th></tr>
            
            <c:forEach items="${lista}" var="A">
                <tr><td>${A.plazas}</td><td>${A.viajes}</td></tr>
            </c:forEach>
        </table>
        <br>
        <br>
        <a href="index.html">Volver</a>
    </body>
</html>
