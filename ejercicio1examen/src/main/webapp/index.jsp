<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>CALCULAR SUELDO DE UN TRABAJADOR</title>
</head>
<body>
    <h1>CALCULAR SUELDO DE UN TRABAJADOR</h1>
    <form action="CalcularSueldo" method="post">
        <label for="nombre">Nombre: </label>
        <input type="text" id="nombre" name="nombre" required><br><br>
        
        <label for="sueldoDiario">Sueldo Diario: </label>
        <input type="number" id="sueldoDiario" name="sueldoDiario" required><br><br>
        
        <label for="diasTrabajados">Días Trabajados: </label>
        <input type="number" id="diasTrabajados" name="diasTrabajados" min="1" max="15" required><br><br>
        
        <input type="submit" value="Calcular Sueldo">
    </form>
</body>
</html>

