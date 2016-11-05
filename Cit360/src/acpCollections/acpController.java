package acpCollections;
import java.util.*;

public class acpController {

//Create hashMap right off the bat
    private  HashMap<String,handler> carSort = new HashMap<String,handler>();


    public acpController(){
// When acpController object is created it also adds these to the hashMap created above
    	carSort.put("Sports", new sport()); //input has to match this
    	carSort.put("Commuter", new commuter());
    	carSort.put("Van", new van());
    	carSort.put("Truck", new truck());
    }

    public  void processCalculation(String car,HashMap mileage)  {
// create an obj that can be used as a middle man to get the car and then activate the specific car to calculate. 	
        handler carType = carSort.get(car);
            carType.calculation(mileage);
    }

}
