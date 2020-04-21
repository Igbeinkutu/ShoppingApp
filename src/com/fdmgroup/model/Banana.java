package com.fdmgroup.model;

import java.math.BigDecimal;

public class Banana extends Fruit implements IStorable{

	public Banana() {
		super();
	}

	public Banana(String name, BigDecimal price) {
		super(name, price);
	}

	
}
