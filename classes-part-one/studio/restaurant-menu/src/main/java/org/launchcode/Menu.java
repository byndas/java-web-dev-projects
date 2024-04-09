package org.launchcode;

//java.util.ArrayList;
//java.util.Date;

public class Menu {
    // instantiates three MenuItem classes
    MenuItem hummus = new MenuItem("hummus", 5.00, "hummus description", "appetizer", false);
    MenuItem gyro = new MenuItem("gyro", 10.00, "gyro description", "main course",  false);
    MenuItem turkishDelight = new MenuItem("turkish delight", 7.00, "turkish delight description", "dessert", false);
}
/*
MenuItem class constructor:
    each MenuItem has fields:
        price, description, new item, category (appetizer, main course, dessert)

display when menu last updated
use getters & setters & Date class
decide each data type, access level, class constructor

focus only on how these two classes represent data & relate to each other

sketch class design for fields
know your reasoning for each decision & consider other use cases
*/