package com.lti.pojo;

import javax.persistence.*;

@Entity
@Table(name="torderdet")
public class OrderDetails {
	
	@Id
	private long oderid;
	@Column(name="productid")
	private int productid ;
	@Column(name="pquantity")
	private int pquantity;
	public long getOderid() {
		return oderid;
	}
	public void setOderid(long oderid) {
		this.oderid = oderid;
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
	public OrderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public OrderDetails(long oderid, int productid, int pquantity) {
		super();
		this.oderid = oderid;
		this.productid = productid;
		this.pquantity = pquantity;
	}
	@Override
	public String toString() {
		return "OrderDetails [oderid=" + oderid + ", productid=" + productid + ", pquantity=" + pquantity + "]";
	}
	

 
   
	

}
