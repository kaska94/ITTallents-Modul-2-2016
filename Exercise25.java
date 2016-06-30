package cycles;

import java.util.Scanner;

public class Exercise25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int firstNumber;
		long factoriel = 1;
		System.out.println("Enter number");

		firstNumber = sc.nextInt();
		if (!((firstNumber >= 1) && (firstNumber <= 20))) {
			System.out.println("Number must be between 1 and 20");
			return;
		}
		do {
			factoriel *= firstNumber;
			firstNumber--;
		} while (firstNumber != 1);
		System.out.println(factoriel);
	}

}
