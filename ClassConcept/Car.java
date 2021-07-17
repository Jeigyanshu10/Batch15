package com.technoelevate.ClassConcept;

public class Car {
	
	private int doors;
	private int wheels;
	private String model;
	private String brand;
	private String color;
	private double cost;
	private String engine;
	
	
	public void setModel(String model) {
		String validModel=model.toLowerCase();
		if(validModel.equals("gtx") || validModel.equals("audis")) {
			this.model=model;
		}else this.model="Invalid model";
	}
	
	public String getModel() {
		return this.model;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

}
