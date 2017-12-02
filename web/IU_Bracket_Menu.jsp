<%@ page language="java" import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
        <link href="https://fonts.googleapis.com/css?family=Nunito" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="css/newcolstyle.css">
        <title>Brackets Menu</title>
    </head>
    <body>
        <div class="buttondiv">
            <br>
            <input type="button" value="Return" onclick="window.history.go(-1); return false;" class="btn"/>  
            <input type="button" value="View Employees" onclick="window.location.href = 'IU_Show_Employees_Super'" class="btn"/>
            <input type="button" value="Edit Brackets" onclick="window.location.href = 'IU_Edit_Brackets.jsp'" class="btn"/><br><br>
        </div>
       
        <%    String DRIVER = "com.mysql.jdbc.Driver";

            Class.forName(DRIVER).newInstance();
            Connection con = null;
            ResultSet rs = null;
            Statement stmnt = null;

            try {

                String url = "jdbc:mysql://localhost:3306/embagroup";

                String user = "root";
                String password = "1234";
                con = DriverManager.getConnection(url, user, password);
                stmnt = con.createStatement();
                rs = stmnt.executeQuery("SELECT * FROM embagroup.brackets; ");
                //usr = stmt2.executeQuery("SELECT * FROM embagroup.info_empleado; ");

                while (rs.next()) {


        %>


        <div class="line-separator"></div>
        <div id="BOX" class="Bracket">
            <div id="content" >
                <h1>Bracket ID: <%=rs.getInt("ID_Bracket")%></h1>
                <div class="columns">
                    <ul>
                        <li>Name: <%=rs.getString(2)%></li>
                        <li>Experience: <%=rs.getInt("Exp")%></li>
                    </ul>         
                </div>
            </div>
        </div>



        <%            }

                rs.close();
                stmnt.close();
                con.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        %>
    </body>
</html>
