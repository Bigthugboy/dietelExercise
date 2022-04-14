package tddTest;

import java .util . Scanner;

public class Arithmetic{

public static void main (String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("enter first integer ");

int firstinteger = input.nextInt();

System.out.println("enter second integer ");

int secondinteger = input.nextInt();

int square1 = firstinteger * firstinteger;

int square2 = secondinteger * secondinteger;

//int sum = square1 + square2;

int different = square1 - square2;

System.out.println("square1 is :" + square1);

//System.out.println("square2 is :" + square2);

//System.out.println("sum is :" + sum);

System.out.println("different is :" + different);
}

} 
