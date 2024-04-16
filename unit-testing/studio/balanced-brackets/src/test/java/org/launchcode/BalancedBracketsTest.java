package org.launchcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
//  write 13 unit tests to find errors in BalancedBrackets,
//      to guide source code revisions_
//  use TDD for expected BalancedBrackets class behavior_
//  how should the class behave?
//  correct the class to pass failed tests_
//  write 13 input examples with their expected boolean return value_

//  since BalancedBrackets only contains static method hasBalancedBrackets,
//      no need to create an instance to test hasBalancedBrackets()_

class BalancedBracketsTest {
    @Test public void emptyTest() {
        assertEquals(true, true);
    }

    @Test public void onlyBalancedBracketsTrue() {
        String message = "One set of balanced brackets returns true";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]", message));
    }
    @Test public void balancedBracketsAroundCharsTrue() {
        String message = "One set of balanced brackets returns true";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]", message));
    }
    @Test public void balancedBracketsWithinCharsTrue() {
        String message = "One set of balanced brackets returns true";
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]", message));
    }
    @Test public void frontBalancedBracketsTrue() {
        String message = "One set of balanced brackets returns true";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode", message));
    }
    @Test public void emptyStringTrue() {
        String message = "no brackets returns true";
        assertTrue(BalancedBrackets.hasBalancedBrackets("", message));
    }
    @Test public void emptyBalancedBracketsTrue() {
        String message = "One set of balanced brackets returns true";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]", message));
    }

    @Test public void multipleNestedBracketsTrue() {
        String message = "One set of balanced brackets returns true";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]", message));
    }
/////////////////////////////////////////////////////////////////////////////////
    @Test public void oneBracketBeforeCharsFalse() {
        String message = "One set of balanced brackets returns false";
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode", message));
    }
    @Test public void invertedBracketsCharsFalse() {
        String message = "One set of inverted brackets returns false";
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code[", message));
    }
    @Test public void onlyOneBracketFalse() {
        String message = "Only one bracket returns false";
        assertFalse(BalancedBrackets.hasBalancedBrackets("[", message));
    }
    @Test public void onlyInvertedBracketsFalse() {
        String message = "One set of unbalanced brackets returns false";
        assertFalse(BalancedBrackets.hasBalancedBrackets("][", message));
    }

    @Test public void mixedUnbalancedFalse() {
        String message = "One set of unbalanced brackets returns false";
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]][][", message));
    }
}