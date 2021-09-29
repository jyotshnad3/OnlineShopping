package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.service.AdminService;
import com.lti.service.CartService;

import com.lti.pojo.ProductTemp;
import com.lti.pojo.Retailer;
import com.lti.service.RetailerService;



@RestController
@RequestMapping("/MyKart/rest")
public class MyRestController 
{
	
	
    @Autowired
	RetailerService rs;
    
    @Autowired
    AdminService as;
	
	@PostMapping("/productsbyretailer")
	public boolean addProduct(@RequestBody ProductTemp product)
	{
		return rs.addProduct(product);
	}
	@PutMapping("/productsbyretailer")
	public boolean updateProduct(@RequestBody ProductTemp product)
	{
		return rs.updateProduct(product);
	}
	@GetMapping("/productsbyretailer")
	public List<ProductTemp> getProductStatus()
	{
		return rs.getProductStatus();
	}
	@GetMapping("/showretailers")
	public List<Retailer> getRetailer()
	{
		return as.getRetailer();
	}

	
}
