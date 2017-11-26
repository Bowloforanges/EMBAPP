<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Vacations</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
        <link rel="stylesheet" href="css/datepicker.css">
        <link rel="stylesheet" href="assets/theme/css/style.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="css/buttonstyle.css">
        <link rel="stylesheet" href="css/newcolstyle.css">
        <link href="https://fonts.googleapis.com/css?family=Nunito" rel="stylesheet">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>

    <br>
        <div class="buttondiv">
        <input type="button" value="Return" onclick="window.history.go(-1); return false;" class="btn"/><br>
        </div>
        <hr>

        <div class="container-fluid">
            <div class="row">
                <div class="col-sm-12">
                    <h1>Which days are you willing to take?</h1>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-6">
                    <div class="right-inner-addon">
                        <input type="text" class="form-control startDate" placeholder="Start">
                        <i class="glyphicon glyphicon-calendar"></i>
                    </div>
                </div>
                
                <br><br><br><br>
                
                <div class="col-sm-6">
                    <div class="right-inner-addon">
                        <input type="text" class="form-control endDate" placeholder="End">
                        <i class="glyphicon glyphicon-calendar"></i>
                    </div>
                </div>
            </div>
        </div>
        
        

        <script src="js/datepicker.js"></script>
        <script src="js/app.js"></script>
        
        <div class="buttondiv">
            <hr>
        <input type="button" value="Send Request" class="btn">
        </div>
        
    </body>
</html>