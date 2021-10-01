package com.lti.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.jparepos.MyJpaRepo;
import com.lti.pojo.Product;

import com.lti.repository.ProductRepo;


@Service
@Transactional
public class ProductServiceImpl  implements ProductService
{
	@Autowired
	MyJpaRepo jparepo;

	@Override
	public List<Product> getProduct(String type) {
		return jparepo.findByproductcategory(type);
	}

	@Override
	public List<Product> search(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}

