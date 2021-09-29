package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.pojo.Order;

@Repository
public class UserRepoImpl implements UserRepo {

	@Autowired
	EntityManager eMan;

	@Override
	public List<Order> getOrders(int uid) {
		List<Order> l=eMan.createQuery("from Order").getResultList();
		return l;
	}

	@Override
	public void order(long pay_Id, int uid) {
		// TODO Auto-generated method stub
		return;
	}

}







