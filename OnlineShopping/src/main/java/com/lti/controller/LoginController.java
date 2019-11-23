package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginCheck;
	@Autowired
	private ProductDisplay productDisplay;
	
	@RequestMapping(path="adminLogin.lti",method=RequestMethod.POST)
	public ModelAndView adminLogin(@RequestParam("adminUsername") String email, @RequestParam("adminPassword") String password) 
	{
		boolean i= loginCheck.adminLogin(email, password);
		ModelAndView mv=new ModelAndView("admin dashboard.html");
		ModelAndView mf=new ModelAndView("Login Failed.html");
		if ( i)
		{
			System.out.println("Login success");
			return mv;	
		}
		else 
		{
			System.out.println("Login failed");
			return mf;
		}	
	}	
	
	@RequestMapping(path="CustomerLogin.lti",method=RequestMethod.POST)
	public ModelAndView customerLogin(@RequestParam("email") String email, @RequestParam("password") String password) 
	{
		boolean i= loginCheck.customerLogin(email, password);
		ModelAndView mv=new ModelAndView("home.jsp");
		ModelAndView mf=new ModelAndView("Login Failed.html");
		if ( i)
		{
			System.out.println("Login success");
				productDisplay.productDisplay();
			
			return mv;	
		}
		else 
		{
			System.out.println("Login failed");
			return mf;
		}	
	
	}	
	
	@RequestMapping(path="RetailerLogin.lti",method=RequestMethod.POST)
	public ModelAndView retailerLogin(@RequestParam("retailerEmail") String email, @RequestParam("retailerPassword") String password) 
	{
		boolean i= loginCheck.retailerLogin(email, password);
		ModelAndView mv=new ModelAndView("Retailer_Home.jsp");
		ModelAndView mf=new ModelAndView("Login Failed.html");

		if ( i)
		{
			System.out.println("Login success");
			return mv;	
		}
		else 
		{
			System.out.println("Login failed");
			return mf;
		}	
	
	}	
}