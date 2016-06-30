package cycles;

import java.util.Scanner;

public class Exercise17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		char sign;

		System.out.println("Enter Size of squre");
		size = sc.nextInt();

		if (!((size >= 3) && (size <= 20))) {
			System.out.println("Between 3 and 20");
			return;
		}

		System.out.println("Enter char to fill the squre");
		sign = sc.next().charAt(0);

		if (((Character.isAlphabetic(sign)) || (Character.isDigit(sign)))) {
			System.out.println("Must be a sign");
			return;
		}

		for (int i = 0; i < size; i++) {
			System.out.println();
			for (int j = 0; j < size; j++) {
				if ((i == 0) || ((i + 1) == size) || (j == 0) || ((j + 1) == size)) {
					System.out.print("*");
				} else {
					System.out.print(sign);
				}
			}
		}

	}

}
