package com.pluralsight;

public class Vehicle {
    private int vin;
    private int year;
    private String make;
    private String model;
    private String color;
    private String vehicleType;
    private int miles;
    private double price;

    public int getVin() {
        return vin;
    }

    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public int getMiles() {
        return miles;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return vin + " | " + year + " | " + make + " | " + model + " | " +
                vehicleType + " | " + color + " | " + miles + " | $" + price;
    }

    public Vehicle(int year, int make, String model, String color, String vehicleType, String miles, int vin, double price) {
        this.vin = vin;
        this.year = year;
        this.make = make;
        this.model = model;
        this.vehicleType = vehicleType;
        this.color = color;
        this.miles = miles;
        this.price = price;
    }
}

