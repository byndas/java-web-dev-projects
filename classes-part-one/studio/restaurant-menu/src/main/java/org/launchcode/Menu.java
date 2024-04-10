package org.launchcode;

import java.util.Date;

public class Menu {
    private String restaurantName;
    private Date menuUpdate;
    // constructor to set values at each class instantiation
    public Menu(String aRestaurantName, Date aMenuUpdate){
        restaurantName = aRestaurantName;
        menuUpdate = aMenuUpdate;

    }
    // instantiates three MenuItem classes
    MenuItem hummus = new MenuItem("hummus", 5.00, "hummus description", "appetizer", false);
    MenuItem gyro = new MenuItem("gyro", 10.00, "gyro description", "main course", false);
    MenuItem turkishDelight = new MenuItem("turkish delight", 7.00, "turkish delight description", "dessert", false);

    public String getRestaurantName() { return restaurantName; }
    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public Date getMenuUpdate() { return menuUpdate; }
    public void setMenuUpdate(Date menuUpdate) {
        this.menuUpdate = menuUpdate;
    }
}
/*
display when menu last updated: use getters & setters & Date class
decide each data type, access level, class constructor
sketch class design for fields
know your reasoning for each decision & consider other use cases
focus only on how these two classes represent data & relate to each other
*/