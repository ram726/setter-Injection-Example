package com.spring.setterInjection.setterInjectionExample;
import java.util.List;

public class BmwImpl implements ICar {
	
	private int id;
	private String color;
	private Engine engine;
	private List<String> wheels;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public List<String> getWheels() {
		return wheels;
	}

	public void setWheels(List<String> wheels) {
		this.wheels = wheels;
	}

	public void drive() {
		System.out.println("BMW Car Details");
		System.out.println("BMW ID: "+getId());
		System.out.println("BMW Color: "+getColor());
		System.out.println("BMW Engine: "+getEngine());
		System.out.println("BMW Wheels: "+getWheels());
		System.out.println("Driving BMW Car.");
		
	}
	public BmwImpl() {
		System.out.println("BMW Implementation");
	}

}
