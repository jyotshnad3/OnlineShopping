package com.lti.pojo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName="prototype")
@Entity
@Table(name = "twishlist")
public class Wishlist {
	@Id
	@Column(name = "wishlistid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int wId;


	@JoinColumn(name = "productid")
	private Product wProducts;


	@JoinColumn(name = "userid")
	private User wUser;


	public int getwId() {
		return wId;
	}


	public void setwId(int wId) {
		this.wId = wId;
	}


	public Product getwProducts() {
		return wProducts;
	}


	public void setwProducts(Product wProducts) {
		this.wProducts = wProducts;
	}


	public User getwUser() {
		return wUser;
	}


	public void setwUser(User wUser) {
		this.wUser = wUser;
	}


	public Wishlist() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Wishlist(int wId, Product wProducts, User wUser) {
		super();
		this.wId = wId;
		this.wProducts = wProducts;
		this.wUser = wUser;
	}


	@Override
	public String toString() {
		return "Wishlist [wId=" + wId + ", wProducts=" + wProducts + ", wUser=" + wUser + "]";
	}
	
	
	

}
