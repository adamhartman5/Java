import java.util.*;
public class GasPrices {
	
	static int numStations;
	static Scanner input = new Scanner (System.in);
	static double gasPrice [];

	public static void main(String[] args) {
		
		
		enterGasData();
		sortGasData();
		evaluateGasData();

	}
	
	public static void enterGasData()
	{
		
		System.out.print("Please enter the number of gas stations in your area: ");
		numStations = input.nextInt();
		gasPrice = new double [numStations];
		
		for (int x = 0; x < numStations; x++)
		{
			System.out.print("Please enter the price for station #" + (x + 1) + ": ");
			gasPrice[x] = input.nextDouble();
		}
		
	}
	
	public static void sortGasData()
	{
		System.out.println("The sorted gas prices in your area (lowest first) are: ");
		Arrays.sort(gasPrice);
		System.out.println(Arrays.toString(gasPrice));
	}
	
	public static void evaluateGasData()
	{
		int newArrayLength = 1;
		System.out.print("The lowest gas price in the area is: ");
		Arrays.sort(gasPrice);
		System.out.println(gasPrice[0]);
		
		for (int x = 1; x < gasPrice.length; x++)
		{
			if (gasPrice[x] == gasPrice[0])
			{
				newArrayLength++;
			}
			else {
				break;
			}
		}
		
		double [] lowestPrice = Arrays.copyOf(gasPrice, newArrayLength);
		
		
		System.out.print("There are " + lowestPrice.length + " gas stations with this price");
		
	}
}
