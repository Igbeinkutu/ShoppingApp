package com.fdmgroup.model;

import java.math.BigDecimal;

public class Fruit implements IStorable{

	//private int id;
	private String name;
	private BigDecimal price;
	
	
	public Fruit() {
		super();
	}

	public Fruit(String name, BigDecimal price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", price=" + price + "]";
	}
	
}
