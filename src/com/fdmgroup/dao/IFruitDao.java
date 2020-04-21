package com.fdmgroup.dao;

import java.util.List;

import com.fdmgroup.model.Fruit;

public interface IFruitDao extends IStorage<Fruit>, IEditable<Fruit>, IRemovable<Fruit> {
	public Fruit findByName(String name);
}
