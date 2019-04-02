package com.xx.dao.impl;

import java.util.List;

import com.xx.dao.ProductDAO;
import com.xx.entity.Product;
import com.xx.util.BaseDAO;

public class ProductDAOImpl extends BaseDAO implements ProductDAO {

	@Override
	public List<Product> selectAllProduct() {
		// TODO Auto-generated method stub
		return findList(Product.class, "select * from jspproduct");
	}

	@Override
	public void deleteProductById(Integer id) {
		// TODO Auto-generated method stub
		update("delete from jspproduct where id = ?", id);
	}

	@Override
	public void saveProduct(Product product) {
		// TODO Auto-generated method stub
		// id和time赋null就可以
		update("insert into jspproduct values(null,?,?,?,?,?,null)", product.getName(), product.getDescription(),
				product.getPrice(), product.getAccount(), product.getStatus());
	}

	@Override
	public Product selectProductById(Integer id) {
		// TODO Auto-generated method stub
		
		return findOne(Product.class, "select * from jspproduct where id=?", id);
	}

	@Override
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		update("update jspproduct set name=?,description=?,price=?,account=?,status=? where id=?",product.getName(),product.getDescription(),product.getPrice(),product.getAccount(),product.getStatus(),product.getId());
	}

}
