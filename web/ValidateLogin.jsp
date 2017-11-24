<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page language="java" import="java.sql.*"%>

<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Validating</title>

    </head>


    <body style="background-color:powderblue;">
   

        <%    String DRIVER = "com.mysql.jdbc.Driver";

            Class.forName(DRIVER).newInstance();
            Connection con = null;
            ResultSet rst = null;
            Statement stmt = null;
            try {

                String url = "jdbc:mysql://localhost:3306/examen";

                String user = "root";
                String password = "1234";
                con = DriverManager.getConnection(url, user, password);
                stmt = con.createStatement();
                String LoginName=request.getParameter("nm");
                String LoginPass=request.getParameter("pw");
                rst = stmt.executeQuery("SELECT * FROM examen.users; ");
                
                while (rst.next()) {
                       
                    if((rst.getString("Name").equals(LoginName) && rst.getString("Password").equals(LoginPass))){
                        //out.println(rst.getString("Name"));
                         response.sendRedirect("IU_PP_Empleado.jsp");
                        
                    }
                }
                
                
                response.sendRedirect("Login.jsp");
                //out.println(rst.getString("Name"));

                rst.close();
                stmt.close();
                con.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        %>

    </body>

</html>
