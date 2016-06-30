package cycles;

import java.util.Scanner;

public class Exercise9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int firstNumber, secondNumber, sum = 0, min, max;

		System.out.println("Enter First number");
		firstNumber = sc.nextInt();

		System.out.println("Enter Second number");
		secondNumber = sc.nextInt();

		min = (firstNumber > secondNumber) ? secondNumber : firstNumber;
		max = (firstNumber < secondNumber) ? secondNumber : firstNumber;

		for (int i = min; i < max; i++) {
			if ((firstNumber % 3) != 0) {
				sum += i;
			}
		}

		if (sum > 200) {
			return;
		}

		while (min <= max) {
			if ((min % 3) == 0) {
				System.out.print("skipped 3");
			} else {
				System.out.print(min);
			}

			if (!((min) == max)) {
				System.out.print(" , ");
			}

			min++;
		}
	}
}
