<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2020/10/2
  Time: 10:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
    <form action="/doIndex2" method="post">
        <table border="1px black solid;" style="width:500px;" class="table">
            <tr style="border: 1px black solid;" align="center">
                <td colspan="2"><h1>记账</h1></td>
            </tr>
            <tr>
                <td align="center">类型：</td>
                <td><input type="radio" name="typeId" value="1"/>支出
                    <input type="radio" name="typeId" value="2"/>收入
                    <input type="radio" name="typeId" value="3"/>还入
                    <input type="radio" name="typeId" value="4"/>转账
                    <input type="radio" name="typeId" value="5"/>借出
                    <input type="radio" name="typeId" value="6"/>借入
                    <input type="radio" name="typeId" value="7"/>还出
                </td>
            </tr>
            <tr>
                <td align="center">标题：</td>
                <td><input type="text" class="age" name="title"></td>
            </tr>
            <tr>
                <td align="center">金额：</td>
                <td><input placeholder="0" name="price"/></td>
            </tr>
            <tr>
                <td align="center">说明：</td>
                <td><textarea name="bexplain" style="width: 200px;height: 100px"></textarea></td>
            </tr>
            <tr align="center">
                <td colspan="2"><input type="submit" value="添加"/></td>
            </tr>
        </table>
        ${error}
    </form>
</div>
</body>
</html>
