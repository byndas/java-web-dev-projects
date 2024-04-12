package org.launchcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

class CarTest {

    Car test_car;

    @BeforeEach
    public void createCarObject() {
        test_car = new Car("Toyota", "Prius", 10, 50);
    }
    // add emptyTest to configure runtime environment
    // remove this test before pushing to your GitLab account
    @Test
    public void emptyTest() {
        assertEquals(10, 10, .001);
    }
    // constructor sets gasTankLevel properly
    @Test
    public void testInitialGasTank() {
        Car test_car = new Car("Toyota", "Prius", 10, 50);
        assertEquals(10, test_car.getGasTankLevel(), .001);
    }

    // test that gasTankLevel is accurate after driving within tank range

    // test that gasTankLevel is accurate after attempting to drive past tank range

    // test having more gas than tank size, expect an exception
}