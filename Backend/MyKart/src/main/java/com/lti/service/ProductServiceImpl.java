package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.lti.jparepos.MyJpaRepo;
import com.lti.pojo.Product;

public class ProductServiceImpl  implements ProductService{

	@Autowired
	MyJpaRepo jparepo;
	
	@Override
	public List<Product> getProduct(String type) {
		return jparepo.getProduct(type);
	}

}
