package com.lti.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.entity.Product;
import com.lti.service.ProductViewInfoService;

@Controller
public class ViewProductInfoController {
	@Autowired
	private ProductViewInfoService productFetch;
	
	@RequestMapping(path="viewProductInfo.lti",method=RequestMethod.GET)
	public String productDisplay(@RequestParam("pid") String productId, Map m) {
		Product p= productFetch.productDisplayOnProductPage(Integer.parseInt(productId));
		m.put("product", p);
			return "prodct display demo.jsp";
		
		
	}
	
/*	@RequestMapping(path="productDisplay.lti",method=RequestMethod.POST)
	public String productDisplay(Map m) {
		
		List<Product> c= productFetch.productDisplayOnProductPage();
		m.put("products", c);
			return "prodct display demo.jsp";
		
		
	}*/
	
}
