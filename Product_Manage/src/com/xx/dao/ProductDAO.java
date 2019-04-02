package com.xx.dao;

import java.util.List;

import com.xx.entity.Product;

public interface ProductDAO {

	List<Product> selectAllProduct();

	void deleteProductById(Integer id);

	void saveProduct(Product product);

	Product selectProductById(Integer id);

	void updateProduct(Product product);

}
