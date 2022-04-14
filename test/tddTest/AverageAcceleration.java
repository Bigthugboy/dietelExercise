
import java.util.Scanner;

public class AverageAcceleration{
	public static void main(String[] args){

	Scanner collect = new Scanner(System.in);
	
	System.out.print("Enter v0, v1, and t: ");
	double velocity0 = collect.nextDouble();
	double velocity1 = collect.nextDouble();
	double time = collect.nextDouble();
	
	double acceleration = (velocity1 - velocity0) / time;

	System.out.printf("The average acceleration is: %.4f ", acceleration);
	

}

} 