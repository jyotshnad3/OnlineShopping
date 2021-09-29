package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.pojo.Product;
import com.lti.pojo.ProductTemp;
import com.lti.pojo.Retailer;
@Repository
public class AdminRepoImpl implements AdminRepo
{
	@Autowired
	EntityManager eMan;
	
	Product p=new Product();

	@Override
	public boolean addRetailer(Retailer r) 
	{
		eMan.persist(r);
		return true;
	}

	@Override
	public boolean acceptProduct(ProductTemp product) 
	{
		p.setProductid(product.getTempproductid());
		p.setProductname(product.getTempproductname());
		p.setProductbrand(product.getTempproductbrand());
		p.setProductcategory(product.getTempproductcategory());
		p.setProductdesc(product.getTempproductdesc());
		p.setProductimage(product.getTempproductimage());
		p.setProductprice(product.getTempproductprice());
		p.setProductquantity(product.getTempproductquantity());
		p.setProductsubcategory(product.getTempproductsubcategory());
		p.setRetailerid(product.getTretailerid());
		eMan.persist(p);
		eMan.remove(product);
		return true;
	}

	@Override
	public boolean deleteProduct(ProductTemp product) {
		eMan.remove(product);
		return true;
	}

	@Override
	public List<Retailer> getRetailer() {
		List<Retailer> l=eMan.createQuery("from Retailer").getResultList();
		return l;
		
	}

	
}
