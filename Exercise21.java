package cycles;

import java.util.Scanner;

public class Exercise21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int firstNumber, remainder;
		int cardNumber = 2;
		int cardCounter = 1;

		System.out.println("Enter number");
		firstNumber = sc.nextInt();
		if (!((firstNumber >= 1) && (firstNumber <= 52))) {
			System.out.println("Number must be between 1 and 52");
			return;
		}
		
		/*
		 * cardCounter = 1..5 (counting every 4th card)
		 * cardNumber = 2,3,4,5... 13, 14
		 * remainder = 1...4
		 * 				0 - pika
		 * 				1 - spatia
		 * 				2 - karo
		 * 				3 - kupa
		 * We start counting from 1,2,3,4..
		 */
		cardCounter = 1;
		for (int i = 1; i <= 52; i++, cardCounter++) {
			remainder = i % 4;
			

			if ((cardCounter % 5) == 0) {
				cardCounter = 1;
				cardNumber++;
			}
			if (i >= firstNumber) {
				System.out.println();
				switch (remainder) {
				case 0:
					System.out.print("Pika ");
					break;
				case 1:
					System.out.print("spatia ");
					break;
				case 2:
					System.out.print("karo ");
					break;
				case 3:
					System.out.print("kupa ");
					break;
				}

				switch (cardNumber) {
				case 2:
				case 3:
				case 4:
				case 5:
				case 6:
				case 7:
				case 8:
				case 9:
				case 10:
					System.out.print(cardNumber);
					break;
				case 11:
					System.out.print("Vale");
					break;
				case 12:
					System.out.print("Dama");
					break;
				case 13:
					System.out.print("POP");
					break;
				case 14:
					System.out.print("Asak");
					break;
				}
			}
		}

	}
}
