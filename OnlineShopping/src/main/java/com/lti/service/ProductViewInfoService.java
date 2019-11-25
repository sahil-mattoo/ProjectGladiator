package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.entity.Product;
import com.lti.repository.ProductViewInfoRepository;

//@Service("productFetchService")
@Service
public class ProductViewInfoService {
	@Autowired
	private ProductViewInfoRepository display;
	
	public Product productDisplayOnProductPage(int productId){

		return display.productDisplayOnProductPage(productId);
	}
}
