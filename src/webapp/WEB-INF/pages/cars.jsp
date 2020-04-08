<%--
  Created by IntelliJ IDEA.
  User: sdm
  Date: 08.04.2020
  Time: 23:54
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %><html>
<head>

</head>
<body>
<title>Title</title>
<h1>Cars:</h1>

<table >
    <tr>
        <th width="80">Id</th>
        <th width="120">Brand</th>
        <th width="120">Volume</th>
    </tr>
    <c:forEach items="${cars}" var="car">
        <tr>
            <td align="center">${car.id}</td>
            <td align="center">${car.brand}</td>
            <td align="center">${car.volume}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
