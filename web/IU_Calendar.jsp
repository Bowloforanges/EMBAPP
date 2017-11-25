<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html >
    <head>
        <meta charset="UTF-8">
        <title>Calendar</title>

        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
        <link rel='stylesheet prefetch' href='https://fonts.googleapis.com/css?family=Roboto:300,400,700'>
        <link rel="stylesheet" href="css/stylecalendar.css">
        <link rel="stylesheet" href="css/buttonstyle.css">


    </head>

    <body>

        <div id="calendar"></div>

        <script src='https://npmcdn.com/react@15.3.0/dist/react.min.js'></script>
        <script src='https://npmcdn.com/react-dom@15.3.0/dist/react-dom.min.js'></script>
        <script src='https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.14.1/moment-with-locales.min.js'></script>

        <script src="js/calendar.js"></script>

        <div>
            <br>
            <input type="button" value="Return" onclick="window.history.go(-1); return false;" class="btn"/>  
            <input type="button" value="My Vacation Days" onclick="window.location.href = 'IU_VacationDays.jsp'" class="btn"/><br><br>
        </div>

    </body>
</html>
