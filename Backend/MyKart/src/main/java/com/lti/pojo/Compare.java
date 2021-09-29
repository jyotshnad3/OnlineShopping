package com.lti.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tcompare")
public class Compare 
{
  @Id
  private int compareid;
  private int productid;
  private int userid;
  
  @ManyToOne
	@JoinColumn(name ="productid")
	private Product compareProducts;
  
  public Product getCompareProducts() {
	return compareProducts;
}
public void setCompareProducts(Product compareProducts) {
	this.compareProducts = compareProducts;
}
public User getCompareUser() {
	return compareUser;
}
public void setCompareUser(User compareUser) {
	this.compareUser = compareUser;
}
@ManyToOne
	@JoinColumn(name = "userid")
	private User compareUser;
  
  public int getCompareid() {
	return compareid;
}
public void setCompareid(int compareid) {
	this.compareid = compareid;
}
public int getProductid() {
	return productid;
}
public void setProductid(int productid) {
	this.productid = productid;
}
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public Compare() {
	super();
	// TODO Auto-generated constructor stub
}
public Compare(int compareid, int productid, int userid) {
	super();
	this.compareid = compareid;
	this.productid = productid;
	this.userid = userid;
}
@Override
public String toString() {
	return "Compare [compareid=" + compareid + ", productid=" + productid + ", userid=" + userid + "]";
}
  
  
}
