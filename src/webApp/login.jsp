<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
	<title></title>
<link rel="stylesheet" type="text/css" href="./resources/style.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<script src="./Js.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
</head>
<body>
  <div class="connexion">
  	${PRING_SECURITY_LAST_EXCEPTION.message}
    <form action="login" method="post">
      <h2 class="text-center">Ravis de Vous revoir</h2>       
      <div class="form-group">
        <input type="text" class="form-control" placeholder="Username" name="username" required="required">
      </div>
      <div class="form-group">
        <input type="password" class="form-control" placeholder="Password" name="password" required="required">
      </div>
      <div class="form-group clearfix">
        <button type="submit" name="submit" class="btn btn-primary pull-right">Connexion</button>
      </div>
      <div class="clearfix">
        <a href="./insctiption.html" class="pull-right">Inscrivez vous</a>
      </div>        
    </form>
  </div>
</body>
</html>