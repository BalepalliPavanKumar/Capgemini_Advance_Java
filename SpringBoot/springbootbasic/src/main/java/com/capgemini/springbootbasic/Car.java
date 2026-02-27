package com.capgemini.springbootbasic;

public class Car {
	private String brand;
	private double price;
	private Engine engine;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public Car(String brand, double price, Engine engine) {
		super();
		this.brand = brand;
		this.price = price;
		this.engine = engine;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + ", engine=" + engine + "]";
	}
	
	

}
