package cycles;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number, spacees = 9, signs = 1;

		System.out.println("Enter number");
		number = sc.nextInt();

		for (int i = 0; i < number; i++) {
			System.out.println();
			for (int j = 0; j < spacees; j++) {
				System.out.print(" ");
			}
			if (!((i + 1) < number)) {
				System.out.print(".");
			} else {
				System.out.print("*");
			}
			spacees--;

			for (int k = (2 * i) + 1; k > 0; k--) {
				if (k == 2) {
					if (!((i + 1) < number)) {
						System.out.print(".");
						break;
					} else {
						System.out.print("*");
						break;
					}
					
				} else {
					if (!((i + 1) < number)) {
						System.out.print(".");
					} else {
						System.out.print(" ");
					}
				}

			}

		}

		/*
		 * int j = 0, i = 0, k = 0; for (i = 0; i < number; i++) {
		 * System.out.println(); for (j = 0; j < spacees; j++) {
		 * System.out.print(" "); } spacees--; for (k = 0; k < (2 * i) + 1; k++)
		 * { if ((i + 1) < number) { System.out.print("*"); } else {
		 * System.out.print("."); }
		 * 
		 * } }
		 */

	}

}
