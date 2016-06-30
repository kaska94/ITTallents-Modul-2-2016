package cycles;

import java.util.Scanner;

public class Exercise5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int firstNumber, secondNumber, min, max;

		System.out.println("Enter First number");
		firstNumber = sc.nextInt();

		System.out.println("Enter Second number");
		secondNumber = sc.nextInt();

		min = (firstNumber > secondNumber) ? secondNumber : firstNumber;
		max = (firstNumber < secondNumber) ? secondNumber: firstNumber;
		
		while (min <= max) {
			System.out.print(min + " ");
			min++;
		}

	}
}
