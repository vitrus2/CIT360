package acpCollections;
import java.util.*;

public class acpMain {

    public static void main(String[] args) {
//create instance of controller
        acpController acpController = new acpController();
        Scanner input = new Scanner(System.in);

            try {
// Query user for trip information
                System.out.println("---Car trip calculator---");
                System.out.println("1) Sports");
                System.out.println("2) Commuter");
                System.out.println("3) Van");
                System.out.println("4) Truck");
                System.out.println("-------------------------");
                System.out.print("Which type of car will you drive? (type):");
                String car = input.nextLine();
                System.out.print("how far will you be traveling? {miles):");
				double distance = input.nextDouble();
				System.out.print("What is the cost of gas? (2.50):");
				double gasPrice = input.nextDouble();
                input.close();
                System.out.println("----------CALCULATING-----------");
// Create HashMap that stores what the user entered as well as associates mpg with a type of vehicle.
                HashMap mileage = new HashMap();
                mileage.put("sport", 15.0);
                mileage.put("commuter", 30.0);
                mileage.put("van", 22.0); 
                mileage.put("truck", 15.0);
                mileage.put("distance", distance);
                mileage.put("gasPrice", gasPrice);
// send the car type and hashMap to my controller                
                acpController.processCalculation(car, mileage);


            } catch (Exception e) {
                System.out.println("That car/distance is Invalid");
            }
    }
}