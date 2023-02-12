<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    <!-- https://mvnrepository.com/artifact/javax.servlet/jstl -->
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid">
 <a class="navbar-brand" href="#">
      <img src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" alt="" width="80" height="30">
    </a>    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Link</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Dropdown
          </a>
          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
            <li><a class="dropdown-item" href="#">Action</a></li>
            <li><a class="dropdown-item" href="#">Another action</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="#">Something else here</a></li>
          </ul>
        </li>
      </ul>
      </div>
    </div>
</nav>

<form action="mail" method="get">
<h1>Display Email: ${Email}<br>
Display Email: ${Email}<br>
Display mobile: ${mobile}<br>
Display Adhar: ${Adhar}<br>
Display DateOfBirth: ${DateOfBirth}<br>
Display Age: ${Age}<br>
Display Salary: ${Salary}<br>
</h1>
<input type="submit" value="Display">
</form>

<form action="friends" method="get">

<input type="submit" value="Display">

<c:forEach items="${prends}" var= "element">
<li> ${element} </li>
</c:forEach>
</form>
<form action="place" method="get">

<input type="submit" value="Display">

<c:forEach items="${fevplc}" var= "element">
<li> ${element} </li>
</c:forEach>
</form>
<form action="skills" method="get">

<input type="submit" value="Display">

<c:forEach items="${code}" var= "element">
<li> ${element} </li>
</c:forEach>
</form>
<form action="Family" method="get">
<h1>
name: $(name) <br>

</h1>
</form>


</body>
</html>