<%-- 
    Document   : index
    Created on : 22/07/2016, 08:51:26 PM
    Author     : homero
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingresar</title>
    </head>
    <body>
        <h1>Ingresar</h1>
        
        <form action="Iniciar" method="post">
            <label>Usuario</label>
            <input type="text" name="usuario"/><br>
             <label>Contraseña</label>
            <input type="password" name="pass"/><br>
            <input type="submit" value="Iniciar Sesion"/>


        </form>
        <br>
        
        ¿No tienes una cuenta?<a href="Registro.jsp">Registrarme</a>
    </body>
</html>
