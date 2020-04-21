package com.fdmgroup.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.fdmgroup.model.Apple;
import com.fdmgroup.model.Banana;
import com.fdmgroup.model.Fruit;
import com.fdmgroup.model.Lemon;
import com.fdmgroup.model.Orange;
import com.fdmgroup.model.Peach;

public class FruitDaoImpl implements IFruitDao {

	private List<Fruit> fruits = null;
	
	public FruitDaoImpl() {
		
		super();
		fruits = new ArrayList<>();
		fruits.add( new Banana("Banana", BigDecimal.valueOf(2.80)));
		fruits.add( new Apple("Apple", BigDecimal.valueOf(2.40)));
		fruits.add( new Lemon("Lemon", BigDecimal.valueOf(2.20)));
		fruits.add( new Orange("Banana", BigDecimal.valueOf(0.80)));
		fruits.add( new Peach("Peach", BigDecimal.valueOf(1.80)));
	}

	@Override
	public Fruit create(Fruit t) {
		//Fruit foundFruit = findByName(t.getName());
		//if (foundFruit == null) {
			fruits.add(t);
			//return t;
		//}
		
		return t;
	}	

	@Override
	public List<Fruit> findAll() {
		return fruits;
	}

	@Override
	public Fruit update(Fruit t) {
		return null;
	}

	@Override
	public boolean remove(Fruit t) {
		return fruits.remove(t);
	}

	@Override
	public Fruit findByName(String name) {
		for (Fruit fruit : fruits) {
			if (fruit.getName().equals(name)) {
				return fruit;
			}
		}
		
		return null;
	}

}
