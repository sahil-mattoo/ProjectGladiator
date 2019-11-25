package com.lti.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.entity.Orders;
import com.lti.service.OrderHistoryService;



@Controller
public class OrderHistoryController {

	@Autowired
	private OrderHistoryService orderHistoryService  ;
	
	@RequestMapping(path="history.lti", method=RequestMethod.POST)
	public ModelAndView ModelAndView (HttpServletRequest request)
	{
		 int customerId=Integer.parseInt(request.getParameter("customerId"));
		 System.out.println("In Controller:"+customerId);
		 ModelAndView mv=new ModelAndView("History.jsp");
		 List<Orders>c= orderHistoryService.historyService(customerId);
		 mv.addObject("orders",c);
		return mv;
	}
}

