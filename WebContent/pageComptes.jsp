<%@page import="metier.Operation"%>
<%@page import="metier.Compte"%>
<%@page import="java.util.Iterator"%>
<%@page import="servletClass.CompteBeans"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mes comptes</title>
</head>
<body>

<%
	CompteBeans comptes;
	if(request.getAttribute("modele") != null){
		comptes = (CompteBeans)request.getAttribute("modele");
	}else{
		Operation o = new Operation();
		comptes = new CompteBeans();
		comptes.setListe(o.getAll());
	}

%>

<h1>Mes comptes</h1>

<form action="prodserv" method="post">
<table border = "1" width="50%">
<tr>
		<td> Id </td>
		<td> <input type="text" name="id"/></td>
	</tr>
	<tr>
		<td> Nom </td>
		<td> <input type="text" name="nom"/></td>
	</tr>
	<tr>
		<td> Date d'ouverture </td>
		<td> <input type="text" name="dateOuverture"/></td>
	</tr>
	<tr>
		<td> Solde </td>
		<td> <input type="text" name="solde"/></td>
	</tr>
	<tr>
		<td> Id user </td>
		<td> <input type="text" name="idUser"/></td>
	</tr>
	<tr> 
		<td><input type="submit" value="valider"></td> 
	</tr>
</table>
</form>

<table border="1", width="60%">
	<tr>
		<th>Id</th>
		<th>Nom</th>
		<th>Date Ouverture</th>
		<th>Solde (en euros)</th>
		<th>id User</th>
		<th>Option</th>
	</tr>
	<%
		Iterator<Compte> list = comptes.getListe().iterator();
		while(list.hasNext()){
			Compte c = list.next();
	%>
	
	<tr>
		<td><%=c.getId() %> </td>
		<td><%=c.getNom() %> </td>
		<td><%= c.getDateOuverture() %></td>
		<td><%= c.getSolde() %></td>
		<td><%= c.getIdUser() %></td>
		<td><form action="prodserv" method="post">
				<input type="hidden" name="id" value="<%= c.getId() %>">
				<input type="hidden" name="action" value="supprimer">
				<input type="submit" value="supprimer">
			</form></td>
	</tr>
	
	<%
		}
	%>
	<tr>
		
	</tr>
</table>

</body>
</html>