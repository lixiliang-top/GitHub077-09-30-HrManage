<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2020/10/2
  Time: 10:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
    <h1 align="center">记账管理</h1>
    类型：
    <select class="jieyue">
        <option value="0">不限</option>
    </select>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    时间，从：
    <input type="text" class="chu"/>
    到
    <input type="text" class="zhong"/>
    <input type="button" class="chaxun" value="查询"/>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="button" class="jizhang" value="记账"/>
    <table border="1" width="700" class="table-fenye">
        <tr style="background-color:darkgrey;text-align: center">
            <td>标题</td>
            <td>记账时间</td>
            <td>类别</td>
            <td>金额</td>
            <td>说明</td>
        </tr>
    </table>
</div>
<script type="text/javascript" src="/statics/js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="/statics/js/index2.js"></script>
</body>
</html>
