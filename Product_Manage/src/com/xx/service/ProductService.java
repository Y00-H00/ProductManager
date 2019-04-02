package com.xx.service;

import java.util.List;

import com.xx.entity.Product;

public interface ProductService {

	List<Product> selectAllProduct();

	void deleteProductById(Integer id);

	void saveProduct(Product product);

	Product selectProductById(Integer id);

	void updateProduct(Product product);

}
