import java.util.HashMap;
import java.util.Scanner; // Import the Scanner class to read text files

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors

public class CountingChars {
    public static void main(String[] args) {
//        SUPER BONUS
/*
        String quote = "";
        // tests reading superBonus.txt --> copied from JAVA docs
        try {
            File myObj = new File("superBonus.txt");
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                // System.out.println(data);
                quote = quote + data;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
*/
        // String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        Scanner input = new Scanner(System.in);
        // prompt user to enter quote
        System.out.print("Enter quote: ");
        String quote = input.nextLine();

        char[] charsInStr = quote.toCharArray();
        HashMap<String, Integer> charCountMap = new HashMap<>();

        for (char letter : charsInStr) {
            // exclude non-alphabetic characters
//            if (letter) {} // which method to use here?

            // populate hashmap with charCount case-insensitive
            String strLetter = String.valueOf(letter).toLowerCase();
            // if new char, add to hashmap
            if (!charCountMap.containsKey(strLetter)) {
                charCountMap.put(strLetter, 1);
            } else {
                // returns strLetter's count number value
                int countValue = charCountMap.get(strLetter);
                charCountMap.put(strLetter, countValue+1);
            }
        }
        // for (Map.Entry<character, Integer> count :charCountMap.entrySet()){
        //    system.out.println(count.getKey() + " : " + count.getValue());
        // }
        System.out.println(charCountMap);
    }
}

