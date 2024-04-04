package main.java.org.launchcode;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void arrayListMain() {
        int[] intArr = {1, 1, 2, 3, 5, 8, 44, 2, 7, 6};
        ArrayList<Integer> intList = new ArrayList<Integer>();
        for(int num : intArr) { intList.add(num); }
        System.out.println(sumEven(intList));

        System.out.println("Enter a word length: ");

        Scanner scanner = new Scanner(System.in);
        int numChars = scanner.nextInt();

        String[] wordArr = {"snake", "cake", "break", "fake"};
        ArrayList<String> wordList = new ArrayList<String>();
        for (String word : wordArr) { wordList.add(word); }
        printWordList(wordList, numChars);
    }

    // prints each user-input-letter word length in an ArrayList
    public static void printWordList (ArrayList<String> arrList, int numChars) {
        for (String item : arrList) { // only specify item type
            if (item.length() == numChars) {
                System.out.println(item);
            }
        }
    }

    // finds sum of all even numbers in an ArrayList
    public static int sumEven (ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }
}
