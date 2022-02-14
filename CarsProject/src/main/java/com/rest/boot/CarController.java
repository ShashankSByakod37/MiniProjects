package com.rest.boot;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rest.boot.service.Car;
import com.rest.boot.service.CarService;

@RestController
@RequestMapping("/home")
public class CarController {
	
	@Autowired
	CarService cs;
	
	@GetMapping("/welcome")
	public String greet() {
		return "Hello welcome to cars...!";
	}
	
	@GetMapping("/cars")
	public List<Car> getCars() {
		
		System.out.println("hello from getCars");
		return cs.getCars();
	}
	
	@GetMapping("/cars/{id}")
	public Optional<Car> getCarById(@PathVariable String id) {
		
		return cs.getCarById(id);
	}
	
	@GetMapping("/cars/model/{model}")
	public List<Car> getCarsByModel(@PathVariable String model) {
		
		return cs.getCarsByModel(model);
	}
	
	@GetMapping("/cars/color/{color}")
	public List<Car> getCarsByColor(@PathVariable String color) {
		
		return cs.getCarsByColor(color);
	}
	
	@GetMapping("/cars/price/{price}")
	public List<Car> getCarPriceLessThanEqual(@PathVariable Double price){
		return cs.getCarPriceLessThanEqual(price);
	}
	
	@PostMapping("/cars")
	public Car setCars(@RequestBody Car car) {
		return cs.setCar(car);
	}
	
	@PostMapping("/cars/multiple")
	public List<Car> setMultipleCars(@RequestBody List<Car> carlist) {
		return cs.setMultipleCars(carlist);
	}
	
	@PutMapping("/cars")
	public Car updateCar(@RequestBody Car car) {
		return cs.updateCar(car);
	}
	
	@PutMapping("/cars/{id}")
	public Car updateCarById(@PathVariable String id, @RequestBody Car car) {
		return cs.updateCarById(id,car);
	}
	
	@DeleteMapping("/cars/{id}")
	public void deleteById(@PathVariable String id) {
//		boolean flag = false;
		try {
		cs.deleteById(id);
		System.out.println("Record deleted with id "+id);
//		return;
		}
		catch (Exception e) {
		System.out.println("Record not found in db with id "+id);
		}
		
	}

}