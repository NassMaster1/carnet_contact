<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<form method="post" action="AddPhoneNumber">
		<table>
			<tr>
				<th><h2>Création d'un phone number</h2></th>
		
				<tr>
					<td>Phone kind <i>: <input type="text" name="kphone" size="25"></i></td>
				</tr>
				<tr>
					<td><i>Phone Number: <input type="text" name="nphone" size="25"></i></td>
				</tr>
				<tr>
					<td><input class="button" type="submit" value="Submit" /><input class="button" type="reset" value="Reset"></td>
				</tr>
			
		</table>
	</form>
</html>