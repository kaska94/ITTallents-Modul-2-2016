package cycles;

import java.util.Scanner;

public class Exercise18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int firstNumber, secondNumber;
		int min, max;
		
		System.out.println("Enter First number");
		firstNumber = sc.nextInt();
		if (!((firstNumber >= 1) && (firstNumber <= 9))) {
			System.out.println("Number must be between 1 and 9");
			return;
		}

		System.out.println("Enter Second number");
		secondNumber = sc.nextInt();
		if (!((secondNumber >= 1) && (secondNumber <= 9))) {
			System.out.println("Number must be between 1 and 9");
			return;
		}
		
		min = (firstNumber > secondNumber) ? secondNumber : firstNumber;
		max = (firstNumber < secondNumber) ? secondNumber: firstNumber;
		
		for (int i = 1; i <= max; i++) {
			for (int j = 1; j <= max; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}
	}
}
