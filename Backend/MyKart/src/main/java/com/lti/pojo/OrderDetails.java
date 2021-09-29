package com.lti.pojo;

import javax.persistence.*;

@Entity
@Table(name="torderdet")
public class OrderDetails {
	
	@Id
<<<<<<< HEAD
=======
	@Column(name="orderid")
>>>>>>> 9aa24f1eabbcd665183c1f56809acb78689d6155
	private long orderid;
	@Column(name="productid")
	private int productid ;
	@Column(name="pquantity")
	private int pquantity;
<<<<<<< HEAD
	
	public long getOrderid() {
		return orderid;
	}
	public void setOrderid(long orderid) {
		this.orderid = orderid;
=======
	public long getOrderid() {
		return orderid;
	}
	public void setOderid(long oderid) {
		this.orderid = oderid;
>>>>>>> 9aa24f1eabbcd665183c1f56809acb78689d6155
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
	public OrderDetails(long orderid, int productid, int pquantity) {
		super();
<<<<<<< HEAD
		this.orderid = orderid;
=======
		this.orderid = oderid;
>>>>>>> 9aa24f1eabbcd665183c1f56809acb78689d6155
		this.productid = productid;
		this.pquantity = pquantity;
	}
	@Override
	public String toString() {
<<<<<<< HEAD
		return "OrderDetails [orderid=" + orderid + ", productid=" + productid + ", pquantity=" + pquantity + "]";
=======
		return "OrderDetails [oderid=" + orderid + ", productid=" + productid + ", pquantity=" + pquantity + "]";
>>>>>>> 9aa24f1eabbcd665183c1f56809acb78689d6155
	}
	
	
	
	

 
   
	

}
