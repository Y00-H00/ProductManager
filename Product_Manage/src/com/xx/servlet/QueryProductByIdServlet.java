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
 * Servlet implementation class QueryProductByIdServlet
 */
public class QueryProductByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProductService productService = new ProductServiceImpl();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public QueryProductByIdServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1.��ȡid
		Integer id = Integer.parseInt(request.getParameter("id"));
		// 2.����id��ѯ��Ʒ��Ϣ��������Ʒ����
		Product product = productService.selectProductById(id);
		// 3.������Ʒ����
		request.setAttribute("product", product);
		// 4.����ת����product_update.jsp
		request.getRequestDispatcher("product_update.jsp").forward(request, response);
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
