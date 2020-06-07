package application;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("******* Conditional Structure *******");
		System.out.print("Enter a number: ");
		number = sc.nextInt();
		if (number % 2 == 0) {
			System.out.println("Pair");
		} else {
			System.out.println("Odd");
		}
	}

}
