package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class DealershipFileManager {
   private String filePath = "srv/main/resources/inventory.csv";


    public Dealership getDealership() {
        Dealership theDealership = null;
        try {
            BufferedReader inventoryReader = new BufferedReader(new FileReader(filePath));
           //this reads first line of csv file
            String dealershipInfo = inventoryReader.readLine();

            //prove that file path works and prints first line from csv
            //System.out.println(dealershipInfo);

            String[] dealershipParts =dealershipInfo.split("\\|");

            //System.out.println(Arrays.toString(dealershipParts));

            //creates dealership with parts
          theDealership = new Dealership(dealershipParts[0],dealershipParts[1],dealershipParts[2]);
          String vehicleInfo;
          while( (vehicleInfo = inventoryReader.readLine())  !=null){
              //process each vehicle
              String[] vehicleParts = vehicleInfo.split("\\|");
              int vin = Integer.parseInt(vehicleParts[0]);
              int year =Integer.parseInt(vehicleParts[1]);
              String make = vehicleParts[2];
              String model = vehicleParts[3];
              String vehicleType = vehicleParts[4];
              String color = vehicleParts[5];
              int miles = Integer.parseInt(vehicleParts[6]);
              double price = Double.parseDouble(vehicleParts[7]);
              //create vehicle
              Vehicle vehicle = new Vehicle(vin,year,make,model,vehicleType,color,miles,price);
              theDealership.addVehicle(vehicle);

              {
                  inventoryReader.close();
              }
            }
        } catch (IOException e) {
            System.out.println("someting wrong bai!" + e.getMessage());
            System.exit(0);
            //do this if try fails
        }
        return theDealership;
    }

    // saves dealership to csv file
    public void saveDealership(Dealership dealership){

    }
}
