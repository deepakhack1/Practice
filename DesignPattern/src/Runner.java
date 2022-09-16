import FactoryPattern.Pizza;
import FactoryPattern.PizzaStore;
import FactoryPattern.NY.NYPizzaStore;

public class Runner {
	
	public static void main(String args[]) {

		System.out.println("HELLO");
		
	PizzaStore nyPizza = new NYPizzaStore();
	System.out.println(nyPizza);
	Pizza pizza = nyPizza.order("Cheese");
	
	System.out.println("pizza name"+pizza.getName());
	
	}
	
	
}
