<%-- 
    Document   : listaChofer
    Created on : 31-ene-2019, 10:14:39
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
        <h1>Listado de Choferes</h1>
        
        <table border="1">
            
            <tr><th>Nombre</th><th>Total de Viajes</th><th>Total Facturado</th></tr>
            
            <c:forEach items="${lista}" var="C">
                <tr><td>${C.nombreChofer}</td><td>${C.viajes}</td><td>${C.facturacion}</td></tr>
            </c:forEach>
        </table>
        <br>
        <br>
        <a href="index.html">Volver</a>
    </body>
</html>
