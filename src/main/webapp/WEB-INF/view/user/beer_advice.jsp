<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.List" %>
<html>
<head>
    <title>Beer Advice</title>
</head>
<body>

<h1 align="center">Beer Recommendation JSP</h1>
<p>

    <%
        List<String> styles = (List<String>) request.getAttribute("styles");
        Iterator<String> it = styles.iterator();
        while (it.hasNext()) {
            out.print("<br />try:" + it.next());
        }

    %>

</p>

</body>
</html>
