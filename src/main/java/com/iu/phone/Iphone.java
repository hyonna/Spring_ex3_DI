package com.iu.phone;

public class Iphone {
	
	private int price;
	private String color;
	
	public Iphone() {
		// TODO Auto-generated constructor stub
	}
	
	private Iphone(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	

}
