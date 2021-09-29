package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;


import com.lti.pojo.Cart;
import com.lti.pojo.Compare;
import com.lti.pojo.Payments;
import com.lti.pojo.User;
import com.lti.pojo.Wishlist;
import com.lti.repository.UserRepo;

public class UserServiceImpl implements UserService
{
	 @Autowired
	  UserRepo urepo;

	// @Autowired
	//   MyJPARepo jpaRepo;
	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean addAddress(int userid, String address) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User updateUser(int userid, User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addProductToCart(Cart cart) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addProductToWishList(Wishlist wishlist) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addPayIdToPayment(Payments payment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addCompare(Compare c) {
		// TODO Auto-generated method stub
		
	} 
	

}
