<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="contentType"
        content="text/html; charset=UTF-8">
        <title>Area de texto</title>
    </head>
    <body>
        <h1>Esta es la pagina de inicio</h1>
        <h2>Aqui se piden los datos</h2>
        <p>Hola, por favor introduce la información</p>
        <form action="paginaDestino.jsp" method="post">
            <table cellspacing="3" cellpadding="3" border="1">
                <tr>
                    <td align="right"> Nombre: </td>
                    <td><input type="text" name="nombre"> </td>
                </tr>
                <tr>
                    <td align="right"> Color favorito: </td>
                    <td><input type="text" name="color"> </td>
                </tr>
                <tr>
                    <td align="right"> Correo: </td>
                    <td><input type="text" name="mail"> </td>
                </tr>
            </table>
            <input type="reset" value="Borrar">
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>