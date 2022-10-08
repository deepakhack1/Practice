package src;

import FactoryPattern.PizzaStore;
import FactoryPattern.NY.NYPizzaStore;
import src.FactoryPattern.Pizza;

public class Runner {
	
	public static void main(String args[]) {

	
		
	PizzaStore nyPizza = new NYPizzaStore();
	System.out.println(nyPizza);
	Pizza pizza = nyPizza.order("Cheese");
	
	System.out.println("pizza name"+pizza.getName());
	
	}
	
	
}
