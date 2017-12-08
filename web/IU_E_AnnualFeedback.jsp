<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page language="java" import="java.sql.*"%>


<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>ERROR</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="buttonstyle.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" type="text/css" href="css/newcolstyle.css">


        <style type="text/css">
            .bs-example{
                margin: 20px;
            }
        </style>

    </head>
    <body>
        <br>
        <div class="buttondiv">
            <input type="button" value="Return" onclick="window.history.go(-1); return false;" class="btn"/><br>
        </div>
        <hr>

        <%
            String DRIVER = "com.mysql.jdbc.Driver";

            Class.forName(DRIVER).newInstance();
            Connection con = null;
            ResultSet rs = null;
            Statement stmnt = null;
            String sid = request.getParameter("sid");
            int id = Integer.parseInt(sid);

            try {

                String url = "jdbc:mysql://localhost:3306/test";

                String user = "root";
                String password = "1234";
                con = DriverManager.getConnection(url, user, password);
                stmnt = con.createStatement();
                rs = stmnt.executeQuery("SELECT * FROM test.ann_feed natural join test.feedback where Emp_ID = " + sid + ";");
                //usr = stmt2.executeQuery("SELECT * FROM embagroup.info_empleado; ");

                while (rs.next()) {


        %>

        <div class="bs-example">

            <div class="alert alert-danger fade in">

                <a href="#" class="close" data-dismiss="alert">&times;</a>
                <strong>Attention!</strong> Your next Annual Feedback will be on "<%=rs.getString(2)%>".

            </div>

        </div>

        <%                }

                rs.close();
                stmnt.close();
                con.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        %>


        <hr>
        <div class="bs-example">
            <div class="alert alert-danger fade in">

                <a href="#" class="close" data-dismiss="alert">&times;</a>
                <strong>Sorry!</strong> You have no Feedback avaliable at the moment.

            </div>

        </div>
    </body>
</html>              