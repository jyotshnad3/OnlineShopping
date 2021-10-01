package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.lti.pojo.Product;
import com.lti.service.ProductService;


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
	ProductService Pservice;
	
	@GetMapping("/Product/{productcategory}")
	public List<Product> productcategory(@PathVariable(name="productcategory") String productcategory)
	{
		return Pservice.getProduct(productcategory);
	}
	
	
	
	@Autowired
	RetailerService rs;
    
    @Autowired
    AdminService as;
    
   
	
	@PostMapping("/addproductsbyretailer")
	public boolean addProduct(@RequestBody ProductTemp product)
	{
		return rs.addProduct(product);
	}
	@PutMapping("/updateproductsbyretailer")
	public boolean updateProduct(@RequestBody ProductTemp product)
	{
		return rs.updateProduct(product);
	}
	@GetMapping("/productstatus")
	public List<ProductTemp> getProductStatus()
	{
		return rs.getProductStatus();

	}
   //----------------------------------------------------
	@GetMapping("/showretailers")
	public List<Retailer> getRetailer()
	{
		return as.getRetailer();
	}
	@PostMapping("/acceptproduct")
	public boolean acceptProduct(@RequestBody ProductTemp product)  //********
	{
		return as.acceptProduct(product);
	}
	@DeleteMapping("/rejectproduct/{id}")
	public boolean deleteProduct(@PathVariable(name="id")int id)
	{
		return as.deleteProduct(id);
	}
	@PostMapping("/addretailers")
	public boolean addRetailer(@RequestBody Retailer r) 
	{
		return as.addRetailer(r);
	}
	//------------------------------------------------------
	
	
	

	
}
