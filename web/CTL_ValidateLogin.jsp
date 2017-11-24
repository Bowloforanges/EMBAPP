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

                String url = "jdbc:mysql://localhost:3306/embagroup";

                String user = "root";
                String password = "1234";
                con = DriverManager.getConnection(url, user, password);
                stmt = con.createStatement();
                String ValidateLogin_LoginID=request.getParameter("nm");
                String ValidateLogin_LoginPass=request.getParameter("pw");
                rst = stmt.executeQuery("SELECT * FROM embagroup.contra_emp; ");
                
                while (rst.next()) {
                       
                    if((rst.getString("ID_E").equals(ValidateLogin_LoginID) && rst.getString("Password").equals(ValidateLogin_LoginPass))){
                        //out.println(rst.getString("Name"));
                         response.sendRedirect("IU_PP_Empleado.jsp");
                        
                    }
                }
                
                
                response.sendRedirect("IU_Login.jsp");
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
