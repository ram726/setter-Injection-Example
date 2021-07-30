package com.spring.setterInjection.setterInjectionExample;

public class AudiImpl implements ICar {
	
	public AudiImpl() {
		System.out.println("This is Audi Car Implementation.");
	}

	public void drive() {
		System.out.println("Driving Audi Car.");
	}

}
