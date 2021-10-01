package com.lti.repository;
import java.util.*;

import com.lti.pojo.ProductTemp;
import com.lti.pojo.Retailer;
public interface AdminRepo 
{
	public boolean addRetailer(Retailer r);
	public boolean acceptProduct(ProductTemp product);
	public boolean deleteProduct(int id);
	
	public List<Retailer> getRetailer();
}
