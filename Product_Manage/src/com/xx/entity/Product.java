package com.xx.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * javaBean: 实现Serializable接口 提供私有属性 提供setter|getter属性 提供无参构造
 * 
 * @author 伟酱
 *
 */
// 实现Serializable（序列化）接口
public class Product implements Serializable {

	/*	CREATE TABLE jspproduct(
	 *  id INT PRIMARY KEY AUTO_INCREMENT, 
	 *  NAME VARCHAR(30) NOT NULL, 
	 *  description VARCHAR(100) ,
	 *  price DOUBLE CHECK( price >= 0 ), 
	 *  account INT CHECK(account >= 0 ), 
	 *  STATUS INT DEFAULT 1 CHECK( STATUS IN (0, 1) ), 
	 *  ADDTIME TIMESIMPLE
	 *  );
	 */
	// 私有属性统一用包装类
	private Integer id;
	private String name;
	private String description;
	private Double price;
	private Integer account;
	private Integer status;
	private Date addtime;

	// 提供get|set方法
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getAccount() {
		return account;
	}

	public void setAccount(Integer account) {
		this.account = account;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getAddtime() {
		return addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	// 提供无参构造方法
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

}
