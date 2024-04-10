package org.launchcode;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private boolean newItem;

    // constructor to set values at each class instantiation
    public MenuItem (String aName, double aPrice, String aDescription, String aCategory, boolean aNewItem) {
        name = aName;
        price = aPrice;
        description = aDescription;
        category = aCategory;
        newItem = aNewItem;
    };

    public String getName() { return name; }
    public void setName(String aName) {
        name = aName;
    }

    public double getPrice() { return price; }
    public void setPrice(double aPrice) {
        price = aPrice;
    }

    public boolean isNewItem() {
        return newItem;
    }
    public void setNewItem(boolean aNewItem) {
        newItem = aNewItem;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String aDescription) {
        description = aDescription;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String aCategory) {
        category = aCategory;
    }
}
/*
MenuItem class constructor:
    each MenuItem has fields:
        price, new item, description, category (appetizer, main course, dessert)
*/