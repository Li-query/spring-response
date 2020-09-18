<%--
  Created by IntelliJ IDEA.
  User: 逸仙
  Date: 2020/7/26
  Time: 19:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <%
    pageContext.setAttribute ("ctp",request.getContextPath ());
    %>
    <title>$Title$</title>
  </head>
  <body>
  $END$666666666666666666666666666 <br>
  请按照id-name-age-password的方式输入数据 <br>
  <img src="${ctp}/01.jpg" >
  <form action="${ctp}/converter" method="post">
    <input type="text" name="user"> <br>
    <input type="submit" value="提交"> <br>
  </form>
  </body>
</html>
