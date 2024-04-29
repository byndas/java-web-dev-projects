package org.launchcode;

import java.util.HashMap;
import java.util.Map;


public class Main {

    public static void main(String[] args) {
        Divide(1, 0);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        for (Map.Entry<String, String> entry : studentFiles.entrySet()) {
            CheckFileExtension(entry.getValue());
        }
    }

    public static int Divide(int x, int y) {
        if (y == 0) {
            try { throw new ArithmeticException("Cannot divide by zero!"); }
            catch(ArithmeticException e) { e.printStackTrace(); }
            return -1;
        }
        return x/y;
    }

    public static int CheckFileExtension(String fileName) {
        try {
            if (fileName.isEmpty()) { throw new Exception("No file name!"); }
        }
        catch (Exception e) {
	        e.printStackTrace();
          return -1;
        }
String[] splitArr = fileName.split(".");
	    if (splitArr[1].equals("java")) { return 1; }
      return 0;
    }
}

/*
auto-grade program problems:
    sometimes enters 0 total possible points
    fatal error when dividing by 0

in Divide(), return x / y params_
    if y is zero,
        throw exception using ArithmeticException_
    write try/catch error-handling
        that prints helpful exception-caught message_

//////////////////////////////////////////////////////////////////////////

Test Student Labs: practice more exceptions_

in CheckFileExtension(),
    return integer of points for submitting a .Java file_
        add point for each .java file submitted
        subtract point & throw custom exception for each null or "" file

in Main(),
    use {studentName: fileName} hashmap
    print out error message when exception caught

*/