package com.lti.repository;

import java.util.List;

import com.lti.pojo.Cart;

public interface CartRepo {

	public int addToCart(int userid, int productid);
	public boolean deleteCartBycId(int cartid); 
	public List<Cart> viewCart(int userid);
	
}
