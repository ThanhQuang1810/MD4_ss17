<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Selected Condiments</title>
</head>
<body>
<h2>Selected Condiments</h2>
<ul>
    <c:forEach var="condiment" items="${condiments}">
        <li>${condiment}</li>
    </c:forEach>
</ul>
<a href="index">Back</a>
</body>
</html>
