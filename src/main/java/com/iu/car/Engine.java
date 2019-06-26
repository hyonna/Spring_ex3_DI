package com.iu.car;

public class Engine {
	
	private String fuel;
	private int hp;
	private String company;
	
	public Engine() {
		// TODO Auto-generated constructor stub
	}
	
	public Engine(String fuel, int hp, String company) {
		
		this.fuel = fuel;
		this.hp = hp;
		this.company = company;
	}
	
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	

}
