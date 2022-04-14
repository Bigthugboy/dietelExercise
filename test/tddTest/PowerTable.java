package tddTest;

public class PowerTable{
	public static void main(String[] args){

	System.out.printf("%3c %3c %11s %n", 'a', 'b', "pow(a, b)");
	
	double number;
	double powerOf;

	number = 1;
	powerOf = 2;
	System.out.printf("%3.0f %3.0f %7.0f%n", number, powerOf, Math.pow(number, powerOf));

	number = 2;
	powerOf = 3;
	System.out.printf("%3.0f %3.0f %7.0f%n", number, powerOf, Math .pow(number, powerOf));

	number = 3;
	powerOf = 4;
	System.out.printf("%3.0f %3.0f %7.0f%n", number, powerOf, Math.pow(number, powerOf));

	number = 4;
	powerOf = 5;
	System.out.printf("%3.0f %3.0f %7.0f%n", number, powerOf, Math.pow(number, powerOf));

	number = 5;
	powerOf = 6;
	System.out.printf("%3.0f %3.0f %7.0f%n", number, powerOf, Math.pow(number, powerOf));

}


}