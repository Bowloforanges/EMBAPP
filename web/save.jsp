<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page language="java" import="java.sql.*,java.util.*,java.text.*" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-color:powderblue;">

        <%
out.println("<style>  p {font-family: arial;"
           + " color: red; font-size: 16;   }; "
           + "</style>");
out.println("<style>  a,b {font-family: arial;"
           + " color: blue; font-size: 16;   }; "
           + "</style>");

        %>
        
        <%
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/";;
        String db = "examen";
        String driver = "com.mysql.jdbc.Driver";
        try{
            Class.forName(driver);
            con = DriverManager.getConnection(url+db,"root","1234");
        try   {
            Statement st = con.createStatement();
            String Name=request.getParameter("InsertName");
            String Gender=request.getParameter("InsertGender");
            String Age=request.getParameter("InsertAge");
            String Pass=request.getParameter("InsertPass");
            
            int val = st.executeUpdate("INSERT into examen.users (Name,Gender,Age,Password) "
                    + " VALUES ('"+Name+"','"+Gender+"','"+Age +"','"+Pass+"')");

            con.close();
            response.sendRedirect("list.jsp");
              }
            catch (SQLException ex){
            System.out.println("SQL statement is not executed!");
                                   }
        }
        catch (Exception e){
        e.printStackTrace();
        }

        %>
        
    </body>
</html>

