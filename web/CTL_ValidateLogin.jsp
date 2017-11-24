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
            ResultSet usr = null;
            Statement stmt = null;
            Statement stmt2 = null;
            try {

                String url = "jdbc:mysql://localhost:3306/embagroup";

                String user = "root";
                String password = "1234";
                con = DriverManager.getConnection(url, user, password);
                stmt = con.createStatement();
                stmt2 = con.createStatement();
                String ValidateLogin_LoginID = request.getParameter("nm");
                String ValidateLogin_LoginPass = request.getParameter("pw");
                rst = stmt.executeQuery("SELECT * FROM embagroup.contra_emp; ");
                usr = stmt2.executeQuery("SELECT * FROM embagroup.info_empleado; ");
                while (rst.next()) {

                    if (rst.getString("ID_E").equals(ValidateLogin_LoginID) && rst.getString("Password").equals(ValidateLogin_LoginPass)) {

                        while (usr.next()) {
                            if (usr.getString("ID_E").equals(ValidateLogin_LoginID) && usr.getString("Puesto").equals("Empleado")) {
                                response.sendRedirect("IU_PP_Empleado.jsp");
                            } else if (usr.getString("ID_E").equals(ValidateLogin_LoginID) && usr.getString("Puesto").equals("RH")) {
                                response.sendRedirect("IU_PP_RH.jsp");
                            } else if (usr.getString("ID_E").equals(ValidateLogin_LoginID) && (usr.getString("Puesto") != "RH" || usr.getString("Puesto") != "Empleado")){
                                response.sendRedirect("showerror.html");
                            }
                        }
                    }
                }

                response.sendRedirect("IU_Login.jsp");

                rst.close();
                usr.close();
                stmt.close();
                con.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        %>

    </body>

</html>
