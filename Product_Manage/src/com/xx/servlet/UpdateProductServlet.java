package com.xx.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xx.entity.Product;
import com.xx.service.ProductService;
import com.xx.service.impl.ProductServiceImpl;

/**
 * Servlet implementation class UpdateProductServlet
 */
public class UpdateProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProductService productService = new ProductServiceImpl();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateProductServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1.����ҳ�����������Ʒ��Ϣ
		Integer id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String description = request.getParameter("description");
		Double price = Double.parseDouble(request.getParameter("price"));
		Integer account = Integer.parseInt(request.getParameter("account"));
		Integer status = Integer.parseInt(request.getParameter("status"));
		// 2.������Ʒ����ͬʱ����Ʒ��������Ը�ֵ
		Product product = new Product();
		product.setName(name);
		product.setAccount(account);
		product.setDescription(description);
		product.setPrice(price);
		product.setStatus(status);
		product.setId(id);
		// 3.����service�ı�����Ʒ�ķ���
		productService.updateProduct(product);

		// 4.�����ض��򵽲�ѯ��servlet
		response.sendRedirect("QueryProductListServlet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
