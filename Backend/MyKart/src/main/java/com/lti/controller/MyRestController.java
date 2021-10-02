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


import com.lti.service.CartService;
import com.lti.pojo.Cart;
import com.lti.pojo.ProductTemp;

import com.lti.service.RetailerService;



@RestController
@RequestMapping("/MyKart/rest")
@CrossOrigin(origins="http://localhost:4200")
public class MyRestController 
{

	@Autowired
	ProductService Pservice;
	
	@GetMapping("/Product/{productcategory}")
	public List<Product> productcategory(@PathVariable(name="productcategory") String productcategory)
	{
		return Pservice.getProduct(productcategory);
	}
	
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

	}*/
	
}
