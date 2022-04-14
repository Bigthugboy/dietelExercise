

import java.util.Scanner;

public class FinancialApp{

	public static void main(String[] args){
	Scanner collect = new Scanner(System.in);

	System.out.print("Enter the monthly saving amount: ");
	double savingsAmount = collect.nextInt();

	double accountValue;

	double monthlyInterest;
	monthlyInterest = 0.05 / 12;
	
	accountValue = savingsAmount * (1 + monthlyInterest);
	accountValue = (savingsAmount + accountValue) * (1 + monthlyInterest);
	accountValue = (savingsAmount + accountValue) * (1 + monthlyInterest);
	accountValue = (savingsAmount + accountValue) * (1 + monthlyInterest);
	accountValue = (savingsAmount + accountValue) * (1 + monthlyInterest);
	accountValue = (savingsAmount + accountValue) * (1 + monthlyInterest);

	System.out.printf("After the sixth month, the account value is $%.3f%n", accountValue);

}
}