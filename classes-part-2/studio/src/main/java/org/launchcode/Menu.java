package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private String restaurantName;
    private ArrayList<MenuItem> menuArr = new ArrayList<>();
    private Date lastUpdated;

    // constructor to set values at each class instantiation
    public Menu(String restaurantName, Date lastUpdated) {
        this.restaurantName = restaurantName;
        this.lastUpdated = lastUpdated;
    }

    public String getRestaurantName() { return restaurantName; }
    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public Date getLastUpdated() { return lastUpdated; }
    public void setLastUpdated(Date lastUpdated) { this.lastUpdated = lastUpdated; }
    public void setUpdated() { this.lastUpdated = new Date();}

    public ArrayList<MenuItem> getMenuArr() { return menuArr; }
    public void addToMenu(MenuItem item) {
        menuArr.add(item);
        setUpdated();
    }

    public void removeFromMenu(MenuItem item) {
        menuArr.remove(item);
        setUpdated();
    }
}

