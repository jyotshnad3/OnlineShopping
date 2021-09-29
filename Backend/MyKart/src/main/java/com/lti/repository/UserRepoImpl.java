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
		User u=new User();
		List<Cart> crt=new ArrayList<>();
		crt.add(cart);
		u.setCart(crt);
		
	}
	
	@Override
	public void addProductToWishList(Wishlist wishlist)
	{
		User u=new User();
		List<Wishlist> wshlst=new ArrayList<>();
		wshlst.add(wishlist);
		u.setWishlist(wshlst);
	}
	
	@Override
	public void addPayIdToPayment(Payments payment)
	{
		User u=new User();
		List<Payments> pymnt=new ArrayList<>();
		pymnt.add(payment);
	    u.setPayment(pymnt);
	}
	
	@Override
	public void addCompare(Compare c) 
	{
		User u=new User();
		List<Compare> cmpr=new ArrayList<>();
		cmpr.add(c);
		u.setCompare(cmpr);
	}


	
}








