package cycles;

import java.util.Scanner;

public class Exercise16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int firstNumber, secondNumber, sum = 0;

		System.out.println("Enter from number");
		firstNumber = sc.nextInt();

		if (!((firstNumber >= 10) && (firstNumber <= 5555))) {
			System.out.println("Number must be betwee 10 and 5555");
			return;
		}

		System.out.println("Enter to number");
		secondNumber = sc.nextInt();

		if (!((secondNumber >= 10) && (secondNumber <= 5555))) {
			System.out.println("Number must be betwee 10 and 5555");
			return;
		}

		for (int i = secondNumber; i > firstNumber; i--) {
			if ((i % 50) == 0) {
				System.out.println(i);
			}
		}

	}

}
