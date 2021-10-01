package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.pojo.Wishlist;
import com.lti.repository.WishlistRepo;

@Service
@Transactional
public class WishlistServiceImpl implements WishlistService{
	
	@Autowired
	private WishlistRepo wrepo;

	@Override
	public int addToWishList(int wishlistid, int productid) {
		// TODO Auto-generated method stub
		return wrepo.addToWishList(wishlistid, productid);
	}

	@Override
	public boolean deleteWishList(int wishlistid) {
		// TODO Auto-generated method stub
		return wrepo.deleteWishList(wishlistid);
	}

	@Override
	public List<Wishlist> viewWishList(int wishlistid) {
		// TODO Auto-generated method stub
		return wrepo.viewWishList(wishlistid);
	}
	
	
	

}
