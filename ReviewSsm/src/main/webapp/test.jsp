<%@ page import="com.qjh.entity.User" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: qjh's
  Date: 2021/1/5
  Time: 10:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
    <script>

    </script>
</head>
<body>
<%
      out.println("this my test!");
      request.getContextPath();
      out.println(request.getContextPath());
      out.println(request.getServletPath());
    List<User> users = (List<User>) request.getAttribute("users");


%>
    <table>
        <tr>
            <th>id</th><th>username</th><th>age</th><th>Password</th>
        </tr>
       <% for (User u:
               users) {

        %>
        <tr>
            <td><%=u.getId()%></td>
        </tr>
        <%}%>
    </table>

</body>
</html>
