package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.User;

public class TestUser {

	public static void main(String args[]) {
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	
	User user1	= (User)context.getBean("u1");
	User user2	= (User)context.getBean("u2");
	user1.PrintResult();
	user2.PrintResult();
	
//	System.out.println(user1==user1);
	}
}
