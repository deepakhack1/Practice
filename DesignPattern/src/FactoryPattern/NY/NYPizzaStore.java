package FactoryPattern.NY;

import FactoryPattern.NYStyleCheesePizza;
import FactoryPattern.PizzaStore;
import src.FactoryPattern.Pizza;

public class NYPizzaStore extends PizzaStore {
	

	@Override
	public Pizza createPizza(String type) {
	
		
		System.out.println(type);
		
		if(type == "Cheese") {
			return new NYStyleCheesePizza();
		}
		else
		{
			return null;
		}
		
		
		
	}

	
	
}
