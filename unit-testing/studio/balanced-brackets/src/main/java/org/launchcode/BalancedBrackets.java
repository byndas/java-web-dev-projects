package org.launchcode;
public class BalancedBrackets {
//  BalancedBrackets returns true if input string contains "[]" sets
//      returns true:    "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
//      returns false:   "[LaunchCode", "Launch]Code[", "[", "]["

    public static boolean hasBalancedBrackets(String str) {
        int bracketsNum = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '[') { bracketsNum++; }
            else if (ch == ']') {
                bracketsNum--;
                if (bracketsNum < 0) { return false; }
            }
        }
        return bracketsNum == 0;
    }
}