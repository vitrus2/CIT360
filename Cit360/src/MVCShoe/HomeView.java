package MVCShoe;

import java.util.Scanner;

public class HomeView {
	public String intro() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Would you like to ADD [A] a new Shoe, VIEW [V] inputted Shoe's or exit [X]? ");
		String AorV = scanner.nextLine();
		return AorV;
	}
	public void homeAdd() {
		System.out.println("---------------------------------------------------");
		System.out.println("You have selected to ADD a new shoe, Please fill out information about the shoe as prompted...");
		System.out.println("---------------------------------------------------");
	}
	public void homeView() {
		System.out.println("---------------------------------------------------");
		System.out.println("You have selected to View input from this session...");
		System.out.println("---------------------------------------------------");
	}
	public String homeExit() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("---------------------------------------------------");
		System.out.print("Before Exiting would you like to save? [Y/N]: ");
		String save = scanner.nextLine();
		return save;
	}
	public void homeFarewell() {
		System.out.println("------------------------- Have a great Day :) -----------------------------");
	}
	public void homeError() {
		System.out.println("---------------------------------------------------");
		System.out.println("---------------------------------------------------");
		System.out.println("Please choose A or V as options");
		System.out.println("---------------------------------------------------");
		System.out.println("---------------------------------------------------");
	}
}
