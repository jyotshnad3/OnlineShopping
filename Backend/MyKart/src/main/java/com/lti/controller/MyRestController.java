package com.lti.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;


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

import com.lti.service.CartService;
import com.lti.pojo.Cart;
import com.lti.pojo.ProductTemp;
import com.lti.pojo.User;
import com.lti.service.RetailerService;
import com.lti.service.UserService;

@RestController
@RequestMapping("/MyKart/rest")
public class MyRestController 
{  
	@Autowired
	UserService userservice;
	
	@GetMapping("/getAddress/{userid}")
	public List<User> getAddress(@PathVariable("userid") int userid)
	{
		return userservice.searchUser(userid);
	}
	/*
	@GetMapping("/getuserbyid/{userid}")
	public List<User> searchUser(@PathVariable(name="userid") int userid){
		
	return userservice.searchUser(userid);
		
	}
	/*
	
	
	@Autowired
	ProductService Pservice;
	
	@GetMapping("/Product/{productcategory}")
	public List<Product> productcategory(@PathVariable(name="productcategory") String productcategory)
	{
		return Pservice.getProduct(productcategory);
	}
	
	
	/*
	@Autowired
	RetailerService rs;
    
    @Autowired
    CartService cs;
    
    @GetMapping("/cartdetails/{cartid}")
	public List<Cart> getCartDetails(@PathVariable (name="cartid") int cartid)
	{
	  	return cs.viewCart(cartid);
	}

	@DeleteMapping("/cartdetailsD/{cartid}")
	public boolean deleteVehicle(@PathVariable (name="cartid") int cartid)
	{
		return cs.deleteCartBycId(cartid);
	}
	
	
	@GetMapping(path = "/cartdetails/{cartid}/{productid}") 
	public int addToCartList(@PathVariable("cartid") int cartid,@PathVariable("productid") int productid)
	{
		return cs.addToCart(cartid, productid);
	}
    
	
	@PostMapping("/productsbyretailer")
	public boolean addProduct(@RequestBody ProductTemp product)
	{
		return rs.addProduct(product);
	}
	@PutMapping("/productsbyretailer")
	public boolean updateVehicle(@RequestBody ProductTemp product)
	{
		return rs.updateProduct(product);
	}
	@GetMapping("/productsbyretailer")
	public List<ProductTemp> getProductStatus()
	{
		return rs.getProductStatus();

	}
	*/
}
