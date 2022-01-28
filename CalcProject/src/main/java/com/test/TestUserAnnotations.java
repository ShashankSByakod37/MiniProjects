package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.User;

public class TestUserAnnotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-xml.xml");
		
		User user2 = (User)context.getBean("u1");
		
		user2.PrintResult();
		
		
		
	}

}
