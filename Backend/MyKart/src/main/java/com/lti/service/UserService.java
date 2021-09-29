package com.lti.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.pojo.Cart;
import com.lti.pojo.Compare;
import com.lti.pojo.Payments;
import com.lti.pojo.Product;
import com.lti.pojo.User;
import com.lti.pojo.Wishlist;

@Service
@Transactional
public interface UserService 
{
	
    public int addUser(User user);
	public boolean addAddress(int userid, String address);
	public User updateUser(int userid, User user);
	public void addProductToCart(Cart cart);
	public void addProductToWishList(Wishlist wishlist);
	public void addPayIdToPayment(Payments payment);
	public void addCompare(Compare c);
	
	
	
	
	
	/*
	public User findupdateUser(int userid, User user);
	public int findgetUserByEmailAndPassword(String email,String password);
	public List<Cart> findgetCartOfUser(int uId);
	public List<Wishlist> findgetWishlistOfUser(int userid);
	public int generateOTP(String email);
	public List<Product> getAllProductByCat(String keyword);
	public Product getAllProductByProductid(int productid);
	public int generateOTPById(int uId);
	public double getCartAmount(int uId);
	public long makePayment(Payments payment); */
}
