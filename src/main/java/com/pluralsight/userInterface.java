package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class userInterface {
   //private property to hold dealership
    private Dealership dealership;

    public userInterface() {

    }

    public void display() {
        this.init();

        //creates scanner
        Scanner theScanner = new Scanner(System.in);
        // create a  variable to let menu know to loop
        boolean menuRunning = true;
        while (menuRunning){
            System.out.println("Welcome to the Dealership!" +
                    "\n Choose an option:       1 - Find vehicles within a price range\n" +
                    "        2 - Find vehicles by make / model\n" +
                    "        3 - Find vehicles by year range\n" +
                    "        4 - Find vehicles by color\n" +
                    "        5 - Find vehicles by mileage range\n" +
                    "        6 - Find vehicles by type (car, truck, SUV, van)\n" +
                    "        7 - List ALL vehicles\n" +
                    "        8 - Add a vehicle\n" +
                    "        9 - Remove a vehicle\n" +
                    "        0 - Quit");
            int menuChoice = theScanner.nextInt();

            switch (menuChoice){
                case 1: processGetByPriceRequest(); break;
                case 2: processGetByMakeModelRequest(); break;
                case 3: processGetByYearRequest();break;
                case 4: processGetByColorRequest();break;
                case 5: processGetByMileageRequest();break;
                case 6: processGetVehicleType();break;
                case 7: processGetAllVehiclesRequest();break;
                case 8: processAddVehicleRequest();break;
                case 9: processRemoveVehicleRequest();break;
                case 0:
                    System.out.println("bye bye");
                    menuRunning = false;
                    break;
                default:
                    System.out.println("invalid option");
            }

        }

    }

    public void processGetByPriceRequest() {
this.processGetByPriceRequest();
    }

    public void processGetByMakeModelRequest() {

    }

    public void processGetByYearRequest() {
        Scanner theScanner = new Scanner(System.in);
        System.out.println("whats the minimum year?:");
        int minYear = theScanner.nextInt();
        System.out.println("whats the maximum year?");
        int maxYear = theScanner.nextInt();
        ArrayList<Vehicle> matches = dealership.getVehiclesByYear(minYear,maxYear);
        this.displayVehicles(matches);
    }

    public void processGetByColorRequest() {
    Scanner theScanner = new Scanner(System.in);
        System.out.println("what color do you want?:");
        String theColor = theScanner.nextLine();
        ArrayList<Vehicle> matches = dealership.getVehiclesByColor(theColor);
     this.displayVehicles(matches);
    }

    public void processGetByMileageRequest() {

    }

    public void processGetVehicleType() {
        Scanner theScanner = new Scanner(System.in);
        System.out.println("what vehicle type do you want?:");
        String theType = theScanner.nextLine();
        ArrayList<Vehicle> matches = dealership.getVehiclesByType(theType);
        this.displayVehicles(matches);
    }

    public void processGetAllVehiclesRequest() {
this.displayVehicles();
    }

    public void processAddVehicleRequest() {
this.getV
    }

    public void processRemoveVehicleRequest() {

    }

    private void init() {
        DealershipFileManager theDealershipFileManager = new DealershipFileManager();
        this.dealership = theDealershipFileManager.getDealership();
    }

    private void displayVehicles(ArrayList<Vehicle>theVehicles) {
for(Vehicle currentvehicle : theVehicles){
    System.out.println(currentvehicle.toString());

}
    }
}


