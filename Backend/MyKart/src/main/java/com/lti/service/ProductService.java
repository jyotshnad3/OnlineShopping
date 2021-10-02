package com.lti.service;

import java.util.List;

import com.lti.pojo.Product;



public interface ProductService {
	
	public List<Product> getProduct(String type);
	
	public Product getAllProductByPID(int pId);

}
