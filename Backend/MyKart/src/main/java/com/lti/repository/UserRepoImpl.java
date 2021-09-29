package com.lti.repository;
import java.util.*;
import com.lti.pojo.*;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.JoinColumn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.pojo.Order;
import com.lti.pojo.User;

@Repository
public class UserRepoImpl implements UserRepo {

	@Autowired
	EntityManager eMan;
	
	@Override
	public int addUser(User user) {
		eMan.persist(user);
		try {
			eMan.persist(user);
					}
		catch(Exception e)
		{
			System.out.println("Unable to add");
			return -1;
		}
		return 1;
		
	}


	@Override
	public boolean addAddress(int userid, String address) {
		
		try {

			User user = eMan.find(User.class, userid);
			user.setAddress(address);
			eMan.persist(user);

		} catch (Exception e) {
			System.out.println("unable to update address");
			return false;
		}
		return true;
		
	}

	


	@Override
	public void addProductToCart(Cart cart) 
	{
		
		eMan.persist(cart);
		System.out.println("Added product to cart");
		
	}
	
	@Override
	public void addProductToWishList(Wishlist wishlist)
	{
		eMan.persist(wishlist);
		System.out.println("Added product to wishlist");
	}
	
	@Override
	public void addPayIdToPayment(Payments payment)
	{
		eMan.persist(payment);
		System.out.println("Added payment");
	}
	
	@Override
	public void addCompare(Compare c) 
	{
		eMan.persist(c);
		System.out.println("Added to compare");
	}


	
}








