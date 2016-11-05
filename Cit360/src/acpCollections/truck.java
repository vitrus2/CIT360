package acpCollections;

import java.util.HashMap;

public class truck implements handler {

	public void calculation(HashMap mileage)  {
		try {
			double distance = (double) mileage.get("distance");
			double mpg = (double) mileage.get("truck");
			double gasPrice = (double) mileage.get("gasPrice");
			double cost = distance / mpg * gasPrice;
			System.out.print("If you drive a Truck on your trip of " + distance);
			System.out.printf(" miles It will cost you $%.2f", cost);
		}catch (Exception e){
			e.printStackTrace();
     }
	}
}
