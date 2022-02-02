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

import com.rest.boot.service.UserService;
import com.rest.model.Car;


@RestController
@RequestMapping("/home")
public class CarController {
	
	@Autowired 
	UserService userService;
//	Car car;
	
	
	Map<String,Car> mp;
	
	public CarController() {
		
		this.mp = new HashMap<>();
		mp.put("1", new Car("1","Mercedes ",1000,"black"));
		mp.put("2", new Car("2","Rolls royce ",3000,"grey"));
		mp.put("3", new Car("3","BMW ",9000,"red"));
	}
	
	
	@GetMapping("/welcome")
	
	public String entryPage() {
		return "Hello....Welcome to the page...!";
	}
	
	@GetMapping("cars")
	public Map<String,Car> getCars() {
		
		
		System.out.println("Get user data ");
		
		this.mp.forEach((key,value) -> System.out.println(key +":"+value));
		
		return this.mp;
	}
	
//	
	@PostMapping("/cars")
	public Map<String,Car> createUser(@RequestBody Car car) {
		
		System.out.println("Data insertion with "+car.getCarId()+" with name "+car.getModel()+
				" with price "+car.getPrice()+" with "+car.getColor()+" colored");
		
		this.mp.put(car.getCarId(), car);
		
		return this.mp;
	}
	
	@PutMapping("/cars")
	public Map<String,Car> updateUser(@RequestBody Car car) {
		
		
		this.mp.put(car.getCarId(),car) ;
		System.out.println("updates map is "+this.mp);
		
		return this.mp;
	}
	
//	@GetMapping("/cars/{id}")
//	public Car getUserById(@PathVariable Integer id) {
//		
//		Car s = this.mp.get(id);
//		System.out.println("Getting car by id is "+s);
//		return s;
//	}
//	
//	
	@GetMapping("/cars/{id}")
	
//	public UserService getCarServiceById(@PathVariable String id ) {
//		
//		return userService.getCarServiceById(id);
//	}
	
	
	@DeleteMapping("cars/{id}")
	public Map<String,Car> deleteCarById(@PathVariable Integer id) {
		
		this.mp.remove(id);
		return this.mp;
	}
	
	
	

}
