<%--
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
        function getUser() {

        }

    </script>
</head>
<body>
  <%
      out.println("this my test!");
      request.getContextPath();
      out.println(request.getContextPath());
      out.println(request.getServletPath());
  %>

</body>
</html>
