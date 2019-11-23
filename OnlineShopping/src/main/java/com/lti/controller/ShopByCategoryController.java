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
import com.lti.service.ProductFetchService;
import com.lti.service.ShopByCategoryService;

@Controller
public class ShopByCategoryController {

	@Autowired
	private ShopByCategoryService shop;

	@RequestMapping(path="products.lti",method=RequestMethod.GET)
	public String shoesDisplay(@RequestParam("cat") String category, Map m) {
	//	ModelAndView mv = new ModelAndView("home.jsp");
		List<Product> c= (List<Product>)shop.shopByCategory(category);
		//mv.addObject("products", c);
		//	return mv;
			m.put("shopProduct", c);
				return "home.jsp";
}
	
	@RequestMapping(path="shoes.lti",method=RequestMethod.GET)
	public String shoesDisplay(Map m) {
	//	ModelAndView mv = new ModelAndView("home.jsp");
		List<Product> c= (List<Product>)shop.shopByCategory("shoes");
		//mv.addObject("products", c);
		//	return mv;
			m.put("shopProduct", c);
				return "home.jsp";
}
	
	@RequestMapping(path="watch.lti",method=RequestMethod.GET)
	public ModelAndView watchDisplay() {
		ModelAndView mv = new ModelAndView("home.jsp");
		List<Product> c= shop.shopByCategory("watch");
		mv.addObject("product", c);
			return mv;
}
	@RequestMapping(path="clothing.lti",method=RequestMethod.GET)
	public ModelAndView clothingDisplay() {
		ModelAndView mv = new ModelAndView("home.jsp");
		List<Product> c= shop.shopByCategory("clothing");
		mv.addObject("shopProduct", c);
			return mv;
}
	
	@RequestMapping(path="mobile.lti",method=RequestMethod.GET)
	public ModelAndView mobileDisplay() {
		ModelAndView mv = new ModelAndView("home.jsp");
		List<Product> c= shop.shopByCategory("clothing");
		mv.addObject("shopProduct", c);
			return mv;
}
}