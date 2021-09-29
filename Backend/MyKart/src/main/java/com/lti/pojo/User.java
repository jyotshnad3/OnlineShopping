package com.lti.pojo;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;




@Entity
@Table(name="tuser")
public class User 
{
    @Id
    private int userid;
    private String name;
    private String emailid;
    private String address;
    private int mobileno;
    private String password;
    
    @OneToMany(mappedBy = "twishlist", cascade = CascadeType.ALL)
    @JoinColumn(name="UserID", referencedColumnName="userid")
	private List<Wishlist> wishlist;
    
    @OneToMany(mappedBy = "tcompare", cascade = CascadeType.ALL)
    @JoinColumn(name="UserID", referencedColumnName="userid")
	private List<Compare> compare;
    
    @OneToMany(mappedBy = "tcart", cascade = CascadeType.ALL)
    @JoinColumn(name="UserID", referencedColumnName="userid")
	private List<Cart> cart;
    
    @OneToMany(mappedBy = "tpayment", cascade = CascadeType.ALL)
    @JoinColumn(name="UserID", referencedColumnName="userid")
	private List<Payments> payment;
    
    
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMobileno() {
		return mobileno;
	}
	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int userid, String name, String emailid, String address, int mobileno, String password) {
		super();
		this.userid = userid;
		this.name = name;
		this.emailid = emailid;
		this.address = address;
		this.mobileno = mobileno;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", name=" + name + ", emailid=" + emailid + ", address=" + address
				+ ", mobileno=" + mobileno + ", password=" + password + "]";
	}
    
    
}
