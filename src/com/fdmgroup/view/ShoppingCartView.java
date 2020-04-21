package com.fdmgroup.view;

import java.util.Scanner;

import com.fdmgroup.controller.Basket;
import com.fdmgroup.dao.FruitDaoImpl;

public class ShoppingCartView {
	
	private Scanner scanner;
	private Basket basket;
	
	public ShoppingCartView(Scanner scanner, Basket basket) {
		super();
		this.scanner = scanner;
		this.basket = basket;
	}

	public ShoppingCartView(Scanner scanner) {
		super();
		this.scanner = scanner;
	}

	public ShoppingCartView() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void displayBasket() {
		System.out.println("This is your shopping basket");
	}
	
	public void showHomePage() {
		
		System.out.println("Thank you for your purchase. Your total is:  ");
	}

	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

	public Basket getBasket() {
		return basket;
	}

	public void setBasket(Basket basket) {
		this.basket = basket;
	}

}
