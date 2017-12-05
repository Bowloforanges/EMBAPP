<%@ page language="java" import="java.sql.*"%>
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

        <script>
            var currentID;

            function showDescription(resultset rs) {

                document.getElementById("brid").value = currentID;
                document.getElementById('Description').innerHTML = rs.getString(4);

            }


        </script>    

    </head>
    <body>

        <br>
        <div class="buttondiv">
            <input type="button" value="Return" onclick="window.history.go(-1);
                    return false;" class="btn"/><br>
        </div>
        <hr>


        <%    String DRIVER = "com.mysql.jdbc.Driver";

            Class.forName(DRIVER).newInstance();
            Connection con = null;
            ResultSet rs = null;
            Statement stmnt = null;

            try {

                String url = "jdbc:mysql://localhost:3306/test";

                String user = "root";
                String password = "1234";
                con = DriverManager.getConnection(url, user, password);
                stmnt = con.createStatement();
                rs = stmnt.executeQuery("select * from test.brackets natural join test.bracket_desc where brackets.Bracket_Name = bracket_desc.Bracket_Name order by Bracket_ID asc;");
                //usr = stmt2.executeQuery("SELECT * FROM embagroup.info_empleado; ");
        %>





        <h1>Select a Bracket:</h1>

        <div class="container">
            <form action="CTL_UPDATE_BRACKET" method="post">
                <div class="row">
                    <div class="col-25">
                        <label for="lbrid">Bracket ID</label>
                    </div>
                    <div class="col-75">
                        <select id="brid" name="BR_id" onchange="showDescription(rs)">
                            <%  while (rs.next()) {

                            %>
                            <option> <%= rs.getInt("Bracket_ID")%> </option>
                            <%  }
                                    rs.close();
                                    stmnt.close();
                                    con.close();
                                } catch (Exception e) {
                                    System.out.println(e.getMessage());
                                }
                            %>
                        </select>
                    </div>
                    <div class="col-25">
                        <p id ="Description"></p>
                    </div>
                </div>
                <div class="row">
                    <div class="col-25">
                        <label for="lnname">New Name</label>
                    </div>
                    <div class="col-75">
                        <input type="text" id="name" name="Nombre" placeholder="Bracket Name">
                    </div>
                </div>
                <div class="row">
                    <div class="col-25">
                        <label for="lname">New Description</label>
                    </div>
                    <div class="col-75">
                        <input type="text" id="name" name="Nombre" placeholder="Description">
                    </div>
                </div>
                <div class="row">
                    <div class="col-25">
                        <label for="lname">Experience</label>
                    </div>
                    <div class="col-75">
                        <input type="text" id="name" name="Nombre" placeholder="Experience">
                    </div>
                </div>
                <div class="row"class='buttondiv'>
                    <hr>
                    <input type="submit" value="Submit Changes" class='btn'>
                </div>
            </form>
        </div>
        <hr>

        <br/>





    </body>
</html>
