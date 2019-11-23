package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Product;

@Repository
public class DisplayProduct {
	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
		public List<Product> productDisplayOnProductPage(){
		Query q=entityManager.createQuery("select p from Product p");	
		//q.setParameter("product", productName);
		List<Product> p= q.getResultList();
		System.out.println(p.size());
		return p;
	}
	
}
