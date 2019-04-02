<%@page import="com.xx.entity.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1px" width="100%" height="100%" align="center">
		<tr>
			<th>id</th>
			<th>商品名称</th>
			<th>商品描述</th>
			<th>商品单价</th>
			<th>商品数量</th>
			<th>商品状态</th>
			<th>商品上架时间</th>
			<th>操作</th>
		</tr>

		<%
			/* 获取products */
			List<Product> products = (List<Product>) request.getAttribute("products");
			/* 遍历 */
			for (Product product : products) {
		%>
		<tr align="center">
			<td><%=product.getId()%></td>
			<td><%=product.getName()%></td>
			<td><%=product.getDescription()%></td>
			<td><%=product.getPrice()%></td>
			<td><%=product.getAccount()%></td>
			<td>
				<%
					if (product.getStatus() == 1) {
				%> 上架 <%
					} else {
				%> 下架 <%
					}
				%>
			</td>
			<!-- 格式化日期 -->
			<td><fmt:formatDate value="<%=product.getAddtime() %>" pattern="yyyy-MM-dd HH:mm:ss"/> </td>
			<td><a href="DeleteProductServlet?id=<%=product.getId()%>">删除</a>
              &nbsp;&nbsp;&nbsp;
              <a href="QueryProductByIdServlet?id=<%=product.getId()%>">修改</a>
            </td>
		</tr>

		<%
			}
		%>

	</table>
	<div align="right"><button><a href="product_add.jsp">添加商品</a></button></div>
	
</body>
</html>