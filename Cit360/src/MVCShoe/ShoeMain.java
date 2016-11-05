package MVCShoe;

public class ShoeMain {
	   public static void main(String[] args) {
		   Shoe[] shoeArray=new Shoe[3];
		   //gonna create 3 shoe profiles
		   for (int i = 0; i < 3; i++) {
			   shoeArray[i] = new Shoe(); 
		   }

		      //Create a view for shoe description
		      ShoeView view = new ShoeView();
		      //creates a controller with shoe and view objects
		      for (int i = 0; i < 3; i++) {
		    	  int j = i+1;
		    	  ShoeController controller = new ShoeController(shoeArray[i], view, j);
		    	  //prints out the shoe details of the object
		    	  controller.shoeDetails();
		      }
	}
}