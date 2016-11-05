package MVCShoe;

import java.util.Scanner;


public class Shoe {
	   private String brand;
	   private String style;
	   private String color;
	   private String size;
	  
	 //getting input of shoe and setting it
public Shoe() {
	 Scanner scanner = new Scanner(System.in);
	 System.out.print("Brand: ");
	 String brand = scanner.nextLine();
	 setBrand(brand);
		   
	 System.out.print("Style: ");
	 String style = scanner.nextLine();
	 setStyle(style);
	   
	 System.out.print("Color: ");
	 String color = scanner.nextLine();
	 setColor(color);
	   
	 System.out.print("Size: ");
	 String size = scanner.nextLine();
	 setSize(size);
	 
	 System.out.println("--------------------------");
	 //scanner.close();
			
}
//*****************GET methods**********
	   public String getBrand() {
	      return brand;
	   }
	   public String getStyle() {
		  return style;
	   }
	   public String getColor() {
	      return color;
	   }
	   public String getSize() {
	      return size;
	   }
//************** SET methods******************	   
	   public void setBrand(String brand) {
	      this.brand = brand;
	   }
	   public void setStyle(String style) {
	      this.style = style;
	   }
	   public void setColor(String color) {
		  this.color = color;
	   }
	   public void setSize(String size) {
	      this.size = size;
	   }
	}
