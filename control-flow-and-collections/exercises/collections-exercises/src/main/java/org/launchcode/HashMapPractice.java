package main.java.org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// modify classRoster to print ID integer keys & student name values
public class HashMapPractice {
    public static void hashMapMain() {
        HashMap<Integer, String> classRoster = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // gets student names & grades
        do {
            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                Integer newID = input.nextInt();
                classRoster.put(newID, newStudent);

                // reads new line before looping back
                input.nextLine();
            }
        } while( !newStudent.equals("") );

        input.close();

        // prints class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : classRoster.entrySet()) {
            System.out.println(student.getValue() + "'s ID: " + student.getKey());
        }

        System.out.println("Number of students in roster: " + classRoster.size());
    }
}