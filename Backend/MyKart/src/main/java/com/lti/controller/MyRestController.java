package com.lti.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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


import com.lti.service.AdminService;
import com.lti.service.CartService;
import com.lti.dto.CartMyDTO;
import com.lti.dto.WishlistMyDTO;
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
	
	@Autowired
	ProductService Pservice;
	
	@Autowired
	WishlistService ws;
	
	@Autowired
	RetailerService rs;
    
    @Autowired
    CartService cs;
	
	@GetMapping("/getAddress/{userid}")
	public List<User> getAddress(@PathVariable("userid") int userid)
	{
		return userservice.searchUser(userid);
	}
	
	@GetMapping("/getuserbyid/{userid}")
	public List<User> searchUser(@PathVariable(name="userid") int userid){
		
	return userservice.searchUser(userid);
		
	}

	
	
    @PostMapping(path = "getCart/{cartid}")
	public List<CartMyDTO> getMyCart(@PathVariable("cartid") int cartid){
		List<CartMyDTO> dto = cs.findviewCart(cartid);
		return dto;
	}
	
	@GetMapping("/Product/{productcategory}")
	public List<Product> productcategory(@PathVariable(name="productcategory") String productcategory)
	{
		return Pservice.getProduct(productcategory);
	}
<<<<<<< HEAD
=======


	
<<<<<<< HEAD
	@GetMapping("/Product")
	public List<Product> showProducts()
	{
		return Pservice.showallProduct();
	}

	@GetMapping("/Product/search/{productname}")
	public List<Product> productsearch(@PathVariable(name="productname") String productname)
	{
		return Pservice.search(productname);
	}
	
	@GetMapping("/Product/{productcategory}/{productsubcategory}")
	public List<Product> Categ_subCate(@PathVariable(name="productcategory") String productcategory, @PathVariable(name="productsubcategory") String productsubcategory)
	{
		return Pservice.cate_subcate(productcategory,productsubcategory);
	}
	
	@GetMapping("/Product/search/{productname}/filter/{productbrand}")
	public List<Product> filterbybrand(@PathVariable(name="productname") String productname, @PathVariable(name="productbrand") String productbrand)
	{
		return Pservice.filter(productname,productbrand);
	}
	
	@GetMapping("/Product/search/{productname}/filter/{productbrand}/sort1")
	public List<Product> lowtohighf(@PathVariable(name="productname") String productname, @PathVariable(name="productbrand") String productbrand)
	{
		return Pservice.lowtohighfilter(productname, productbrand);
	}
	
	
	@GetMapping("/Product/search/{productname}/filter/{productbrand}/sort2")
	public List<Product> hightolowf(@PathVariable(name="productname") String productname, @PathVariable(name="productbrand") String productbrand)
	{
		return Pservice.hightolowfilter(productname, productbrand);
	}
	
	@GetMapping("/Product/search/{productname}/filter/{productbrand}/{minprice}/{maxprice}")
	public List<Product> priceFilters(@PathVariable(name="productname") String productname, @PathVariable(name="productbrand") String productbrand,@PathVariable(name="minprice") int minprice, @PathVariable(name="maxprice") int maxprice)
	{
		return Pservice.priceFilter(productname, productbrand, minprice, maxprice);
	}
	
	@GetMapping("/Product/search/{productname}/sort1")
	public List<Product> lowtohighf_(@PathVariable(name="productname") String productname)
	{
		return Pservice.lowtohighfilter_(productname);
	}
	
	@GetMapping("/Product/search/{productname}/sort2")
	public List<Product> hightolowf_(@PathVariable(name="productname") String productname)
	{
		return Pservice.hightolowfilter_(productname);
	}
	
	/*

	@Autowired
	RetailerService rs;
=======


	

>>>>>>> 1c05f4a7f5d8b85793e1ed66450be20289e5ac7d
	
>>>>>>> 3b10650616e81ea7aecc83fbee748ec2f7e49a47
    
    @Autowired

    AdminService as;
    
<<<<<<< HEAD
=======


>>>>>>> 1c05f4a7f5d8b85793e1ed66450be20289e5ac7d
    
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

	
	@GetMapping(path = "getWishlist/{wishlistid}")
	public List<WishlistMyDTO> getMyWishlist(@PathVariable("wishlistid") int wishlistid){
		List<WishlistMyDTO> dto = ws.findviewWishList(wishlistid);
		return dto;
	}
	
	
	@PostMapping("/productsbyretailer")

	//@PostMapping("/addproductsbyretailer")

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

<<<<<<< HEAD
	}*/
=======
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
>>>>>>> 3b10650616e81ea7aecc83fbee748ec2f7e49a47
	
}
