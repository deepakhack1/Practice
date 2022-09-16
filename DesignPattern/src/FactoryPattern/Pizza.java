package FactoryPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

	String name;
	String sauce;
	List<String> toppings = new ArrayList<>();
	
	 void prepare() {
		 
	 }

	 void bake() {
		 
	 }

	void cut() {
		
	}

	 void box() {
		 
	 }
	 
	 public String getName() {
		 return name;
	 }

	
}
