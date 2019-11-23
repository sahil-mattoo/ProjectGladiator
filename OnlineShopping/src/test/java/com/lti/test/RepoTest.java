package com.lti.test;

import java.util.List;

import javax.persistence.EntityManager;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.entity.Admin;
import com.lti.repository.LoginRepository;
import com.lti.service.Login;
import com.lti.service.LoginService;


public class RepoTest {
	@Test
	public void loginCheck() {
	ApplicationContext ctx= new ClassPathXmlApplicationContext("app-config.xml");
	//	Login log=(Login) ctx.getBean("log");
		
	//Admin a= login.adminCheck("admin");
		LoginRepository login=(LoginRepository)ctx.getBean("login");
	List<Admin> i=login.adminCheck("admin","admin");
		System.out.println(i.size());
		
	}
	
//	@Test
//	public void testGenericDao() {
//		ApplicationContext ctx= new ClassPathXmlApplicationContext("app-config.xml");
//		
//		GenericDao dao= (GenericDao) ctx.getBean("repo");
////		Customer c= new Customer();
////		c.setCustomerId(11);
////		c.setName("Customer11 Kapoor");
////		c.setEmail("cust11@gmail.com");
////		c.setContactNo(9554515445L);
////		c.setPassword("cust11");
////		dao.add(c);
////		Customer c=(Customer)dao.fetchById(Customer.class, 11);
////		System.out.println(c.getName());
//		
////        dao.queryTest()
//		List <Orders> order=dao.fetchCustOrder();
//		for(Orders orr:order)
//		{
//			System.out.println(orr.getOrderId());
//		}
//        System.out.println("**************************");
//		List<OrderItems> orderItems=dao.fetchOrderforOrderItem();
//		for(OrderItems orr:orderItems)
//		{
//			System.out.println(orr.getOrderItemId());
//		}
//		
//	}
}