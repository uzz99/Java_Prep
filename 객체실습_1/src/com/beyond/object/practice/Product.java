package com.beyond.object.practice;

public class Product {
	private String id;
	private String name;
	private String site;
	
	private int price;
	private double tax;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String id, String name, String site, int price, double tax) {
		this.id = id;
		this.name = name;
		this.site = site;
		this.price = price;
		this.tax = tax;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public String information() {
		return String.format(id + " " + name + " " + site + " " + price + " " + tax);
	}

}
