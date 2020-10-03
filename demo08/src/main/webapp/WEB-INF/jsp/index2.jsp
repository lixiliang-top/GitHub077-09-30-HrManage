<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2020/10/3
  Time: 16:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1"  align="center" width="800">
    <tr>
        <th width="120">商品编号</th>
        <th width="160">商品名称</th>
        <th width="100">商品价格</th>
        <th width="120">库存数量</th>
        <th width="100">订单状态</th>
        <th width="200">操作</th>
    </tr>

    <c:forEach items="${goods}" var="goodss">
        <tr>
            <th width="120" id="th_id">${goodss.id}</th>
            <th width="160">${goodss.goodsname}</th>
            <th width="100">${goodss.goodsprice}</th>
            <th width="120">${goodss.goodscount}</th>
            <c:if test="${goodss.billstatus==0}">
                <th width="100">待处理</th>
            </c:if>
            <c:if test="${goodss.billstatus==1}">
                <th width="100">处理中</th>
            </c:if>
            <c:if test="${goodss.billstatus==2}">
                <th width="100">已处理</th>
            </c:if>
            <th width="200"><a href="/chuan?id=${goodss.id}">修改</a></th>
        </tr>
    </c:forEach>
</table>
</body>
</html>
