<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Contador de Visitas</title>
</head>
<body>
    <h1>Contador de Visitas</h1>
    <p>Esta página ha sido visitada <%= request.getAttribute("contadorVisitas") %> veces.</p>
</body>
</html>
