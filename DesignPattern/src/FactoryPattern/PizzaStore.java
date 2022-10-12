package FactoryPattern;


public abstract class PizzaStore {
	
	public Pizza order(String type) {
		Pizza pizza = createPizza(type);
		
		System.out.println(pizza);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	
   public abstract Pizza createPizza(String type);

	
}
