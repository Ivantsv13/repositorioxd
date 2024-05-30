<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="contentType"
        content="text/html; charset=UTF-8">
        <title>Pagina destino</title>
    </head>
    <body>
        <%
        String nombre = request.getParameter("nombre");
        String color = request.getParameter("color");
        String mail = request.getParameter("mail");
        %>
        <h1>Esta es la página destino</h1>
        <h2>Aqui se despliga los datos que se recibieron</h2>
        <p>Tus datos son los siguientes:</p>
        <table cellspacing="3" cellpadding="3" border="1">
            <tr>
                <td align="right"> Te llamas: </td>
                <td><%= nombre %></td>
            </tr>
            <tr>
                <td align="right"> Tu color favorito es: </td>
                <td><%= color %></td>
            </tr>
            <tr>
                <td align="right"> Y tu correo es: </td>
                <td><%= mail %></td>
            </tr>
        </table>
        <form action="index.jsp" method="post">
            <input type="submit" value="Regresar">
        </form>
    </body>
</html>