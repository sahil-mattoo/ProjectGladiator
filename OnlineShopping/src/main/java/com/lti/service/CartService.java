package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.entity.Customer;
import com.lti.entity.Product;
import com.lti.repository.CartRepository;

@Service
public class CartService {
	
	@Autowired
	private CartRepository cartRepo;
	
	public void addToCart(Customer c, int productId) {
		cartRepo.addToCart(c, productId);
	}
	
	public List<Product> viewCart(Customer c) {
		return cartRepo.fetchProduct(c);
	}
	
	public void remove(Customer c, int productId) {
		cartRepo.removeFromCart(c, productId);
	}
	

}
