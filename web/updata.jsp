<%--
  Created by IntelliJ IDEA.
  User: 逸仙
  Date: 2020/7/26
  Time: 20:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%
    pageContext.setAttribute ("ctp",request.getContextPath ());
%>
<body>
<form action="${ctp}/updata">
    <input type="hidden" value="1" name="id"><br>
    name: 张三<br>
    password: <input type="password" name="password" ><br>
    age: <input type="text" name="age" ><br>
    gender: <input type="text" name="gender" ><br>
    submit: <input type="submit" value="更新"><br>
</form>
</body>
</html>
