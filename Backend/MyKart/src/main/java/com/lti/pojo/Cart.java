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
@Table(name="tcart")
public class Cart {
	
	@Id
	@Column(name="cartid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cId;
	

	@Column(name="quantity")
	private int pId;
	
	//bidirectional many-to-one (Product table)
	
    @ManyToOne
	@JoinColumn(name = "productid")
	private Product cproduct;
    
    @ManyToOne
	@JoinColumn(name="userid")
    private User cUser;
    
	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public Product getCproduct() {
		return cproduct;
	}

	public void setCproduct(Product cproduct) {
		this.cproduct = cproduct;
	}

	public User getcUser() {
		return cUser;
	}

	public void setcUser(User cUser) {
		this.cUser = cUser;
	}

	@Override
	public String toString() {
		return "Cart [cId=" + cId + ", pId=" + pId + ", cproduct=" + cproduct + ", cUser=" + cUser + "]";
	}

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cart(int cId, int pId, Product cproduct, User cUser) {
		super();
		this.cId = cId;
		this.pId = pId;
		this.cproduct = cproduct;
		this.cUser = cUser;
	}
    
    
	
	

}
