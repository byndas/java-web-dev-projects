package org.launchcode;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        double fahrenheit;
        double celsius;
        Scanner input; // input variable is a Scanner class

        input = new Scanner(System.in); // instantiates input with argument
        System.out.println("Enter the temperature in Fahrenheit: ");
        fahrenheit = input.nextDouble(); // calls Scanner class method .nextDouble
        input.close();

        celsius = (fahrenheit - 32) * 5/9;
        System.out.println("The temperature in Celsius is: " + celsius + "°C");
    }
}

/*
Scanner class converts primitive data types (such as input) into object types_
(converts int into Integer) ---> making low-level data types easier to use_

Class is NOT a data-type but merely names an object data-type_
Only two data-types: object & primitive (such as int & char)_

Reference variables store an object's memory address,
--> merely pointing to an object in memory_

Functions (aka methods) are ONLY declarable within a class_
Static methods are callable without creating its class instance_

public static returnedDataType methodName(parameterDataType parameterName) {
   // code
}

ClassName.methodName(arguments)

A Java file containing a public class MUST be named that class
*/