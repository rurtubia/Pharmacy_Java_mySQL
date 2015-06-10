<%-- 
    Document   : eliminar
    Created on : Jun 9, 2015, 7:15:16 PM
    Author     : urtubia @ notNull
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Eliminación de Producto</h2>
        <form action="procesar_borrado.do" method="POST">
        <table border="1">
            <tbody>
                <tr>
                    <td>Codigo</td>
                    <td> <input type="text" name="txt_codigo" value="" /> </td>
                    <td> <input type="submit" value="Borrar" name="btn_borrar" /> </td>
                </tr>
            </tbody>
        </table>
        </form>
    </body>
</html>
