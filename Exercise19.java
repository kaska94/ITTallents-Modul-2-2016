package cycles;

import java.util.Scanner;

// sgreshena zadacha
public class Exercise19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int firstNumber, prevNumber;
		boolean isFirstTime = true;
		System.out.println("Enter number");
		firstNumber = sc.nextInt();
		if (!((firstNumber >= 10) && (firstNumber <= 99))) {
			System.out.println("Number must be between 1 and 9");
			return;
		}
		while (firstNumber != 1) {
			if ((firstNumber % 2) == 0) {
				firstNumber = firstNumber / 2;
				System.out.print(firstNumber + " ");
			} else {
				if ((firstNumber % 2) == 1) {
					firstNumber = ((3 * firstNumber) + 1);
					System.out.print(firstNumber+ " ");
				}
			}
		}
	}
}
