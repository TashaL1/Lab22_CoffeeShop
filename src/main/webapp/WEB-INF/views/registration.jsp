<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java Shoppe!!</title>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/sketchy/bootstrap.min.css" rel="stylesheet" integrity="sha384-N8DsABZCqc1XWbg/bAlIDk7AS/yNzT5fcKzg/TwfmTuUqZhGquVmpb5VvfmLcMzp" crossorigin="anonymous">
<link rel= "stylesheet" href="styles.css">

</head>
<body>

<h1 id="sizeFont">Please fill the form to register!</h1>

	<form action="submit-person" method="post" >
  <div class="form-group col-4">
	
	<span>First Name:</span> <input class="form-control" type = "text" name = "firstName" placeholder="First name"><br>
	<span>Last Name:</span> <input class="form-control" type = "text" name = "lastName" placeholder="Last name"><br>
	<span>Email:</span> <input class="form-control" type = "email" name = "email" placeholder="Enter email">
	<medium id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</medium>
	<span>Phone Number:</span> <input class="form-control" type= "phone" name = "phone" placeholder="888-555-1212" pattern="[0-9]{3}-[0-9]{3}-[0-9]{4}" required><br>
	<span>Password:</span> <input class="form-control" type= "password" name= "password" placeholder="Password"><br>
	<input type="submit" class="btn btn-success" value = "Register">

  </div>
 
 
	</form>
	

</body>
</html>