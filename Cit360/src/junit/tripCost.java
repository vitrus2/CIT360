package junit;

public class tripCost {
	public double estimate(double mpg, double gasPrice, double distance) {
		double cost = distance / (mpg * gasPrice);
		System.out.print("If you drive a Commuter car on your trip of " + distance);
		System.out.printf(" miles It will cost you $%.2f", cost);
		return cost;
	}
}