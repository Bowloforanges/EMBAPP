<%-- 
    Document   : insert
    Created on : 22-nov-2017, 20:56:08
    Author     : Soria
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        <link rel="stylesheet" href="style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body style="background-color:powderblue;">
        
        <h1>Please Register:</h1>
        <form method="POST" action="save.jsp">
        <table style="width:60%">
            <tr>
                <th>Name</th>
                <th>Gender</th> 
                <th>Age</th>
                <th>Password</th>
            </tr>
            <tr>
                <td><input type="text" name="InsertName"></td>
                <td><input type="text" name="InsertGender"></td> 
                <td><input type="text" name="InsertAge"></td>
                <td><input type="text" name="InsertPass"></td>
            </tr>
        </table>
        <input type="submit" value="Register">
        </form>
    </body>
</html>
