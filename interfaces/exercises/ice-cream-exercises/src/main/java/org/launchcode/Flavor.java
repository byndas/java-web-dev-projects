package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;


public class Flavor extends Ingredient {

    public Flavor(String aName, double aCost, ArrayList<String> someAllergens){
        super (aName, aCost, someAllergens);
    }

    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        Comparator comparator = new FlavorComparator();

        flavors.sort(comparator);
    }
}

