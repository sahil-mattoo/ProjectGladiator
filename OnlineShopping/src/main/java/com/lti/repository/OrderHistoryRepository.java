package com.lti.repository;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NamedQuery;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.entity.Orders;

@Repository
public class OrderHistoryRepository {
	
	@PersistenceContext
	private EntityManager entityManager;

	 public List<Orders> history_repo(int customerId){
		 System.out.println("In repo:"+customerId);
		 @SuppressWarnings("unchecked")
		//Searching-- Query q= entityManager.createQuery("select a from Product a where a.productName=:product");
		Query q= entityManager.createQuery("select o from Orders o where o.customer.customerId=:customerid");
		 //Query q= entityManager.createQuery(" ");
		 
		 //Query q= entityManager.createQuery("select o from orders o INNER JOIN o.customers c");
		 q.setParameter("customerid",customerId);
		// Searching--q.setParameter("product",productName); //"%"+productName+"%");	 
	     List<Orders> list=q.getResultList();
	     for(Orders order:list)
	     {	    	 
	    	 System.out.println(order.getOrderDate());
	    	 System.out.println(order.getStatus());
	     }
	     return list;
		 
	 }
}
