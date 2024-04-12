package org.launchcode;

import java.util.Date;

public class Restaurant {
    public static void main(String[] args) {
        Date currentDate = new Date();
        //  Create menu instance
        Menu menu = new Menu(
                "Jolly Dervish",
                currentDate
        );
        // create several menuItem instances
        MenuItem hummus = new MenuItem("hummus", 5.00, "hummus description", "appetizer", true);
        MenuItem gyro = new MenuItem("gyro", 10.00, "gyro description", "main course", true);
        MenuItem turkishDelight = new MenuItem("turkish delight", 7.00, "turkish delight description", "dessert", true);

        //  add menuItem to menuArr
        menu.addToMenu(hummus);
        menu.addToMenu(gyro);
        menu.addToMenu(turkishDelight);

        //  print updated menuArr & menuItemObj
        System.out.println(menu.getMenuArr().toString());
        System.out.println(menu.getLastUpdated().toString());

        //  delete a menuItemObj from menuArr
        menu.removeFromMenu(hummus);

        //  re-print menuArr
        System.out.println(menu.getMenuArr().toString());

        //  compare two MenuItems for equality

    //  Bonus: prevent user adding duplicate item to menu & print error message
    }
}
