package com.xx.service.impl;

import com.xx.service.ProductService;

import java.util.List;

import com.xx.dao.*;
import com.xx.dao.impl.ProductDAOImpl;
import com.xx.entity.Product;

public class ProductServiceImpl implements ProductService{

	 private ProductDAO productDAO = new ProductDAOImpl();

	@Override
	public List<Product> selectAllProduct() {
		// TODO Auto-generated method stub
		return productDAO.selectAllProduct();
	}

	@Override
	public void deleteProductById(Integer id) {
		// TODO Auto-generated method stub
		productDAO.deleteProductById(id);
	}

	@Override
	public void saveProduct(Product product) {
		// TODO Auto-generated method stub
		productDAO.saveProduct(product);
	}

	@Override
	public Product selectProductById(Integer id) {
		// TODO Auto-generated method stub
		return productDAO.selectProductById(id);
	}

	@Override
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		productDAO.updateProduct(product);
	}
	
}
