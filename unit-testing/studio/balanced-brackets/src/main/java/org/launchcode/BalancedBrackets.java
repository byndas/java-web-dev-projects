package org.launchcode;
public class BalancedBrackets {
//  BalancedBrackets returns true if input string contains "[]" sets
//      returns true:    "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
//      returns false:   "[LaunchCode", "Launch]Code[", "[", "]["

    public static boolean hasBalancedBrackets(String str) {
        int bracketsNum = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '[') { bracketsNum++; }
            if (ch == ']') { bracketsNum--; }
        }
        return bracketsNum == 0;
    }
}