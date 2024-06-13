<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Resultado del Préstamo</title>
</head>
<body>
<h1>Resultado del Préstamo</h1>
<p>El pago mensual es:</p>
<ul>
    <%
        double pagoMensual = (Double)request.getAttribute("pagoMensual");
        int plazo = Integer.parseInt(request.getParameter("plazo"));

        double pagoMensualFijo = pagoMensual;
        pagoMensualFijo = Math.round(pagoMensualFijo * 100.0) / 100.0;

        for (int i = 1; i <= plazo; i++) { %>
    <li>Mes <%= i %>: $<%= pagoMensualFijo %></li>
    <% } %>
</ul>
</body>
</html>
