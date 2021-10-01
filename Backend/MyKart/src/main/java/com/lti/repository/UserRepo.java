package com.lti.repository;

import java.util.HashSet;
import java.util.List;


import com.lti.pojo.Order;

import com.lti.pojo.Cart;
import com.lti.pojo.Compare;
import com.lti.pojo.Payments;
import com.lti.pojo.Product;

import com.lti.pojo.User;
import com.lti.pojo.Wishlist;




public interface UserRepo
{ 
	public int addUser(User user);
	public List<User> searchUser(int userid);
	public boolean addAddress(int userid, String address);	
	public void addProductToCart(Cart cart);
	public void addProductToWishList(Wishlist wishlist);
	public void addPayIdToPayment(Payments payment);
	public void addCompare(Compare c);
	
	/*public List<Cart> getCartOfUser(int userid);
	
	public List<Wishlist> getWishlistOfUser(int userid);
	//public User updateUser(int userid, User user);
	public List<Product> findAllProductByCategory(String keyword);
	
	public Product findAllProductByProductid(int pId); 
	public User getUserById(int userid);
	public int getUserByEmailAndPassword(String email,String password);
	public User getUserByEmail(String email); */
	


}
