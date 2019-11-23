package com.lti.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lti.entity.Product;
import com.lti.service.ProductFetchService;

@Controller
public class ProductDisplay {
	@Autowired
	private ProductFetchService productFetch;
	
	@RequestMapping(path="productDisplay.lti",method=RequestMethod.POST)
	public ModelAndView productDisplay() {
		ModelAndView mv = new ModelAndView("prodct display demo.jsp");
		List<Product> c= productFetch.productDisplayOnProductPage();
		mv.addObject("products", c);
			return mv;
		
		
	}
	
/*	@RequestMapping(path="productDisplay.lti",method=RequestMethod.POST)
	public String productDisplay(Map m) {
		
		List<Product> c= productFetch.productDisplayOnProductPage();
		m.put("products", c);
			return "prodct display demo.jsp";
		
		
	}*/
	
}
