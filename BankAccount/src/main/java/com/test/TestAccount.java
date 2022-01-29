package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Account;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Account ac1 = (Account)context.getBean("Acc1");
		System.out.println(ac1);
		ac1.withDraw(1000);
		System.out.println(ac1);
		
		Account ac2 = (Account)context.getBean("Acc2");
		System.out.println(ac2);
		ac2.withDraw(800);
		System.out.println(ac2);
		
		
		Account ac3 = (Account) context.getBean("Acc3");
		System.out.println(ac3);
		ac3.withDraw(9000);
		System.out.println(ac3);
		
	}

}
