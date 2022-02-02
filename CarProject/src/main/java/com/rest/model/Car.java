/**
 * 
 */
package com.rest.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

/**
 * @author shashanksbyakod
 *
 */
//@Component
@Entity
public class Car {
	@Id
	String carId;
	
	@Column
	String model;
	@Column
	double price;
	@Column
	String color;
	
	public Car (){
		
	}
	
	public Car(String carId, String model, double price, String color) {
		super();
		this.carId = carId;
		this.model = model;
		this.price = price;
		this.color = color;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(carId);
	}

	@Override
	public boolean equals(Object obj) {
		
		Car other = (Car) obj;
		return carId == other.carId ;
	}

	@Override
	public String toString() {
		return "[carId=" + carId + ", model=" + model + ", price=" + price + ", color=" + color + "]";
	}
	public String getCarId() {
		return carId;
	}
	public void setCarId(String carId) {
		this.carId = carId;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
}
