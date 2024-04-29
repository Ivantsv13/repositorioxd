<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html  lang="es-mx">
<head>
    <meta charset="UTF-8">
    <title>Calculadora</title>
</head>
<body>
    <h2>Calculadora</h2>
    <form action="CalculatorServlet" method="post">
        <input type="numero" name="a" placeholder="Ingrese el primer número" required><br>
        <input type="numero" name="b" placeholder="Ingrese el segundo número" required><br>
        <select name="operador">
            <option value="suma">Suma</option>
            <option value="resta">Resta</option>
            <option value="multiplicacion">Multiplicación</option>
            <option value="division">División</option>
        </select><br>
        <button type="submit">Calcular</button>
    </form>
</body>
</html>