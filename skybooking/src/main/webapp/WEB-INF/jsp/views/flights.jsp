<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Flight List</title>
</head>
<body>
    <h1>Available Flights</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Origin</th>
            <th>Destination</th>
            <th>Departure Date</th>
            <th>Arrival Date</th>
            <th>Airline</th>
            <th>Price</th>
        </tr>
        <c:forEach var="flight" items="${flights}">
            <tr>
                <td>${flight.id}</td>
                <td>${flight.origin}</td>
                <td>${flight.destination}</td>
                <td>${flight.departureDate}</td>
                <td>${flight.arrivalDate}</td>
                <td>${flight.airline}</td>
                <td>${flight.price}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
