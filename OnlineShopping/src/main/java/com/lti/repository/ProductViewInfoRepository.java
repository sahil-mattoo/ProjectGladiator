package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Product;

@Repository
public class ProductViewInfoRepository {
	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
		public Product productDisplayOnProductPage(int productId){
		Query q=entityManager.createQuery("select p from Product p where p.productId=:pid");	
		q.setParameter("pid", productId);
		Product p=(Product) q.getSingleResult();
		System.out.println(p);
		return p;
	}
	
}
