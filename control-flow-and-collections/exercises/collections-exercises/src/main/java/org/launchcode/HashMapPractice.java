package main.java.org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// modify classRoster to print ID integer keys & student name values
public class HashMapPractice {
    public static void hashMapMain() {
        String newStudent;
        Scanner input = new Scanner(System.in);
        HashMap<Integer, String> classRoster = new HashMap<>();
        System.out.println("Enter student IDs & names (press ENTER to end process):");
        // collects user-input student names & IDs
        do {
            System.out.print("Student Name: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("Student ID: ");
                Integer newID = input.nextInt();
                // populates classRoster hashmap with student ID key & name value
                classRoster.put(newID, newStudent);
                // reads new line before looping back
                input.nextLine();
            }
        } while( !newStudent.equals("") );
        // closes input memory leak
        input.close();
        // announces class roster
        System.out.println("\nClass roster:");
        // prints student name & ID from classRoster hashmap
        for (Map.Entry<Integer, String> student : classRoster.entrySet()) {
            System.out.println(student.getValue() + "'s ID: " + student.getKey());
        }
        // prints classRoster size
        System.out.println("Number of students in roster: " + classRoster.size());
    }
}