package com.lti.repository;

<<<<<<< HEAD
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.pojo.Order;

@Repository
public class UserRepoImpl implements UserRepo {

	@Autowired
	EntityManager eMan;

	@Override
	public List<Order> getOrders(int uid) {
		List<Order> l=eMan.createQuery("from Order").getResultList();
		return l;
	}

	@Override
	public void order(long pay_Id, int uid) {
		// TODO Auto-generated method stub
		return;
	}
=======
import java.util.ArrayList;
import java.util.List;
>>>>>>> 8f6eb4e57a1c263bed33faa7f9234647e50574aa

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.pojo.Cart;
import com.lti.pojo.Compare;
import com.lti.pojo.Payments;
import com.lti.pojo.User;
import com.lti.pojo.Wishlist;

@Repository
public class UserRepoImpl implements UserRepo 
{

	@Autowired
	EntityManager eMan;
	
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







