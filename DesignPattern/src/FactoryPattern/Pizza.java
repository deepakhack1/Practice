package FactoryPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

	String name;
	String sauce;
	List<String> toppings = new ArrayList<>();
	
	 void prepare() {
		 System.out.println("preparing");
	 }

	 void bake() {
		 System.out.println("bake");
	 }

	void cut() {
		System.out.println("cut");
	}

	 void box() {
		 System.out.println("box"); 
	 }
	 
	 public String getName() {
		 return name;
	 }

	
}
