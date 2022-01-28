package com.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class User {
	@Value("69")
	int x;
	@Value("96")
	int y;
	
	@Autowired
	@Qualifier("b")
	Calc calc;
	
	public User() {
		
	}
//	
	public User(int x,int y,Calc calc) {
		System.out.println("Inside Constructor");
		this.x = x;
		this.y = y;
		this.calc = calc; 
		
	}
	
	public void PrintResult() {
		calc.addition(this.x, this.y);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Calc getCalc() {
		return calc;
	}

	public void setCalc(Calc calc) {
		this.calc = calc;
	}
	

}
