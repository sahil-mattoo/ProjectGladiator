package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.entity.Product;
import com.lti.repository.DisplayProduct;

//@Service("productFetchService")
@Service
public class ProductFetchService {
	@Autowired
	private DisplayProduct display;
	
	public List<Product> productDisplayOnProductPage(){

		return display.productDisplayOnProductPage();
	}
}
