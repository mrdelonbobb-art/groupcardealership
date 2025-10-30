package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class DealershipFileManager {
   private String filePath = "srv/main/resources/inventory.csv";


    public Dealership getDealership() {
        try {
            BufferedReader inventoryReader = new BufferedReader(new FileReader(filePath));
           //this reads first line of csv file
            String dealershipInfo = inventoryReader.readLine();
            //prove that file path works and prints first line from csv
            //System.out.println(dealershipInfo);
            String[] dealershipParts =dealershipInfo.split("\\|");
            //System.out.println(Arrays.toString(dealershipParts));


        } catch (IOException e) {
            System.out.println("someting wrong bai!" + e.getMessage());
            System.exit(0);
            //do this if try fails
        }
        return null;
    }

    // saves dealership to csv file
    public void saveDealership(Dealership dealership){

    }
}
