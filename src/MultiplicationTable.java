import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number; ");
        int number = input.nextInt();

       for (int i=1; i <= 12; i++){

            int multiply = number * i;


            System.out.println(number+ " x " + i + "=" +multiply);
        }
    }
}