package com.lti.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.pojo.Cart;
import com.lti.repository.CartRepo;
import com.lti.repository.UserRepo;
@Service
@Transactional
public class CartServiceImpl implements CartService{
   
	@Autowired
	private CartRepo cartrepo;
	
	@Autowired
	private UserRepo userrepo;
	
	
	@Override
	public int addToCart(int cartid, int productid) {
		// TODO Auto-generated method stub
		return cartrepo.addToCart(cartid, productid);
	}

	@Override
	public boolean deleteCartBycId(int cartid) {
		// TODO Auto-generated method stub
		return cartrepo.deleteCartBycId(cartid);
	}

	@Override
	public List<Cart> viewCart(int cartid) {
		// TODO Auto-generated method stub
		return cartrepo.viewCart(cartid);
		
	}

	@Override
	public boolean updateCart(int cId, int addOrMinus) {
		// TODO Auto-generated method stub
		return cartrepo.updateCart(cId, addOrMinus);
	}

}
