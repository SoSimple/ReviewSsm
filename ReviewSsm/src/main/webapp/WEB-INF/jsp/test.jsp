<%--
  Created by IntelliJ IDEA.
  User: 卿建海
  Date: 2021/1/14
  Time: 20:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- JSTL 函数 包含一系列标准函数，大部分是通用的字符串处理函数-->
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!-- JSTL 核心标签库 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- JSTL 格式化标签 用来格式化并输出文本、日期、时间、数字 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- JSTL SQL标签库 提供了与关系型数据库进行交互的标签 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!-- JSTL XML标签库 提供了创建和操作XML文档的标签 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table>
    <thead>

    <caption>${sessionScope.user.id}</caption>
    <caption>${sessionScope.user.userName}</caption>
    <caption>${sessionScope.user.age}</caption>
    <caption>${sessionScope.user.password}</caption>
    </thead>
    <tbody>
        <tr><th>id</th><th>姓名</th><th>age</th><th>passeord</th></tr>
        <c:forEach var="user" items="${users}">
            <tr><td>${user.id}</td><td>${user.userName}</td><td>${user.age}</td><td>${user.password}</td></tr>
        </c:forEach>

    </tbody>
</table>

</body>
</html>
