

import java.util.Scanner;
public class FindingRunwayLength{
	public static void main(String[] args){

	Scanner collect = new Scanner(System.in);
	
	System.out.print("Enter speed and acceleration: ");
	double speed = collect.nextDouble();
	double acceleration = collect.nextDouble();
	
	double length = (speed * speed) / (2 * acceleration);

	System.out.printf("The minimum runway length for this airplane is %.3f ", length);
	

}

} 