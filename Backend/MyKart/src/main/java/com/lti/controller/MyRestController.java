package com.lti.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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

import com.lti.service.AdminService;
import com.lti.service.CartService;
import com.lti.pojo.Cart;
import com.lti.pojo.ProductTemp;

import com.lti.pojo.Retailer;

import com.lti.pojo.Wishlist;

import com.lti.service.RetailerService;
import com.lti.service.WishlistService;



import com.lti.pojo.User;
import com.lti.service.RetailerService;
import com.lti.service.UserService;


@RestController
@RequestMapping("/MyKart/rest")
@CrossOrigin(origins="http://localhost:4200")
public class MyRestController 
{  
	@Autowired
	UserService userservice;
	
	@GetMapping("/getAddress/{userid}")
	public List<User> getAddress(@PathVariable("userid") int userid)
	{
		return userservice.searchUser(userid);
	}
	
	@GetMapping("/getuserbyid/{userid}")
	public List<User> searchUser(@PathVariable(name="userid") int userid){
		
	return userservice.searchUser(userid);
		
	}
	
	
	
	@Autowired
	ProductService Pservice;
	
	@Autowired
	WishlistService ws;
	
	@Autowired
	RetailerService rs;
    
    @Autowired
    CartService cs;
	
	@GetMapping("/Product/{productcategory}")
	public List<Product> productcategory(@PathVariable(name="productcategory") String productcategory)
	{
		return Pservice.getProduct(productcategory);
	}
	
    
    @Autowired

    AdminService as;
    
    
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
    
	@GetMapping(path = "/cartdetailsUpdate/{cId}/{addOrMinus}")
	public boolean updateCart(@PathVariable("cId") int cId,@PathVariable("addOrMinus") int addOrMinus){
		return cs.updateCart(cId, addOrMinus);
	}
	
	
	
	@GetMapping("/wishlistdetails/{wishlistid}")
	public List<Wishlist> getwishlistDetails(@PathVariable (name="wishlistid") int wishlistid)
	{
	  	return ws.viewWishList(wishlistid);
	}

	@DeleteMapping("/wishlistdetailsD/{wishlistid}")
	public boolean deletewishlist(@PathVariable (name="wishlistid") int wishlistid)
	{
		return ws.deleteWishList(wishlistid);
	}
	
	
	@GetMapping(path = "/wishlistdetails/{wishlistid}/{productid}") 
	public int addToWishList(@PathVariable("wishlistid") int wishlistid,@PathVariable("productid") int productid)
	{
		return ws.addToWishList(wishlistid, productid);
	}

	
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
	@PutMapping("/rejectproduct")
	public boolean deleteProduct(@RequestBody ProductTemp product)
	{
		return as.deleteProduct(product);
	}
	@PostMapping("/addretailers")
	public boolean addRetailer(@RequestBody Retailer r) 
	{
		return as.addRetailer(r);
	}
	//------------------------------------------------------
	
	
	

	


}
