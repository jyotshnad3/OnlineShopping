package com.lti.jparepos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.lti.pojo.Product;

public interface MyJpaRepo extends JpaRepository<Product, String> 
{
	@Query("Select p.productname, p.productprice from Product p where p.productcategory=?1")
	public List<Product> getProduct(String name);

}
