package com.rest.boot.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.boot.dao.CarDao;


@Service
public class CarService {
	
	@Autowired 
	CarDao dao;
	public List<Car> getCars() {
		return dao.findAll();
	}
	
	public Car setCar(Car car) {
		// TODO Auto-generated method stub
		return dao.save(car);
	}
	
	public List<Car> setMultipleCars(List<Car> carlist) {
		// TODO Auto-generated method stub
		return dao.saveAll(carlist);
	}
	
	public List<Car> getCarsByModel(String model){
		return dao.findAllByModel(model);
	}
	
	public List<Car> getCarsByColor(String color){
		return dao.findAllByColor(color);
	}
	
	public Car updateCar(Car car) {
		Car exist = dao.findById(car.getId()).orElse(null);
		exist.setColor(car.getColor());
		exist.setModel(car.getModel());
		exist.setPrice(car.getPrice());
		
		
		return dao.save(exist);
	}
	
	public void deleteById(String id) {
		dao.deleteById(id);
		
	}
	
	public Optional<Car> getCarById(String id) {
		return dao.findById(id);
	}
	
	public Car updateCarById(String id, Car car) {
		Car exist = dao.findById(id).orElse(null);
		exist.setColor(car.getColor());
		exist.setModel(car.getModel());
		exist.setPrice(car.getPrice());
		
		
		return dao.save(exist);
	}

	public List<Car> getCarPriceLessThanEqual(Double price) {
		return dao.findByPriceLessThanEqual(price);
	}
	
	
	

}
