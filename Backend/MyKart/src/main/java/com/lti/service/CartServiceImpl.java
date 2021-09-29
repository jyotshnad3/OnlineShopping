package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.lti.pojo.Cart;
import com.lti.repository.CartRepo;
import com.lti.repository.UserRepo;

public class CartServiceImpl implements CartService{
   
	@Autowired
	private CartRepo cartrepo;
	
	@Autowired
	private UserRepo userrepo;
	
	
	@Override
	public int addToCart(int userid, int productid) {
		// TODO Auto-generated method stub
		return cartrepo.addToCart(userid, productid);
	}

	@Override
	public boolean deleteCartBycId(int cartid) {
		// TODO Auto-generated method stub
		return cartrepo.deleteCartBycId(cartid);
	}

	@Override
	public List<Cart> viewCart(int userid) {
		// TODO Auto-generated method stub
		return cartrepo.viewCart(userid);
		
	}

}
