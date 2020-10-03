<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2020/10/3
  Time: 16:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/doIndex3" method="post">
    <table border="1"  align="center" width="800">
        <tr>
            <td width="120">商品编号</td>
            <th width="160"><input type="text" name="id" readonly class="inp_id" value="${sel.id}"></th>
        </tr>
        <tr>
            <td width="120">商品名称</td>
            <th width="160"><input type="text" name="goodsname" class="inp_name" value="${sel.goodsname}"></th>
        </tr>
        <tr>
            <td width="120">商品价格</td>
            <th width="160"><input type="text" name="goodsprice" class="inp_price" value="${sel.goodsprice}"></th>
        </tr>
        <tr>
            <td width="120">库存数量</td>
            <th width="160"><input type="text" name="goodscount" class="inp_count" value="${sel.goodscount}"></th>
        </tr>
        <tr>
            <td width="120">订单状态</td>
            <th width="160">
                <select name="billstatus" class="sel_zhuang">
                    <option <c:if test="${sel.billstatus==0}">selected="selected"</c:if>  value="0">待处理</option>
                    <option <c:if test="${sel.billstatus==1}">selected="selected"</c:if> value="1">处理中</option>
                    <option <c:if test="${sel.billstatus==2}">selected="selected"</c:if> value="2">已处理</option>
                </select>
            </th>
        </tr>
        <tr>
            <th width="120" colspan="2"><input type="submit" value="修改"/>&nbsp;&nbsp;&nbsp;<button class="tijiao">返回</button></th>
        </tr>
    </table>
</form>
</body>
</html>
