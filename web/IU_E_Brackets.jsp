<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page language="java" import="java.sql.*"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Brackets</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width,initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="css/newcolstyle.css">
        <link href="https://fonts.googleapis.com/css?family=Nunito" rel="stylesheet">

    </head>
    <body>

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
        <div class="line-separator"></div>


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