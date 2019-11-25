package com.lti.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.entity.Product;
import com.lti.service.ProductViewInfoService;
import com.lti.service.ShopByCategoryService;

@Controller
public class ShopByCategoryController {

	@Autowired
	private ShopByCategoryService shop;

	@RequestMapping(path="products.lti",method=RequestMethod.GET)
	public String shoesDisplay(@RequestParam("cat") String category, Map m) {
List<Product> c= (List<Product>)shop.shopByCategory(category);
System.out.println("controller "+c.size());
			m.put("shopProduct", c);
				return "home.jsp";
}
	
	
}