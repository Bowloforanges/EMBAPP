<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>ERROR</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="buttonstyle.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<style type="text/css">
	.bs-example{
		margin: 20px;
	}
</style>
<script>
function return(){
window.location.href = window.history.back(1);
}
</script>
</head>
<body>
<div class="bs-example">
    <input type="button" value="Return" onclick="window.history.go(-1); return false;" class="btn"/><br><br>
    <div class="alert alert-danger fade in">
        
        <a href="#" class="close" data-dismiss="alert">&times;</a>
        <strong>Sorry!</strong> You have no notifications at the moment.
        
    </div>
    
</div>
</body>
</html>              