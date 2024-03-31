package org.launchcode;

import java.util.Scanner;
public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length:");
        Double length = input.nextDouble();

        System.out.println("Enter width:");
        Double width = input.nextDouble();

        Double area = length * width;
        System.out.println("Your rectangle area is " + area);
    }
}
