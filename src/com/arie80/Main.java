package com.arie80;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			System.out.println("Enter First Number");
			double num1 = input.nextDouble();
			System.out.println("Enter Second Number");
			double num2 = input.nextDouble();

			System.out.println("Choose calculation: add, divide, substract");

			CalculateFactory factory = new CalculateFactory();
			Calculate obj = factory.getCalculation(input.next());

			try {
				obj.calculate(num1, num2);
			} catch(NullPointerException e) {
				System.out.println("Calculation not found");
			}
		} catch (InputMismatchException e) {
	        System.out.print("Invalid type.");
	    }
	}
}