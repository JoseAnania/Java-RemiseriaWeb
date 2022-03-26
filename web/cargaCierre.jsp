<%-- 
    Document   : cargaCierre
    Created on : 31-ene-2019, 10:01:57
    Author     : José
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Remisería</title>
    </head>
    <body>
        <h1>Carga de Cierres</h1>
        
        <form method="post" action="ServletCargaCierre">
            Chofer: <select name="cboChofer" id="cboChofer" required="requiered">
                <option value="" disabled selected> Seleccione el Chofer: </option>
                    <c:forEach items="${lista}" var="C">
                        <option value=${C.idChofer}>${C.nombreChofer}</option>
                    </c:forEach>               
            </select>
            <br>
            <br>
            Auto: <select name="cboAuto" id="cboAuto" required="requiered">
                <option value="" disabled selected> Seleccione el Auto: </option>
                    <c:forEach items="${lista2}" var="A">
                        <option value=${A.idAuto}>${A.denominacion}</option>
                    </c:forEach>               
            </select>
            <br>
            <br>
            <label form="viajes">Viajes: </label>
            <input type="text" name="viajes"/>
            <br>
            <br>
            <label form="facturacion">Facturación: </label>
            <input type="text" name="facturacion"/>
            <br>
            <br>
            <input type="submit" value="Aceptar"/>
        </form>
        <br>
        <br>
        <a href="index.html">Volver</a>
    </body>
</html>
