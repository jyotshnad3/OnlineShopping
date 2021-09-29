package com.lti.pojo;

import javax.persistence.*;

public class OrderDetails {
	
	private long oid;
	private int productid ;
	private int pquantity;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "productid")
	private Product product;

	public long getOid() {
		return oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public int getPquantity() {
		return pquantity;
	}

	public void setPquantity(int pquantity) {
		this.pquantity = pquantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public OrderDetails(long oid, int productid, int pquantity, Product product) {
		super();
		this.oid = oid;
		this.productid = productid;
		this.pquantity = pquantity;
		this.product = product;
	}

	public OrderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "OrderDetails [oid=" + oid + ", productid=" + productid + ", pquantity=" + pquantity + "]";
	}
	
	

}
