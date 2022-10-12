package FactoryPattern;


import java.util.Arrays;

public class NYStyleCheesePizza extends Pizza {
	
	public NYStyleCheesePizza()
	{
		name = "abc";
		sauce = "xyz";
		toppings = Arrays.asList("paneer");
	}

}
