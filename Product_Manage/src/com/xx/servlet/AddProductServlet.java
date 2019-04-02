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
 * Servlet implementation class AddProductServlet
 */
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProductService productService = new ProductServiceImpl();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddProductServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1���õ����е�����
		String name = request.getParameter("name");
		Double price = Double.parseDouble(request.getParameter("price"));
		Integer account = Integer.parseInt(request.getParameter("account"));
		Integer status = Integer.parseInt(request.getParameter("status"));
		String description = request.getParameter("description");
		// 2��������Ʒ����ͬʱ����Ʒ����ֵ
		Product product = new Product();
		product.setName(name);
		product.setPrice(price);
		product.setAccount(account);
		product.setStatus(status);
		product.setDescription(description);
		// 3��������ӷ���
		productService.saveProduct(product);
		// 4�������ض���QueryProductListServlet
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
