package com.lti.pojo;
import java.util.*;

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
@Table(name="tcart")
public class Cart {
	
	@Id
	@Column(name="cartid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cId;
	

	@Column(name="quantity")
	private int pIdq;
	
	//bidirectional many-to-one (Product table)
	
    @OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name = "productid")
	private List<Product> product;

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public int getpIdq() {
		return pIdq;
	}

	public void setpIdq(int pIdq) {
		this.pIdq = pIdq;
	}

	@Override
	public String toString() {
		return "Cart [cId=" + cId + ", pIdq=" + pIdq + ", product=" + product + "]";
	}

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cart(int cId, int pIdq, List<Product> product) {
		super();
		this.cId = cId;
		this.pIdq = pIdq;
		this.product = product;
	}
    
	
    

	
	
	

}
