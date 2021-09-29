package com.lti.repository;

import java.util.List;

import com.lti.pojo.Cart;
import com.lti.pojo.Product;
import com.lti.pojo.User;
import com.lti.pojo.Wishlist;

public interface UserRepo
{ 
	public int addUser(User user);
	public User getUserById(int userid);
	
	
	
	public boolean addAddress(int userid, String address);
	public User updateUser(int userid, User user);
	
	/*public List<Cart> getCartOfUser(int userid);
	
	public List<Wishlist> getWishlistOfUser(int userid);
	
	public List<Product> findAllProductByCategory(String keyword);
	
	public Product findAllProductByProductid(int pId); 
	
	public int getUserByEmailAndPassword(String email,String password);
	public User getUserByEmail(String email); */
	

}
