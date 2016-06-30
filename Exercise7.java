package cycles;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;

		System.out.println("Enter number");
		number = sc.nextInt();

		if (number <= 0) {
			System.out.println("Number must be postive");
			return;
		}

		int iterator = 3;
		while (number > 0) {
			System.out.print(iterator);
			if (!((number - 1) == 0)) {
				System.out.print(" , ");
			}
			iterator += 3;
			number--;
		}
	}

}
