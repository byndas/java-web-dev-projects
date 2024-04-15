package org.launchcode;

public class Car {
    private String make;
    private String model;
    private int gasTankSize;
    private double gasTankLevel;
    private double milesPerGallon;
    private double odometer = 0;

    public Car(String make, String model, int gasTankSize, double milesPerGallon) {
        this.make = make;
        this.model = model;
        this.gasTankSize = gasTankSize;
        this.gasTankLevel = gasTankSize; // full tank
        this.milesPerGallon = milesPerGallon;
    }

    public void drive(double milesToDrive) {
/*      drive until arrive destination or until fuel empty
            adjust fuel enough to drive requested distance
            add miles to odometer  */
        double maxDistance = this.milesPerGallon * this.gasTankLevel;
        double milesAbleToTravel = milesToDrive > maxDistance ? maxDistance : milesToDrive;
        double gallonsUsed = milesAbleToTravel / this.milesPerGallon;
        this.gasTankLevel = this.gasTankLevel - gallonsUsed;
        this.odometer += milesAbleToTravel;
    }

    public void addGas(double gas) {
        this.setGasTankLevel(gas + this.getGasTankLevel());
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getGasTankSize() {
        return gasTankSize;
    }

    public void setGasTankSize(int gasTankSize) {
        this.gasTankSize = gasTankSize;
    }

    public double getGasTankLevel() {
        return gasTankLevel;
    }

    public void setGasTankLevel(double gasTankLevel) {
        if (gasTankLevel > this.getGasTankSize()) {
            throw new IllegalArgumentException("Can't exceed tank size");
        }
        this.gasTankLevel = gasTankLevel;
    }
    public double getMilesPerGallon() {
        return milesPerGallon;
    }

    public void setMilesPerGallon(double milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }

    public double getOdometer() {
        return odometer;
    }
}