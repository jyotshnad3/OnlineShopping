package com.lti.repository;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.lti.pojo.ProductTemp;
@Repository
public class RetailerRepoImpl implements RetailerRepo
{
	@Autowired
	EntityManager eMan;

	@Override
	public boolean addProduct(ProductTemp product) 
	{
		eMan.persist(product);
		return true;
	}

	@Override
	public boolean updateProduct(ProductTemp product) 
	{
		eMan.merge(product);
		return true;
		
	}

	@Override
	public List<ProductTemp> getProductStatus() 
	{
		List<ProductTemp> l=eMan.createQuery("from ProductTemp").getResultList();
		return l;
	}

}
