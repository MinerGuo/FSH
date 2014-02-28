<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

用户列表：<br />

<table>
<#list users as user>
<tr>
<td>${user.id}</td><td>${user.value}</td>
</tr>
</#list>

<form method="POST" action="/app/dbread/ad">
add:<br />
<input type ="text" name="t_miner_test.value" value="<#if (user.value)??>${user.value}</#if>"/><br />
<input type="submit" value="添加" /><br />
</form>
</table>


</body>
</html>