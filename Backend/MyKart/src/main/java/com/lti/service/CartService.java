package com.lti.service;

import java.util.List;

import com.lti.pojo.Cart;

public interface CartService {

	public int addToCart(int userid, int productid);
	public boolean deleteCartBycId(int cartid); 
	public List<Cart> viewCart(int userid);
}
