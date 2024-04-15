package org.launchcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
//  write 12 unit tests to find errors in BalancedBrackets,
//      to guide source code revisions_
//  use TDD for expected BalancedBrackets class behavior_
//  how should the class behave?
//  correct the class to pass failed tests_
//  write 12 input examples with their expected boolean return value_

class BalancedBracketsTest {
    @Test public void emptyTest() {
        assertEquals(true, true);
    }

    @Test public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
/*
    @Test public void () {}
    @Test public void () {}
    @Test public void () {}
    @Test public void () {}
    @Test public void () {}
    @Test public void () {}
    @Test public void () {}
    @Test public void () {}
    @Test public void () {}
    @Test public void () {}
    @Test public void () {}
    @Test public void () {}
 */
}