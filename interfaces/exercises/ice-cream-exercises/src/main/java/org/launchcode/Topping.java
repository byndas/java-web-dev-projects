package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

//  add toppings to Case constructor,
//    choose how to sort a toppings array in Main
public class Topping extends Ingredient {

	public Topping (String aName, double aCost, ArrayList<String> someAllergens){
		super (aName, aCost, someAllergens);
	}

	public static void main(String[] args){
		Case menu = new Case();
		ArrayList<Topping> toppings = menu.getToppings();
		ArrayList<Flavor> flavors = menu.getFlavors();
		ArrayList<Cone> cones = menu.getCones();
		Comparator comparator = new ToppingComparator();

		toppings.sort(comparator);
	}
}
