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
                <a href=<%= "\"IU_Bracket_Menu.jsp\""%>><li>Brackets</li></a>
                <a href=<%= "\"IU_Score_Employees\""%>><li>Score</li></a>
                <a href=<%= "\"IU_Feedback_Employees\""%>><li>Feedback</li></a>
            </ul>
        </div>
        <a href="IU_PP_SuperAndOM.jsp"></a>
        <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

        <script  src="js/index.js"></script>

    </body>
</html>
