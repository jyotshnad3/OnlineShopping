package com.lti.pojo;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



@Entity
@Table(name = "twishlist")
public class Wishlist {
	@Id
	@Column(name = "wishlistid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int wId;


	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name = "productid")
	private List<Product> wProducts;


	@Override
	public String toString() {
		return "Wishlist [wId=" + wId + ", wProducts=" + wProducts + "]";
	}


	public Wishlist() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Wishlist(int wId, List<Product> wProducts) {
		super();
		this.wId = wId;
		this.wProducts = wProducts;
	}


	public int getwId() {
		return wId;
	}


	public void setwId(int wId) {
		this.wId = wId;
	}


	public List<Product> getwProducts() {
		return wProducts;
	}


	public void setwProducts(List<Product> wProducts) {
		this.wProducts = wProducts;
	}

    
	
	

}
