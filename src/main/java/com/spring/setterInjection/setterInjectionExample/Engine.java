package com.spring.setterInjection.setterInjectionExample;
public class Engine 
{
	private int engineNumber;
	private int horsePower;
	private String engineType;
	public int getEngineNumber() {
		return engineNumber;
	}
	public void setEngineNumber(int engineNumber) {
		this.engineNumber = engineNumber;
	}
	public int getHorsePower() {
		return horsePower;
	}
	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	
	@Override
	public String toString() {
		return "Engine [engineNumber=" + engineNumber + ", horsePower=" + horsePower + ", engineType=" + engineType
				+ "]";
	}
	
}
