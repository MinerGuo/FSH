<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="">
<input type="text" name="user.userName" value="<#if (user.userName)??>${user.userName}</#if>"/><br />
<input type="submit" value="提交" /><br />
</form>
</body>
</html>