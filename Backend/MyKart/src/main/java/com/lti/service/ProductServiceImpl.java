package com.lti.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.jparepos.MyJpaRepo;
import com.lti.pojo.Product;

@Service
@Transactional
public class ProductServiceImpl  implements ProductService{

	@Autowired
	MyJpaRepo jparepo;
	
	@Override
	public List<Product> getProduct(String type) {
		return jparepo.findByproductcategory(type);
	}

}
