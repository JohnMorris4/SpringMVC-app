<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.min.css" />
    <title>Todo Items</title>
</head>
<body>
    <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>Todo Items</h2></caption>
            <tr>
                <th>Title</th>
                <th>Deadline</th>
            </tr>
            <c:forEach var="item" items="${todoData.items}">
                <tr>
                    <td><c:out value="${item.title}" /></td>
                    <td><c:out value="${item.deadline}" />
                </tr>
            </c:forEach>
        </table>
    </div>

 </body>
</html>
