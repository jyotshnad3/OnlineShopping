package com.lti.repository;

import java.util.HashSet;
import java.util.List;

<<<<<<< HEAD
import com.lti.pojo.Order;
=======
import com.lti.pojo.Cart;
import com.lti.pojo.Compare;
import com.lti.pojo.Payments;
import com.lti.pojo.Product;
>>>>>>> 8f6eb4e57a1c263bed33faa7f9234647e50574aa
import com.lti.pojo.User;
import com.lti.pojo.Wishlist;

<<<<<<< HEAD
public interface UserRepo{
	//public List<OrderDetail> getOrderDetailById(long oId);  //By Order ID
	public void order(long pay_Id, int uid);
	public List<Order> getOrders(int uid);
=======
public interface UserRepo
{ 
	public int addUser(User user);
	
	public boolean addAddress(int userid, String address);
	public User updateUser(int userid, User user);
	
	public void addProductToCart(Cart cart);
	public void addProductToWishList(Wishlist wishlist);
	public void addPayIdToPayment(Payments payment);
	public void addCompare(Compare c);
	
	/*public List<Cart> getCartOfUser(int userid);
	
	public List<Wishlist> getWishlistOfUser(int userid);
	
	public List<Product> findAllProductByCategory(String keyword);
	
	public Product findAllProductByProductid(int pId); 
	public User getUserById(int userid);
	public int getUserByEmailAndPassword(String email,String password);
	public User getUserByEmail(String email); */
	
>>>>>>> 8f6eb4e57a1c263bed33faa7f9234647e50574aa

}
