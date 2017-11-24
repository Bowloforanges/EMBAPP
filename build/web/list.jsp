<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page language="java" import="java.sql.*"%>

<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User List</title>


    </head>


    <body style="background-color:powderblue;">
        <% out.println("<a class='space' href='login.jsp'> Log Out </a>");  %> 

        <div align="center" width="200%">
            <br>
            <h2>Users:</h2>
            <br>
            <br>
            <table border="1" borderColor="black" cellPadding="0" cellSpacing="0" width="920" height="80">
                <tbody>
                <td  width="290" height="19"><b>Name</b></td>
                <td  width="290" height="19"><b>Gender</b></td>
                <td  width="230" height="19"><b>Age</b></td>
                <td  width="230" height="19"><b>Password</b></td>
                    <%
                        String DRIVER = "com.mysql.jdbc.Driver";

                        Class.forName(DRIVER).newInstance();
                        Connection con = null;
                        ResultSet rst = null;
                        ResultSet BigBoi = null;
                        ResultSet BigGal = null;
                        ResultSet Total = null;
                        Statement stmt = null;

                        String sql1 = "SELECT * FROM examen.users ORDER BY ID ASC; ";
                        String sql2 = "select Name,Age from examen.users where  Gender = 'M' order by Age desc limit 1; ";
                        String sql3 = "select Name,Age from examen.users where  Gender = 'F' order by Age desc limit 1; ";
                        String sql4 = "select max(ID) as Total from examen.users; ";

                        try {

                            String url = "jdbc:mysql://localhost:3306/examen";

                            String user = "root";
                            String password = "1234";
                            con = DriverManager.getConnection(url, user, password);
                            stmt = con.createStatement();
                            rst = stmt.executeQuery(sql1);

                            while (rst.next()) {

                    %>
                <tr>
                    <td  vAlign="top" width="80"  height="19"><%=rst.getString(2)%></td>
                    <td  vAlign="top" width="110" height="19"><%=rst.getString(3)%></td>
                    <td  vAlign="top" width="224" height="19"><%=rst.getInt("Age")%></td>
                    <td  vAlign="top" width="230" height="19"><%=rst.getString(5)%></td>
                </tr>

                <% }    %> 

                </tbody>
            </table>
        </center>
    </div>

    <%
        BigBoi = stmt.executeQuery(sql2);

        //Total = stmt.executeQuery(sql4);
        while (BigBoi.next()) {
    %>

    <br><br>
    <%="The Oldest Male is: " + BigBoi.getString("Name") + ", who has an age of: " + BigBoi.getInt("Age") + "."%>
    <br><br>

    <%
        }
        BigGal = stmt.executeQuery(sql3);
        while (BigGal.next()) {
    %>

    <br><br>
    <%="The Oldest Female is: " + BigGal.getString("Name") + ", who has an age of: " + BigGal.getInt("Age") + "."%>
    <br><br>

    <%
        }
        Total = stmt.executeQuery(sql4);
        while (Total.next()) {
    %>

    <br><br>
    <%="Finally, there are a total of " + Total.getString("Total") + " records currently."%>
    <br><br>

    <%
            }
            rst.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    %>


</body>

</html>
