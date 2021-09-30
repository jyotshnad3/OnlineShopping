package com.lti.jparepos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.lti.pojo.Product;

public interface MyJpaRepo extends JpaRepository<Product, String> 
{
	
	//@Query("Select p from Product p where p.productcategory LIKE %:type%")
	//Printing Product by category
	public List<Product> findByproductcategory(String type);
	
	@Query("Select p from Product p where p.productname LIKE %:type%")
	public List<Product> searchproduct(String type);

}
