package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Admin;
import com.lti.entity.Customer;
import com.lti.entity.CustomerAddress;
import com.lti.entity.Retailer;

@Repository("login")
public class LoginRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public Admin adminCheck(String username, String password)
	{
	
		Query q=entityManager.createQuery("select a from Admin a where a.adminUsername=:user and a.adminPassword=:pass");	
		q.setParameter("user",username);
		q.setParameter("pass",password);
		 Admin l1= (Admin) q.getSingleResult();	
		return l1;
	}
	
	@Transactional
	public Customer customerCheck(String username, String password)
	{
		
		Query q=entityManager.createQuery("select c from Customer c where c.email=:user and c.password=:pass");	
		q.setParameter("user",username);
		q.setParameter("pass",password);
		 Customer c=(Customer) q.getSingleResult();	
		return c ;
	}
	
	@Transactional
	public Retailer retailerCheck(String username, String password)
	{
		
		Query q=entityManager.createQuery("select r from Retailer r where r.retailerEmail=:user and r.retailerPassword=:pass");	
		q.setParameter("user",username);
		q.setParameter("pass",password);
		 Retailer r=(Retailer)q.getSingleResult();
		return r ;
	}
}