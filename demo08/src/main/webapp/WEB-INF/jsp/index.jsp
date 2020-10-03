<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2020/10/3
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/doIndex" method="post">
    <table class="tab_gongdan" width="500" border="1" align="center">
        <tr>
            <td align="center">请选择区域</td>
            <td><select name="goodsdistrict"><option value="1">朝阳区订单</option><option value="2">海淀区订单</option><option value="3">丰台区订单</option><option value="4">西城区订单</option><option value="5">昌平区订单</option></select>&nbsp;&nbsp;&nbsp;<input type="submit" value="查询"/></td>
        </tr>
    </table>
</form>
</body>
</html>
