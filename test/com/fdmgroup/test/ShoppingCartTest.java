package com.fdmgroup.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.fdmgroup.controller.Basket;
import com.fdmgroup.dao.FruitDaoImpl;
import com.fdmgroup.model.Banana;
import com.fdmgroup.model.Fruit;
import com.fdmgroup.model.Lemon;
import com.fdmgroup.model.Orange;
import com.fdmgroup.model.Peach;

public class ShoppingCartTest {

	private static Basket basket;
	private static Fruit banana, orange, peach, lemon, apple, mango;
	private static FruitDaoImpl fruitDao;
	
	@BeforeClass
	public static void init() {
		
		fruitDao = new FruitDaoImpl();
		basket = new Basket();
		basket.setFruitDao(fruitDao);
		
		banana = new Banana();
		orange = new Orange();
		peach = new Peach();
		lemon = new Lemon();
		mango = new Fruit();
				
	}
	
	@Test
	public void test_GetFruitsInBasket_ReturnsArrayofLengthFive_IfFiveItemsHaveBeenAddedByDefault() {		
		
		assertTrue(basket.getFruitDao().findAll().size() == 5);
	}
	

}
