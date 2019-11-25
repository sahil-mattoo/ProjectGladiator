package com.lti.repository;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Cart;
import com.lti.entity.CartItems;
import com.lti.entity.Customer;
import com.lti.entity.OrderItems;
import com.lti.entity.Product;

@Repository
public class CartRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	GenericDao dao;

	@Transactional
	public void addToCart(Customer c, int productId) {
		
		System.out.println(c.getName());
		System.out.println(productId);
		int cid=c.getCustomerId();
		Query q=entityManager.createQuery("select c from Cart as c where c.customer.customerId=:cid ");
		q.setParameter("cid", cid);	
		Cart cart= 
		cart=(Cart)q.getSingleResult();

		Query q1=entityManager.createQuery("select p from Product as p where p.productId=:pid ");
		q1.setParameter("pid", productId);
		Product product
		=(Product)q1.getSingleResult();
		CartItems cartItems= new CartItems();
		cartItems.setCart(cart);
		cartItems.setProduct(product);
		cartItems.setQuantity(1);
		dao.add(cartItems);
		System.out.println("item added");
		
		

		
		
		
	//	Query q=entityManager.createQuery("insert intoProduct p where p.category=:category");	
		//q.setParameter("category", category);
		//List<Product> p= q.getResultList();
	//	System.out.println(p.size());
		
		
	}
	
	
	@Transactional
	public List<Product> fetchProduct(Customer c) {
		int cid=c.getCustomerId();
		System.out.println(cid);
		Query q=entityManager.createQuery("	select p from Cart c join c.cartItems ci join ci.product p where c.customer.customerId = :cid");	
		q.setParameter("cid", cid);	
		List<Product> item=q.getResultList();
		System.out.println(item.size());
		for (Product product : item) {
			System.out.println(product.getProductName());
		}
		return item;
		
	/*int cid=c.getCustomerId();
		System.out.println(cid);
		Query q=entityManager.createQuery("select c from Cart as c where c.customer.customerId=:cid");	
		q.setParameter("cid", cid);	
		Cart cart= 
		cart=(Cart)q.getSingleResult();
		int cartId= cart.getCartId();
		System.out.println(cartId);
		Query q1=entityManager.createQuery
	("select p from CartItems as c join c.product p where c.cart.cartId=:cid");
		q1.setParameter("cid", cartId);
		List<Product> item=q.getResultList();
		System.out.println("products fetched");
		System.out.println(item.size());
		for (Product product : item) {
			System.out.println(product.getProductName());
		}
		return item;
		*/
		
	}
	
	
	@Transactional
	public void removeFromCart(Customer c, int productId) {
		
		System.out.println(c.getName());
		System.out.println(productId);
		int cid=c.getCustomerId();
		Query q=entityManager.createQuery("select c from Cart as c where c.customer.customerId=:cid ");
		q.setParameter("cid", cid);	
		Cart cart= 
		cart=(Cart)q.getSingleResult();

		Query q1=entityManager.createQuery("select c from CartItems as c where c.product.productId=:pid and c.cart.cartId=:cid");
		q1.setParameter("pid", productId);
		q1.setParameter("cid", cart.getCartId());
		CartItems cartItems= (CartItems) q1.getSingleResult();

		dao.remove(cartItems);
		System.out.println("item removed");
		
	}
	
	
}
