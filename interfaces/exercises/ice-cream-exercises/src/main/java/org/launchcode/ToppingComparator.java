package org.launchcode;

public class ToppingComparator {
	@Override
	public int compare(Flavor topping1, Flavor topping2) {
		return topping1.getName().compareTo( topping2.getName() );
	}
}
