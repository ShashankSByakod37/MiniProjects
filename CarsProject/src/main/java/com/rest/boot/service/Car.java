package com.rest.boot.service;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
	
	public Car() {
		
	}
	public Car(String id, String model, String color, Double price) {
		super();
		this.id = id;
		this.model = model;
		this.color = color;
		this.price = price;
	}
	@Id
	String id;
	
	@Column
	String model;
	@Column
	String color;
	@Column
	Double price;
	
	
	@Override
	public int hashCode() {
		return Objects.hash(color, id, model, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(color, other.color) && Objects.equals(id, other.id) && Objects.equals(model, other.model)
				&& Objects.equals(price, other.price);
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", color=" + color + ", price=" + price + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
}
