<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
	<%
		String ctxPath = request.getContextPath();
	%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript">
	change = function(){
		var t = new Date();
		document.getElementById("verifyCode").src="imageServ?t="+t;
	}
</script>
</head>
<body>
	<p>login page <%=ctxPath %></p>
	<p>
		<%
			out.print("hh");
		%>
	</p>
	<form action="login" method="posr">
		<table>
			<tr>
				<td><label>登陆用户</label></td>			
				<td><input name="userName" /></td>
			</tr>
			<tr>
				<td><label>密码</label></td>
				<td><input name="passWord" /></td>
			</tr>
			<tr>
				<td><label>验证码</label></td>
				<td><img id="verifyCode" name="verifyCode" src="imageServ" alt="验证码"/><a href="javaScript:change()">看不清楚</a></td>
			</tr>
		</table>
		<input type="submit" />
	</form>
</body>
</html>