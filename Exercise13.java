package cycles;

import java.util.Scanner;

public class Exercise13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int firstDigitInNumber;
		int secondDigitInNumber;
		int thirdDigitInNumber;
		int number, sum = 0;

		System.out.println("Enter the number.(between 2 and 27) ");
		number = sc.nextInt();
		if (!((number >= 2) && (number <= 27))) {
			System.out.println("Number must be betwee 2 and 27");
			return;
		}

		for (int i = 100; i < 1000; i++) {
			sum = 0;
			firstDigitInNumber = (i / 100);
			secondDigitInNumber = (i % 100) / 10;
			thirdDigitInNumber = (i % 10);
			sum += (firstDigitInNumber + secondDigitInNumber + thirdDigitInNumber);
			if (sum == number) {
				System.out.print(i + " ");
			}
		}
	}
}
