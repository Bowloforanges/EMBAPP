<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page language="java" import="java.sql.*"%>


<!DOCTYPE html>
<html>
    <head>
        <!-- Site made with Mobirise Website Builder v4.4.1, https://mobirise.com -->
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="generator" content="Mobirise v4.4.1, mobirise.com">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="shortcut icon" href="assets/images/logo4.png" type="image/x-icon">
        <meta name="description" content="Website Maker Description">
        <title>score</title>
        <link rel="stylesheet" href="assets/tether/tether.min.css">
        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap-grid.min.css">
        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap-reboot.min.css">
        <link rel="stylesheet" href="assets/as-pie-progress/css/progress.min.css">
        <link rel="stylesheet" href="assets/theme/css/style.css">
        <link rel="stylesheet" href="assets/mobirise/css/mbr-additional.css" type="text/css">
        <link rel="stylesheet" href="css/buttonstyle.css">
        <link rel="stylesheet" href="css/pbar.css">



    </head>
    <body>


        <%
            String sid = request.getParameter("sid");
            int id = Integer.parseInt(sid);
        %>


    </div>
    <%    String DRIVER = "com.mysql.jdbc.Driver";

        Class.forName(DRIVER).newInstance();
        Connection con = null;
        ResultSet rs = null;
        Statement stmnt = null;
        float Score = 0;
        int Lvl = 0, Exp = 0;
        
        //String Score;

        try {

            String url = "jdbc:mysql://localhost:3306/test";

            String user = "root";
            String password = "1234";
            con = DriverManager.getConnection(url, user, password);
            stmnt = con.createStatement();
            rs = stmnt.executeQuery("select Emp_ID, Emp_Score, employee.Emp_Tot_Exp, Level_Exp_Current_Level from employee natural join level_exp where Emp_ID = " + sid + ";");
            //usr = stmt2.executeQuery("SELECT * FROM embagroup.info_empleado; ");

            while (rs.next()) {

                Score = rs.getInt("Emp_Score");
                Exp = rs.getInt("Emp_Tot_Exp");
                Lvl = rs.getInt("Level_Exp_Current_Level");
                
                
            }

    %>


    <br>
    <div class="buttondiv">
        <input type="button" value="Return" onclick="window.history.go(-1); return false;" class="btn"/><br>
    </div>
    <hr>




    <section class="progress-bars3 cid-qBY0RPWZGq" id="progress-bars3-7" data-rv-view="22">





        <div class="container">

            <h2 class="mbr-section-title pb-3 align-center mbr-fonts-style display-2">
                Level</h2>
            <h1 class="mbr-section-title pb-3 align-center mbr-fonts-style display-2">
                <%= Lvl%></h1>



            <div class="media-container-row pt-5 mt-2">
                <div class="card p-3 align-center">
                    <div class="wrap">
                        <div class="pie_progress progress1" role="progressbar" data-goal="<%= (Exp*2.77)%>" >
                            <p class="pie_progress__number mbr-fonts-style display-5"></p>
                        </div>
                    </div> 
                    <div class="mbr-crt-title pt-3">
                        <h4 class="card-title py-2 mbr-fonts-style display-5">Total Experience</h4>
                    </div>                 
                </div>

            </div>

            <h2 class="mbr-section-title pb-3 align-center mbr-fonts-style display-2">
                Your Current Score is:</h2>
            <h1 class="mbr-section-title pb-3 align-center mbr-fonts-style display-2">
                <%= Score %></h1>


        </div></section>


    <section class="engine"><a href="https://mobirise.co/n">bootstrap modal popup</a>


        <script src="assets/web/assets/jquery/jquery.min.js"></script>
        <script src="assets/popper/popper.min.js"></script>
        <script src="assets/tether/tether.min.js"></script>
        <script src="assets/bootstrap/js/bootstrap.min.js"></script>
        <script src="assets/smooth-scroll/smooth-scroll.js"></script>
        <script src="assets/as-pie-progress/jquery-as-pie-progress.min.js"></script>
        <script src="assets/theme/js/script.js"></script>
        <script src="js/pbar.js"></script>


        <%            

                rs.close();
                stmnt.close();
                con.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        %>


</body>
</html>