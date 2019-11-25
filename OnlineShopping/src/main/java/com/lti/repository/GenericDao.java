package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.Order;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.*;

@Repository("repo")
public class GenericDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void add(Object object)
	{
		entityManager.persist(object);
	}
	
	@Transactional
	public void remove(Object object)
	{
		entityManager.remove(object);
	}
	@Transactional
	public Object fetchById(Class clazz, Object pk)
	{
		return entityManager.find(clazz, pk);
		
	}
	@Transactional
	public void queryTest() {
		
		Query q=entityManager.createQuery("select ca from CustomerAddress as ca where ca.addressId=1");
		//q.setParameter("cid",1);
		List  <CustomerAddress> a=q.getResultList();
		
		for (CustomerAddress add : a) {
			System.out.println(add.getCity());
	
	}
	}
	@Transactional
	public  List<Orders>fetchCustOrder()
	{
		Query q=entityManager.createQuery("select o from Orders as o where o.customer.customerId=:custid");
		q.setParameter("custid", 1);
		List <Orders> order=q.getResultList();
		return order;
	}
	
	@Transactional
	public  List<OrderItems>fetchOrderforOrderItem()
	{
		Query q=entityManager.createQuery("select o from OrderItems as o where o.order.orderId=:orderId");
		q.setParameter("orderId", 1);
		List <OrderItems> orderItems=q.getResultList();
		return orderItems;
	}
	}
