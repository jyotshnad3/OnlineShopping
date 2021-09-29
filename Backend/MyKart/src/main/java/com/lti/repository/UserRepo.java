package com.lti.repository;

import java.util.List;

import com.lti.pojo.Order;
import com.lti.pojo.User;

public interface UserRepo{
	//public List<OrderDetail> getOrderDetailById(long oId);  //By Order ID
	public void order(long pay_Id, int uid);
	public List<Order> getOrders(int uid);

}
