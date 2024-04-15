package org.launchcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car test_car;

    @BeforeEach
    public void initCar() {
        test_car = new Car(
            "Toyota", "Prius", 10, 50
        );
    }

    //TODO: add emptyTest so we can configure our runtime environment
    @Test
    public void emptyTest() {
        assertEquals(10, 10, .001);
    }

    // constructor initializes gasTankLevel
    @Test
    public void testInitialGasTank() {
        assertEquals( 10, test_car.getGasTankLevel(),.001);
    }

    // accurate gasTankLevel when driving within tank range
    @Test
    public void testGasTankAfterDriving() {
        test_car.drive(50);
        assertEquals(9, test_car.getGasTankLevel(),.001);
    }

    // accurate gasTankLevel when driving beyond tank range
    @Test
    public void testGasTankAfterExceedingTankRange() {
        test_car.drive(501);
        assertEquals(test_car.getGasTankLevel(), 0, .001);
    }

    // gas cannot exceed tank size, expect an exception
    @Test
    public void testGasOverfillException() {
        assertThrows(IllegalArgumentException.class, () ->
            test_car.addGas(5),
            "Shouldn't get here, car cannot have more gas in tank than the size of the tank"
        );
    }
}