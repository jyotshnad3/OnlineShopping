package com.lti.pojo;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

public class Payments 
{
	private long payid;
	private String paytype;

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "userid")
	private User userid;

	public long getPayid() {
		return payid;
	}

	public void setPayid(long payid) {
		this.payid = payid;
	}

	public String getPaytype() {
		return paytype;
	}

	public void setPaytype(String paytype) {
		this.paytype = paytype;
	}

	public User getUserid() {
		return userid;
	}

	public void setUserid(User userid) {
		this.userid = userid;
	}

	public Payments(long payid, String paytype, User userid) {
		super();
		this.payid = payid;
		this.paytype = paytype;
		this.userid = userid;
	}

	public Payments() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Payments [payid=" + payid + ", paytype=" + paytype + "]";
	}
	
	

}
