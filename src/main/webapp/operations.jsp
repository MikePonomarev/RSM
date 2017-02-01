<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://rsm.pmsoftware.ru/functions" %>

<html>
<head>
    <title>Operations list</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<section>
    <h2><a href="index.html">Home</a></h2>
    <h3>Operations list</h3>
    <form method="post" action="operations?action=filter">
        <dl>
            <dt>From Date:</dt>
            <dd><input type="date" name="startDate" value="${startDate}"></dd>
        </dl>
        <dl>
            <dt>To Date:</dt>
            <dd><input type="date" name="endDate" value="${endDate}"></dd>
        </dl>
        <dl>
            <dt>From Time:</dt>
            <dd><input type="time" name="startTime" value="${startTime}"></dd>
        </dl>
        <dl>
            <dt>To Time:</dt>
            <dd><input type="time" name="endTime" value="${endTime}"></dd>
        </dl>
        <button type="submit">Filter</button>
    </form>
    <hr>
    <a href="meals?action=create">Add Operation</a>
    <hr>
    <table border="1" cellpadding="8" cellspacing="0">
        <thead>
        <tr>
            <th>Date</th>
            <th>Value</th>
            <th>Employee</th>
            <th>Location</th>
            <th>Description</th>
            <th></th>
            <th></th>
        </tr>
        </thead>
        <c:forEach items="${operations}" var="operation">
            <jsp:useBean id="operation" scope="page" type="ru.pmsoftware.rsm.model.Operation"/>
            <tr class="${operation.value > 0 ? 'exceeded' : 'normal'}">
                <td>
                        <%--${operation.dateTime.toLocalDate()} ${operation.dateTime.toLocalTime()}--%>
                        <%--<%=TimeUtil.toString(operation.getDateTime())%>--%>
                        ${fn:formatDateTime(operation.dateTime)}
                </td>
                <td>${operation.value}</td>
                <td>${operation.user}</td>
                <td>${operation.location}</td>
                <td>${operation.description}</td>
                <td><a href="operations?action=update&id=${operation.id}">Update</a></td>
                <td><a href="operations?action=delete&id=${operation.id}">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</section>
</body>
</html>
