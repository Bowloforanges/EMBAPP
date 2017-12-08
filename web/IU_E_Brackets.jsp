<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page language="java" import="java.sql.*"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Brackets</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width,initial-scale=1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
        <link href="https://fonts.googleapis.com/css?family=Nunito" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="css/newcolstyle.css">


    </head>
    <body>


        <%
        String sid = request.getParameter("sid");
        int id = Integer.parseInt(sid);
        %>

        <div class="buttondiv">
            <br>
            <input type="button" value="Return" onclick="window.history.go(-1); return false;" class="btn"/><br><br>
        </div>
        <%    String DRIVER = "com.mysql.jdbc.Driver";

            Class.forName(DRIVER).newInstance();
            Connection con = null;
            ResultSet rs = null;
            Statement stmnt = null;

            try {

                String url = "jdbc:mysql://localhost:3306/test";

                String user = "root";
                String password = "1234";
                con = DriverManager.getConnection(url, user, password);
                stmnt = con.createStatement();
                rs = stmnt.executeQuery("select Bracket_ID, Bracket_Name, Bracket_Desc_Description ,Bracket_exp,Bracket_Emp_Status from brackets natural join bracket_desc natural join bracket_emp where Emp_ID = " + sid + " order by Bracket_ID asc;");
                //usr = stmt2.executeQuery("SELECT * FROM embagroup.info_empleado; ");

                while (rs.next()) {


        %>



        <div class="line-separator"></div>
        <div id="BOX" class="Bracket">
            <div id="content" >
                <h1>Bracket Name: <%=rs.getString(2)%>, Accomplished: <%=rs.getString(5)%></h1>
                <div class="columns">
                    <ul>
                        <li>Description: <%=rs.getString(3)%></li>
                        <li>Experience per Bracket: <%=rs.getInt("Bracket_Exp")%></li>
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