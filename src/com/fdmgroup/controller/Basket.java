package com.fdmgroup.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import com.fdmgroup.dao.FruitDaoImpl;
import com.fdmgroup.view.ShoppingCartView;

public class Basket {
	//map to store the price and name of product
	Map<String, Integer> cart = new LinkedHashMap<>();
	
	private FruitDaoImpl fruitDao;
	private ShoppingCartView shoppingCartView;
	
	public Basket() {
		super();
	}
	
	public Basket(FruitDaoImpl fruitDao) {
		super();
		this.fruitDao = fruitDao;
	}

	public Basket(ShoppingCartView shoppingCartView) {
		super();
		this.shoppingCartView = shoppingCartView;
	}

	public Basket(FruitDaoImpl fruitDao, ShoppingCartView shoppingCartView) {
		super();
		this.fruitDao = fruitDao;
		this.shoppingCartView = shoppingCartView;
	}
	
	public void showHomeView() {
		shoppingCartView.showHomePage();
		//cart = fruitDao.find;
		//dummy
		System.out.println("8.4");
		
		
	}

	public Map<String, Integer> getCart() {
		return cart;
	}

	public void setCart(Map<String, Integer> cart) {
		this.cart = cart;
	}

	public ShoppingCartView getShoppingCartView() {
		return shoppingCartView;
	}

	public void setShoppingCartView(ShoppingCartView shoppingCartView) {
		this.shoppingCartView = shoppingCartView;
	}
	
	public FruitDaoImpl getFruitDao() {
		return fruitDao;
	}

	public void setFruitDao(FruitDaoImpl fruitDao) {
		this.fruitDao = fruitDao;
	}
}
