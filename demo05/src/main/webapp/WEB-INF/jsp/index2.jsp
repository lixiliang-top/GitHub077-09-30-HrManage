<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2020/10/3
  Time: 9:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/doUpdate" method="post">
    <table border="1" align="center" width="500px">
        <div class="train_no" hidden><input type="text" name="sid" class="sid" value="${studentinfo.sid }"/></div>
        <tr><th colspan="2" bgcolor="yellow"><h1>学员信息</h1></th></tr>
        <tr>
            <td>姓名：</td>
            <td><input type="text" name="sname" class="name" value="${studentinfo.sname }"/></td>
        </tr>
        <tr>
            <td>年龄：</td>
            <td><input type="text" name="sgender" class="sgender" value="${studentinfo.sgender }" /></td>
        </tr>
        <tr>
            <td>性别：</td>
            <td><input type="text" name="sage" class="publish" value="${studentinfo.sage }" /></td>
        </tr>
        <tr>
            <td>家庭住址：</td>
            <td><input type="text" name="saddress" class="publishdate" value="${studentinfo.saddress }" /></td>
        </tr>

        <tr>
            <td>Email：</td>
            <td><input type="text" name="semail" class="page" value="${studentinfo.semail }" /></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" class="tijiao" value="修改" />&nbsp;&nbsp;&nbsp;<input type="submit" class="fanhui" value="重置" /></td>
        </tr>
    </table>
</form>
</body>
</html>
