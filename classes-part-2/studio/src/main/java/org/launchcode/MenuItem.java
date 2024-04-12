package org.launchcode;

public class MenuItem {
    // private instance fields
    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew;
    // constructor to set values at each class instantiation
    public MenuItem(String name, double price, String description, String category, boolean isNew) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }
    // call these getters & setters in Menu.java to update menu items
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public boolean isNew() { return isNew; }
    public void setNew(boolean aNew) { isNew = aNew; }

    @Override
    public String toString() {
        return '\n'+" {"+'\n'+
                "   name: "+name+ ","+'\n'+
                "   price: "+price+","+'\n'+
                "   description: "+description+","+'\n'+
                "   category: "+category+","+'\n'+
                "   isNew: "+isNew+'\n'+" }";
    }
}