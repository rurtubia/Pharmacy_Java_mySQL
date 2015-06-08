<%-- 
    Document   : ingreso
    Created on : Jun 4, 2015, 6:41:02 PM
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
        <h2>Ingreso de Medicamento</h2>
        
        <table border="0">
            <tbody>
                <tr>
                    <td>Código</td>
                    <td> <input type="text" name="txt_codigo" value="" /> </td>
                </tr>
                <tr>
                    <td>Fármaco</td>
                    <td> <input type="text" name="txt_farmaco" value="" /> </td>
                </tr>
                <tr>
                    <td>Precio</td>
                    <td> <input type="text" name="txt_precio" value="" /> </td>
                </tr>
                <tr>
                    <td> <input type="submit" value="Ingresar" name="btn_enviar" /> </td>
                    <td></td>
                </tr>
            </tbody>
        </table>

    </body>
</html>
