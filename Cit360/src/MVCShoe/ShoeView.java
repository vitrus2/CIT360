package MVCShoe;

public class ShoeView {
	   public void displayShoe(String brand, String style, String color, String size,int shoeNum){
	      System.out.println("---------Shoe----> " + shoeNum);
	      // nike, jimmy choo, burk, uggs
	      System.out.println("Brand: " + brand);
	      // heels, boots, sneakers, sandals, athletic
	      System.out.println("Style: " + style);
	      // yellow, blue, white, black
	      System.out.println("Color: " + color);
	      // 8, 9, 9.5, 10, 11.5
	      System.out.println("Size: " + size);
	   }
	}