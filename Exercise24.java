package cycles;

import java.util.Scanner;

public class Exercise24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * I hope in this exercise 1221 is a polindrom...
		 */
		int firstNumber;
		int leftDigit, rightDigit;
		int length = 1;
		int scaller = 1;
		int tempDigit; // for counting digits. Didn't want to use Log...

		boolean isPolindrom = true;

		System.out.println("Enter number");

		firstNumber = sc.nextInt();
		if (!((firstNumber >= 1) && (firstNumber <= 30000))) {
			System.out.println("Number must be between 1 and 30000");
			return;
		}
		tempDigit = firstNumber;

		do {
			tempDigit /= 10;
			scaller = (scaller * 10);
			length++;
		} while (tempDigit >= 10);

		do {
			leftDigit = firstNumber / scaller;
			rightDigit = firstNumber % 10;
			if (rightDigit != leftDigit) {
				isPolindrom = false;
			}

			firstNumber = (firstNumber % scaller) / 10;

			scaller /= 100;
			if ((firstNumber == 0) || (scaller == 0)) {
				break;
			}
		} while (scaller != 1);

		System.out.println(isPolindrom ? "It's a polindrom" : "It's not a polindrom");
	}

}
