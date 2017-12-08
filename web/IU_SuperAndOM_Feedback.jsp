<%-- 
    Document   : IU_SuperAndOM_AnnualFeedback
    Created on : 05-dic-2017, 15:28:28
    Author     : Soria
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="buttondiv">
            <br>
            <input type="button" value="Return" onclick="window.history.go(-1); return false;" class="btn"/>  
            <input type="button" value="View Employees" onclick="window.location.href = 'IU_Show_Employees_Super'" class="btn"/>
            <input type="button" value="Edit Brackets" onclick="window.location.href = 'IU_UPDATE_ANNUALF'" class="btn"/><br><br>
        </div>
    </body>
</html>
