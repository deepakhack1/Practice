package FactoryPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

	String name;
	String sauce;
	List<String> toppings = new ArrayList<>();
	
	 public void prepare() {
		 System.out.println("preparing");
	 }

	 public void bake() {
		 System.out.println("bake");
	 }

	public void cut() {
		System.out.println("cut");
	}

	 public void box() {
		 System.out.println("box"); 
	 }
	 
	 public String getName() {
		 return name;
	 }

	
}
