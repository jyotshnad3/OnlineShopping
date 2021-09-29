package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.pojo.Cart;
import com.lti.pojo.Product;
import com.lti.pojo.User;

@Repository
public class CartRepoImpl implements CartRepo{
    
	@Autowired
	private EntityManager eMan;
	
	

	@Override
	public int addToCart(int cartid, int productid) {
		// TODO Auto-generated method stub
		try {
		/*if(c)
		Product p=eMan.find(Product.class, productid);
		
		Cart cart=new Cart();
		 cart.setProduct(p);;
		cart.setProduct(p);;;
		cart.setpIdq(1);
		eMan.persist(cart);///by default 1 quantity
		//u.addProductToCart(cart);
		//p.addProductToCart(cart);
		//eMan.persist(u);
		//eMan.persist(p);*/


		return 1;
	}
		catch(Exception e)
		{
			return -1;
		}
		

	}

	@Override
	public boolean deleteCartBycId(int cartid) {
		// TODO Auto-generated method stub
		try {
			Cart cart = eMan.find(Cart.class, cartid);
			eMan.remove(cart);

		} catch (Exception e) {
			System.out.println("no product deleted or no product there to delete");
		}
		return true;
	}

	@Override
	public List<Cart> viewCart(int userid) {
		// TODO Auto-generated method stub
		
		List<Cart> cart = null;
		Query qy=eMan.createQuery("Select e from Cart e where e.cUser.userid=:uId");
		try {
			qy.setParameter("uId", userid);
			cart = qy.getResultList();
		}

		catch (Exception e) {
			System.out.println(" no products in cart");
		}
		return cart;
	}
	

}
