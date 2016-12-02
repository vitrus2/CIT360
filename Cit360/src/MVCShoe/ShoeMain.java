package MVCShoe;

import java.util.HashMap;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.json.simple.JSONObject;

public class ShoeMain {
	   public static void main(String[] args) {
		   HashMap shoeEntry = new HashMap();
		   ShoeView view = new ShoeView();
		   HomeView homeView = new HomeView();
		   boolean homePage = true;
		   int count = 1;
		   
		   while (homePage == true) {
			   String AorV = homeView.intro();
			   
			   if (AorV.equals("A")) {
				   homeView.homeAdd();
				   Shoe shoe = new Shoe(count);
				   shoeEntry.put(count, shoe);
				   count++;
			   }
			   // Allows for all shoe's entered, in this session to be viewed
			   else if (AorV.equals("V")) {
				   homeView.homeView();
				   int viewCount = 1;
				   while (shoeEntry.get(viewCount) != null) {
					   Shoe shoe = (Shoe) shoeEntry.get(viewCount);
					   view.displayShoe(shoe);
					   viewCount++;
				   }
				   
			   }
			   else if (AorV.equals("X")) {
				   homePage = false;
				   String toSave = homeView.homeExit();
				   if (toSave.equals("Y")) {
					   JSONObject shoes = new JSONObject();
					   int viewCount = 1;
					   SaveShoe save = new SaveShoe();
					   
					   // Save the shoe's we've input in both the database and in a file
					   // While statement goes through objects in the hashmap until it reaches a null
					   while (shoeEntry.get(viewCount) != null) {
						   Shoe shoe = (Shoe) shoeEntry.get(viewCount);
						   shoes.put(viewCount, shoe);
						   // Saves the shoe objects one by one into the database
						   save.saveDb(shoe);
						   // Move on to the next object
						   viewCount++;
					   }
					   // Calls saveFile method and passes the JSON object which will be saved
					   save.saveFile(shoes);
				   }
				   homeView.homeFarewell();

			   }
			   else {
				   homeView.homeError();
			   }
			   
			   
		   }
	}
}