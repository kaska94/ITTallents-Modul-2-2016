package cycles;

import java.util.Scanner;

public class Exercise14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;

		System.out.println("Enter number");
		number = sc.nextInt();

		if (!((number >= 10) && (number <= 200))) {
			System.out.println("Number must be betwee 10 and 200");
			return;
		}

		for (int i = number; i > 10; i--) {
			if ((i % 7) == 0) {
				System.out.print(i + " ");
			}
		}

	}

}
