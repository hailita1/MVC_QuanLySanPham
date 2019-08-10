<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 23/07/2019
  Time: 16:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List Product</title>
</head>
<body>
<h1>Products</h1>
<p>
    <a href="/products?action=create">Create new product</a>
</p>
<table border="1">
    <tr>
        <td>NAME</td>
        <td>PRICE</td>
        <td>DESCRIPTION</td>
        <td>PRODUCER</td>
        <td>EDIT</td>
        <td>DELETE</td>
    </tr>
    <c:forEach items='${requestScope["products"]}' var="product">
        <tr>
            <th><a href="/products?action=view&name=${product.getName()}&id=${product.getId()}">${product.getName()}</a>
            </th>
            <th>${product.getPrice()}</th>
            <th>${product.getDescription()}</th>
            <th>${product.getProducer()}</th>
            <th><a href="/products?action=edit&name=${product.getName()}&id=${product.getId()}">edit</a></th>
            <th><a href="/products?action=delete&name=${product.getName()}&id=${product.getId()}">delete</a></th>
        </tr>
    </c:forEach>
</table>
</body>
</html>
