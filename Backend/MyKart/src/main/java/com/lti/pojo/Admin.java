package com.lti.pojo;
import javax.persistence.*;
@Entity
@Table(name="tadmin")
public class Admin 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int adminid;
	private String adminname;
	private String adminemail;
	private String adminpassword;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name ="productid",referencedColumnName = "tempproductid")
	private ProductTemp pt;

	public int getAdminid() 
	{
		return adminid;
	}

	public void setAdminid(int adminid) 
	{
		this.adminid = adminid;
	}

	public String getAdminname() 
	{
		return adminname;
	}

	public void setAdminname(String adminname) 
	{
		this.adminname = adminname;
	}

	public String getAdminemail() 
	{
		return adminemail;
	}

	public void setAdminemail(String adminemail) 
	{
		this.adminemail = adminemail;
	}

	public String getAdminpassword() 
	{
		return adminpassword;
	}

	public void setAdminpassword(String adminpassword) 
	{
		this.adminpassword = adminpassword;
	}

	public ProductTemp getPt() 
	{
		return pt;
	}

	public void setPt(ProductTemp pt) 
	{
		this.pt = pt;
	}

	public Admin() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(int adminid, String adminname, String adminemail, String adminpassword, ProductTemp pt) 
	{
		super();
		this.adminid = adminid;
		this.adminname = adminname;
		this.adminemail = adminemail;
		this.adminpassword = adminpassword;
		this.pt = pt;
	}

	@Override
	public String toString() {
		return "Admin [adminid=" + adminid + ", adminname=" + adminname + ", adminemail=" + adminemail
				+ ", adminpassword=" + adminpassword + ", pt=" + pt + "]";
	}
	
	
	
	
	

}
