<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2020/10/3
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/doIndex2" method="post">
    <table border="1" align="center" width="500px">
        <tr><th colspan="2" bgcolor="yellow"><h1>申报项目信息</h1></th></tr>
        <tr>
            <td>项目编号：</td>
            <td><input type="text" name="id" class="sid" value="${projectinfo.id }"/></td>
        </tr>
        <tr>
            <td>项目名称：</td>
            <td><input type="text" name="projectname" class="name" value="${projectinfo.projectname }"/></td>
        </tr>
        <tr>
            <td>项目开始日期：</td>
            <td><input type="text" name="startdate" class="sgender" value="${projectinfo.startdate }" /></td>
        </tr>
        <tr>
            <td>项目结束日期：</td>
            <td><input type="text" name="enddate" class="publish" value="${projectinfo.enddate }" /></td>
        </tr>
        <tr>
            <td>申报状态：</td>
            <td>
                <select name="status" value="${projectinfo.status }">
                    <option value="2">已审核</option>
                    <option value="1">审核中</option>
                    <option value="0">已申报</option>
                </select>
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" class="tijiao" value="修改" />&nbsp;&nbsp;&nbsp;<input type="submit" class="fanhui" value="重置" /></td>
        </tr>
    </table>
</form>
</body>
</html>
