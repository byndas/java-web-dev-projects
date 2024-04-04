package main.java.org.launchcode;

import java.util.ArrayList;
import java.util.Arrays;
public class ArrayPractice {
    public static void arrayMain() {

        int[] integerArray = {1, 1, 2, 3, 5, 8};

//        for (int i : integerArray) { System.out.println(i); }

        for (int index = 1; index < integerArray.length; index += 2) {
            System.out.println(integerArray[index]);
        }

        String phrase = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";

        String[] words = phrase.split(" ");
        System.out.println(Arrays.toString(words));

        String[] sentences = phrase.split("\\.");
        System.out.println(Arrays.toString(sentences));
    }

    // BONUS!
    public static ArrayList<String> getStrArrList() {
        String phrase = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        // split string by no space
        String[] strSplit = phrase.split(" ");
        // return string as ArrayList
        return new ArrayList<String>( Arrays.asList(strSplit) );
    }
}