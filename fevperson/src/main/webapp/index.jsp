<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Good Morining Appa</title>
</head>
<body>
<h1> Hello Pappa Wishing You A Very Happy Birthday Appa </h1>

<form action="msg" method="post">
<pre>
Fname <input type="text" name="Fname"/>
Lname <input type="text" name="Lname"/>
Gender female<input type="radio" name="gender" value="female"/>
    male  <input type="radio" name="gender" value="male"/>
reason <textarea rows="10" cols="05" name="reason"></textarea>
address <textarea rows="10" cols="05" name="address"></textarea>
<input type="submit" value="click ">

<a href="Display.jsp"> Click here to send message for your fev person</a>
</pre>
</form>

</body>
</html>