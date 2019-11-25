package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.entity.Orders;
import com.lti.repository.OrderHistoryRepository;

@Service
public class OrderHistoryService {

	   @Autowired
	   OrderHistoryRepository orderHistoryRepository;
	   
	   public List historyService(int customerId)
	   {
		    System.out.println("In service"+customerId);
		    List<Orders> list= orderHistoryRepository.history_repo(customerId);
		   for (Orders orders : list) {
			System.out.println(orders.getCustomer());
		}
		     return list;
	   }
	 
}
