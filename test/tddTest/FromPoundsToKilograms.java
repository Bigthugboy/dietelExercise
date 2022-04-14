

import java.util.Scanner;
public class FromPoundsToKilograms{
	public static void main(String[] args){

	Scanner collect = new Scanner(System.in);
	
	System.out.print("Enter a value for feet: ");
	double pounds = collect.nextDouble();
	
	double kilograms = pounds * 0.454;

	System.out.printf("%.1f pounds is %.3f kilograms ", pounds, kilograms);
	

}

} 