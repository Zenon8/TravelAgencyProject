<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html lang="en">
<head>
    <meta content="text/html" charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Title</title>
</head>
<body>

<h1 align="center">Beer Selection Page</h1>
<form method="post" action="">
<c:url value="/serv1"/>
    <div>Select beer characteristics</div>
    <label>
        Color:
        <select name="color" size="1">
            <option value="light"> light</option>
            <option value="amber"> amber</option>
            <option value="brown"> brown</option>
            <option value="dark"> dark</option>
        </select>
    </label>
    <br><br>
    <div>
        <input type="submit">
    </div>
</form>

</body>
</html>
