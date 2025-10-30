package com.pluralsight;

import java.util.ArrayList;

public class Dealership {
    //properties of method
    // access modifier(public,private,protected)
    // Data type variable
    private String name;
private String address;
private String phone;
private ArrayList<Vehicle> inventory;

// constructor makes method (sets up properties of dealership class)
    public Dealership(String name,String address,String phone){
        this.name = name;
        this.address = address;
        this.phone = phone;
//creates empty list of vehicles in inventory
        this.inventory = new ArrayList<Vehicle>();
    }
    public ArrayList<Vehicle> getVehiclesPrice(double min,double max){
        return null;
    }
    public ArrayList<Vehicle> getVehiclesByMakeModel(String make,String model){
        return null;
    }
    public ArrayList<Vehicle> getVehiclesByYear(int min,int max){
        return null;
    }
    public ArrayList<Vehicle> getVehiclesByColor(String color){
        return null;
    }
    public ArrayList<Vehicle> getVehiclesByMiles(int miles){
        return null;
    }
    public ArrayList<Vehicle> getVehiclesByType(String vehicleType){
        return null;
    }
    public ArrayList<Vehicle> getAllVehicles(){
        return this.inventory; //get all inventory
    }
    public void addVehicle(Vehicle vehicle){
        this.inventory.add(vehicle); //puts vehicle on inventory list
    }
    public void removeVehicle(Vehicle vehicle){
        this.inventory.remove(vehicle);

    }
}
