package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.lti.entity.Admin;
import com.lti.entity.Customer;
import com.lti.entity.Product;
import com.lti.entity.Retailer;
import com.lti.service.CartService;
import com.lti.service.LoginService;

@Controller
@SessionAttributes("user")

public class MainController {
	
	@Autowired	
	private CartService cartService;
	
	@Autowired
	private LoginService loginCheck;
	@Autowired
	private ViewProductInfoController productDisplay;
	
	@RequestMapping(path="adminLogin.lti",method=RequestMethod.POST)
	public String adminLogin(
			@RequestParam("adminUsername") String email, 
			@RequestParam("adminPassword") String password,
			ModelMap model) {
		try {
			Admin admin = loginCheck.adminLogin(email, password);
			model.put("user", admin);
			return "admin_dashboard.jsp";
		}
		catch(Exception e) {
			model.put("message", "Invalid Username/Password");
			return "admin_login.jsp";
		}
		
		
	}	
	
	@RequestMapping(path="CustomerLogin.lti",method=RequestMethod.POST)
	public String customerLogin(
			@RequestParam("email") String email, 
			@RequestParam("password") String password,
			ModelMap model) 
	{
		try {
			Customer customer= loginCheck.customerLogin(email, password);
			model.put("user", customer);
			return "home.html";
		}
		catch(Exception e){
			return "User_Login.jsp";
			}
		
		//Customer c = (Customer) model.get("customer");
	}	
	
	@RequestMapping(path="RetailerLogin.lti",method=RequestMethod.POST)
	public String retailerLogin(@RequestParam("retailerEmail") String email,
			@RequestParam("retailerPassword") String password,
			ModelMap model) 
	{
		
		
		ModelAndView mv=new ModelAndView("Retailer_Home.jsp");
		ModelAndView mf=new ModelAndView("Login Failed.html");
		try {
			Retailer retailer= loginCheck.retailerLogin(email, password);			
			model.put("user", retailer);
			return "Retailer_Home.jsp";
		}
		catch(Exception e){
			return "Login Failed.html";
			}
	}
	
				// Add to Cart Functionality
	@RequestMapping(path="addToCart.lti",method=RequestMethod.GET)
	public String addToCart(@RequestParam("pid") String productId,
			ModelMap model) {
	Customer c= (Customer)model.get("user");
	System.out.println(c.getName());
	cartService.addToCart(c,Integer.parseInt(productId) );
	return "home.html";
			}
	
		//View Products in Cart
	@RequestMapping(path="viewCart.lti",method=RequestMethod.GET)
	public String viewCart(
			ModelMap model) {
			double total=0.0;
	Customer c= (Customer)model.get("user");
	System.out.println(c.getName());
	List<Product> product=cartService.viewCart(c);
	for (Product p : product) {
		total=total+p.getProductPrice();
	}
	model.put("total", total);
	model.put("products", product);
	System.out.println("in view function");
	return "cart.jsp";
			}
	
	//Remove from Cart Functionality
	@RequestMapping(path="removeFromCart.lti",method=RequestMethod.GET)
	public String removeFromCart(@RequestParam("pid") String productId,
			ModelMap model) {
	Customer c= (Customer)model.get("user");
	cartService.remove(c, Integer.parseInt(productId));
System.out.println("in remove function");
				return viewCart(model);				
	}
	
	
	
	
	// Buy Now Functionality
/*@RequestMapping(path="buyNow.lti",method=RequestMethod.GET)
public String addToCart(ModelMap model) {
Customer c= (Customer)model.get("user");
return "home.html";
	}*/
	
	
	
	
			// This function is for log out(Not Working)
		@RequestMapping(path="logout.lti", method=RequestMethod.GET)
	public String logout(ModelMap model) {
	model.clear();
	return "User_Login.jsp";
	
	}
	}
	
	
	