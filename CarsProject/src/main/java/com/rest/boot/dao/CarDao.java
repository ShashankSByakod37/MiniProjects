package com.rest.boot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.boot.service.Car;

@Repository
public interface CarDao extends JpaRepository<Car, String> {

	public List<Car> findAllByModel(String model);

	public List<Car> findAllByColor(String color);
	
	public List<Car> findByPriceLessThanEqual(Double price);
//	public List<Car> findAllByBelowPrice(double price);
	
//	public Car save(Car car);
}
