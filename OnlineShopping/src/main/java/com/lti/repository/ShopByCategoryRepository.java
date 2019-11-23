package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.entity.Product;

@Repository
public class ShopByCategoryRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Product> fetchProductByCategory(String category){
		Query q=entityManager.createQuery("select p from Product p where p.category=:category");	
		q.setParameter("category", category);
		List<Product> p= q.getResultList();
		System.out.println(p.size());
		return p;

	}
}
