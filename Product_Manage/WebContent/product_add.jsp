<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="AddProductServlet" method="post">
		<table border="1px" width="500px" height="300px" align="center">
			<tr>
				<td>商品名称</td>
				<td><input type="text" name="name" size="25" /></td>
			</tr>
			<tr>
				<td>商品单价</td>
				<td><input type="text" name="price" size="25" /></td>
			</tr>
			<tr>
				<td>商品数量</td>
				<td><input type="text" name="account" size="25" /></td>
			</tr>
			<tr>
				<td>商品状态</td>
				<td><input type="radio" name="status" value="0" />下架 <input
					type="radio" name="status" value="1" checked="checked" />上架</td>
			</tr>
			<tr>
				<td>商品描述</td>
				<td><textarea rows="10" cols="30" name="description"></textarea></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="保存" /></td>
			</tr>

		</table>
	</form>
</body>
</html>