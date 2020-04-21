package com.fdmgroup.mainApp;

import java.util.Scanner;

import com.fdmgroup.controller.Basket;
import com.fdmgroup.dao.FruitDaoImpl;
import com.fdmgroup.view.ShoppingCartView;

public class ShoppingCartApp {

	public static void main(String[] args) {

		FruitDaoImpl fruitDao = new FruitDaoImpl();
		Scanner scanner = new Scanner(System.in);
		
		//views
		ShoppingCartView shoppingCartView = new ShoppingCartView(scanner);
		
		//controllers
		Basket basket = new Basket();
		
		basket.setFruitDao(fruitDao);
		shoppingCartView.setBasket(basket);
		basket.setShoppingCartView(shoppingCartView);
		shoppingCartView.setScanner(scanner);
		
		shoppingCartView.displayBasket();
		
		basket.showHomeView();
		
		scanner.close();
		
	}

}
