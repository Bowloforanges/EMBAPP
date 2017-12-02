<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       


    <title>TODO supply a title</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <link rel="stylesheet" href="css/datepicker.css">
    <link rel="stylesheet" href="assets/theme/css/style.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="css/buttonstyle.css">
    <link rel="stylesheet" href="css/newcolstyle.css">
        <link rel="stylesheet" href="css/formstyle.css">
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
<h1>Add New Employee</h1>

<div class="container">
    <form action="CTL_ACTUALIZAR_BD" method="post">
        <div class="row">
            <div class="col-25">
                <label for="lID">ID</label>
            </div>
            <div class="col-75">
                <input type="text" id="ide" name="ID_E" placeholder="Employee's ID">
            </div>
        </div>
        <div class="row">
            <div class="col-25">
                <label for="lname">Name</label>
            </div>
            <div class="col-75">
                <input type="text" id="name" name="Nombre" placeholder="Employee's Name">
            </div>
        </div>
        <div class="row">
            <div class="col-25">
                <label for="lpass">Password</label>
            </div>
            <div class="col-75">
                <input type="text" id="pass" name="Password" placeholder="Employee's Password">
            </div>
        </div>
        <div class="row">
            <div class="col-25">
                <label for="lposition">Position</label>
            </div>
            <div class="col-75">
                <select id="position" name="Position">
                    <option>Director General</option>
                    <option>RH</option>
                    <option>Jefe Administrativo</option>
                    <option>Gerente Operativo</option>
                    <option>Supervisor</option>
                    <option>Empleado</option>
                </select>
            </div>
        </div>
        <div class="row">
            <div class="col-25">
                <label for="lage">Age</label>
            </div>
            <div class="col-75">
                <input type="text" id="age" name="Age" placeholder="Employee's Age">
            </div>
        </div>
        <div class="row">
            <div class="col-25">
                <label for="lgender">Gender</label>
            </div>
            <div class="col-75">
                <select id="gender" name="Gender">
                    <option>F</option>
                    <option>M</option>
                </select>
            </div>
        </div>
        <div class="row">
            <div class="col-25">
                <label for="LAD">Admission Date</label>
            </div>
            <div class="col-75">
                <input type="date" id="AD" name="Admission_Date">
            </div>
        </div>
        
        <div class="row"class='buttondiv'>
            <hr>
            <input type="submit" value="Submit" class='btn'>
        </div>
    </form>
</div>
<hr>

<br/>
<center><a href="IU_CRUD">view employees</a></center>

</body>
</html>
