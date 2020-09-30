<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2020/9/30
  Time: 14:39
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
        <table  border="1px black solid;" style="width:500px;" class="table">
            <tr  style="border: 1px black solid;" align="center"><td colspan="2"><h1>添加人员</h1></td></tr>
            <tr >
                <td align="center">姓名</td><td><input type="text" name="name"  class="name"><span style="color: red">*</span> </td></tr>
            <tr>
                <td align="center">性别</td><td><select class="sex" name="sex"><option>请选择</option><option>男</option><option>女</option></select><span style="color: red">*</span> </td></tr>
            <tr>
                <td align="center">年龄</td><td><input type="text" class="age" name="age"><span style="color: red">*</span> </td></tr>
            <tr>
                <td align="center">等级</td><td><select class="rank" name="rank"><option>请选择</option><option>1级</option><option>2级</option><option>3级</option><option>4级</option></select> <span style="color: red">*</span></td></tr>
            <tr>
                <td align="center">部门</td><td><select class="department" name="department"><option>请选择</option><option value="支持部">支持部</option><option value="开发部">开发部</option><option value="工程质量部">工程质量部</option></select><span style="color: red">*</span> </td>
            </tr>
            <tr align="center">
                <td colspan="2"><input type="submit" value="添加" /></td>
            </tr>
        </table>
        ${error}
    </form>
</div>
<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="js/update.js"></script>
</body>
</html>
