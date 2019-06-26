package com.iu.car;

import java.util.ArrayList;

public class MyCar {
	
	private ArrayList<Wheel> wheels;
	private Engine engine;
	
	public MyCar() {
	}
	
	public MyCar(Engine engine) {
		
		this.engine = engine;
	}
	
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public ArrayList<Wheel> getWheels() {
		return wheels;
	}

	public void setWheels(ArrayList<Wheel> wheels) {
		this.wheels = wheels;
	}
	
	
	
	

}
