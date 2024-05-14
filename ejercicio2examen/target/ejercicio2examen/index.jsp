<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Resultado de la ecuación</title>
</head>
<body>
    <h2>Calculadora de Ecuaciones de Segundo Grado</h2>
    <form action="ResolverEcuacion" method="post">
        <label for="a">a:</label>
        <input type="text" id="a" name="a"><br><br>
        <label for="b">b:</label>
        <input type="text" id="b" name="b"><br><br>
        <label for="c">c:</label>
        <input type="text" id="c" name="c"><br><br>
        <input type="submit" value="Calcular">
    </form>
    
    <hr>
    
    <h2>Resultado de la ecuación:</h2>
    <% 
        double[] soluciones = (double[]) request.getAttribute("soluciones");
        double[] solucionesComplejas = (double[]) request.getAttribute("solucionesComplejas");
        if (soluciones != null) {
    %>
        <p>Las raíces reales son: <%= soluciones[0] %> y <%= soluciones[1] %></p>
    <% } else if (solucionesComplejas != null) { %>
        <p>Las raíces complejas son: <%= solucionesComplejas[0] %> + <%= solucionesComplejas[1] %>i y <%= solucionesComplejas[2] %> - <%= solucionesComplejas[3] %>i</p>
    <% } %>
</body>
</html>

