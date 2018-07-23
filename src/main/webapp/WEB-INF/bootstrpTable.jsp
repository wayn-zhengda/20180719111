<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/21 0021
  Time: 下午 4:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>bootstrap</title>
    <script type="text/javascript">
        (function () {
            $.ajax({
                url: 'localhost:8080/user/findData',
                type: 'post',
                async: true,
                dataType: 'json',
            });
            alert("1111111");
        }())
    </script>
</head>
<body>
<table class="tab1">
    <tbody>
    <tr>
        <td width="90" align="right">演示字段1：</td>
        <td>
            <input type="text" class="allInput" value=""/>
        </td>
        <td width="90" align="right">演示字段2：</td>
        <td>
            <input type="text" class="allInput" value=""/>
        </td>
        <td width="85" align="right"><input type="submit" class="tabSub" value="查 询"/></td>
    </tr>
    </tbody>
</table>
<div class="zixun fix">
    <table class="tab2" width="100%">
        <tbody>
        <c:forEach items="${users}" var="user">
            <tr>
                <th>${user.uid}</th>
                <th>${user.userName}</th>
                <th>${user.age}</th>
                <th>${user.sex}</th>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</body>
</html>
