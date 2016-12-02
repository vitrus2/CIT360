package MVCShoe;

public class ShoeView {
	   public void displayShoe(Shoe shoe){
	      System.out.println("---------Shoe----> ");
	      // nike, jimmy choo, burk, uggs
	      System.out.println("Brand: " + shoe.getBrand());
	      // heels, boots, sneakers, sandals, athletic
	      System.out.println("Style: " + shoe.getStyle());
	      // yellow, blue, white, black
	      System.out.println("Color: " + shoe.getColor());
	      // 8, 9, 9.5, 10, 11.5
	      System.out.println("Size: " + shoe.getSize());
	      System.out.println("---------------------------------------------------");
	   }
	}