<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" >
    <head>
        <meta charset="UTF-8">
        <title>EMBAGROUP</title>


        <link rel='stylesheet prefetch' href='https://fonts.googleapis.com/css?family=Noto+Sans:700'>

        <link rel="stylesheet" href="css/stylePP.css">


    </head>

    <body>

        <%
            String sid = request.getParameter("sid");
            int id = Integer.parseInt(sid);
        %>

        <header>
            <span class="navbar-logo">
                <a>
                    <img src="assets/images/embalogo-150x150.png" alt="" title="" media-simple="true" style="height: 2.7rem;">
                </a>
            </span>
            <span class="TitleEMBA">EMBAGROUP</span>
            <button class="hamburger">&#9776;</button>
            <button class="cross">&#735;</button>
        </header>

        <div class="menu">
            <ul>
                <a href="IU_NotificationScreen.jsp"><li>Notifications</li></a>
                <a href="IU_Calendar.jsp"><li>Calendar</li></a>
                <a href="IU_VacationDays.jsp"><li>Vacation Days</li></a>
                <a href=<%= "\"IU_E_Brackets.jsp?sid=" + sid + "\""%>><li>Brackets</li></a>
                <a href=<%= "\"IU_E_Score.jsp?sid=" + sid + "\""%>><li>Score</li></a>
                <a href=<%= "\"IU_E_AnnualFeedback.jsp?sid=" + sid + "\""%>> <li>Annual Feedback</li></a>
                <a href=<%= "\"IU_E_TriFeedback.jsp?sid=" + sid + "\""%>><li>Trimestral Feedback</li></a>
            </ul>
        </div>
        <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

        <script  src="js/index.js"></script>

    </body>
</html>
