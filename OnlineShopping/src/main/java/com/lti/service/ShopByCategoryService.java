package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.entity.Product;
import com.lti.repository.ShopByCategoryRepository;

@Service
public class ShopByCategoryService {
	
	@Autowired
	private ShopByCategoryRepository shopByCategory;
	
	public List<Product> shopByCategory(String category){
		
		List<Product> p= shopByCategory.fetchProductByCategory(category);
		return p;
	}

	
}
