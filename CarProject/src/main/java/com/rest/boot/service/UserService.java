package com.rest.boot.service;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.boot.dao.UserDao;
import com.rest.model.Car;

@Service
//@Entity
public class UserService {

	@Autowired
	
	UserDao userDao;
//	
//	public UserService() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public UserService(String carId, String model, double price, String color) {
//		super();
//		this.carId = carId;
//		this.model = model;
//		this.price = price;
//		this.color = color;
//	}
//
//	@Id
//	String carId;
//	
//	@Column
//	String model;
//	
//	@Column
//	double price;
//	
//	@Column
//	String color;
//
//	
//	
//	@Override
//	public int hashCode() {
//		return Objects.hash(carId, color, model, price);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		UserService other = (UserService) obj;
//		return Objects.equals(carId, other.carId) && Objects.equals(color, other.color)
//				&& Objects.equals(model, other.model)
//				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
//	}
//
//	@Override
//	public String toString() {
//		return "UserService [carId=" + carId + ", model=" + model + ", price=" + price + ", color=" + color + "]";
//	}
//
//	public String getCarId() {
//		return carId;
//	}
//
//	public void setCarId(String carId) {
//		this.carId = carId;
//	}
//
//	public String getModel() {
//		return model;
//	}
//
//	public void setModel(String model) {
//		this.model = model;
//	}
//
//	public double getPrice() {
//		return price;
//	}
//
//	public void setPrice(double price) {
//		this.price = price;
//	}
//
//	public String getColor() {
//		return color;
//	}
//
//	public void setColor(String color) {
//		this.color = color;
//	}
//	
	public Car getCarServiceById(String id) {
		
		System.out.println("inside service");
		return userDao.getCarById(id);
	}
	
}
