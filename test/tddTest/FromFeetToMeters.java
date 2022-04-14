

import java.util.Scanner;
public class FromFeetToMeters{
	public static void main(String[] args){

	Scanner collect = new Scanner(System.in);
	
	System.out.print("Enter a value for feet: ");
	double feet = collect.nextDouble();
	
	double meters = feet * 0.305;

	System.out.printf("%.1f feet is %.4f meters ", feet, meters);
	

}

} 