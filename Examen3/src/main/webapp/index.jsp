
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Calculadora de Préstamo</title>
</head>
<body>
<h1>Calculadora de Préstamo</h1>
<form action="prestamo" method="post">
    <label for="cantidad">Cantidad Solicitada:</label>
    <input type="number" id="cantidad" name="cantidad" required><br><br>

    <label for="plazo">Plazo a Pagar (hasta 12 meses):</label>
    <input type="number" id="plazo" name="plazo" min="1" max="12" required><br><br>

    <button type="submit">Calcular</button>
</form>
</body>
</html>
