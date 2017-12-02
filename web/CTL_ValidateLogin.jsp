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

                String url = "jdbc:mysql://localhost:3306/test";

                String user = "root";
                String password = "1234";
                con = DriverManager.getConnection(url, user, password);
                stmt = con.createStatement();
                String ValidateLogin_LoginID = request.getParameter("nm");
                String ValidateLogin_LoginPass = request.getParameter("pw");
                rst = stmt.executeQuery("SELECT * FROM test.employee; ");
                while (rst.next()) {

                    if (rst.getString("Emp_ID").equals(ValidateLogin_LoginID) && rst.getString("Emp_Password").equals(ValidateLogin_LoginPass)) {

                        if (rst.getString("Emp_ID").equals(ValidateLogin_LoginID) && rst.getString("Emp_Position").equals("Empleado")) {
                            response.sendRedirect("IU_PP_Empleado.jsp");
                        } else if (rst.getString("Emp_ID").equals(ValidateLogin_LoginID) && rst.getString("Emp_Position").equals("RH")) {
                            response.sendRedirect("IU_PP_RH.jsp");
                        } else if (rst.getString("Emp_ID").equals(ValidateLogin_LoginID) && rst.getString("Emp_Position").equals("Supervisor")) {
                            response.sendRedirect("IU_SuperAndOM/IU_PP_SuperAndOM.jsp");
                        } else if (rst.getString("Emp_ID").equals(ValidateLogin_LoginID) && rst.getString("Emp_Position").equals("Gerente Operativo")) {
                            response.sendRedirect("IU_SuperAndOM/IU_PP_SuperAndOM.jsp");
                        } else if (rst.getString("Emp_ID").equals(ValidateLogin_LoginID) && (rst.getString("Emp_Position") != "RH" || rst.getString("Emp_Position") != "Empleado" || rst.getString("Emp_Position") != "Supervisor" || rst.getString("Emp_Position") != "Gerente Operativo")) {
                            response.sendRedirect("showerror.html");
                        }
                    }
                }

                response.sendRedirect("IU_Login.jsp");

                rst.close();
                stmt.close();
                con.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        %>

    </body>

</html>
