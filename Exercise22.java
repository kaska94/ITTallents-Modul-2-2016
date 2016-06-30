package cycles;

import java.util.Scanner;

public class Exercise22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int firstNumber;

		System.out.println("Enter number");
		firstNumber = sc.nextInt();
		if (!((firstNumber >= 1) && (firstNumber <= 999))) {
			System.out.println("Number must be between 1 and 999");
			return;
		}
		int counter = 1;
		int innerCounter = firstNumber;
		while (counter != 11) {
			while (((innerCounter % 2) == 0) || ((innerCounter % 3) == 0) || (innerCounter % 5) == 0) {
				System.out.println(counter +" : "+ innerCounter);
				counter++;
				break;
			}
			innerCounter++;
		}
	}
}
