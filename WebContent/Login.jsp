<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="container">
  <h1>Login de connexion</h1>
</div>

<form action="otherPage.jsp" method="post">
<div class="input-group input-group-lg">
  		Nom <input type="text" class="form-control" placeholder="Votre nom.." aria-describedby="sizing-addon1" id="nom" name="nom">
	</div>
	<div class="input-group input-group-lg">
  		Login <input type="text" class="form-control" placeholder="Votre login.." aria-describedby="sizing-addon1" id="login" name="login">
	</div>
	<div class="input-group input-group-lg">
  		Mot de passe <input type="text" class="form-control" placeholder="Votre mot de passe.." aria-describedby="sizing-addon1" id="mdp" name="mdp">
	</div>
	<p><input type = "submit" value = "Valider"></p>
</form>

</body>
</html>