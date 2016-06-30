package cycles;

import java.util.Scanner;

import javax.swing.plaf.multi.MultiMenuBarUI;

public class Exercise8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number, iterator = 0;

		System.out.println("Enter number");
		number = sc.nextInt();

		if (number < 0) {
			System.out.println("Must be positive!");
			return;
		}
		
		if (number == 0) {
			System.out.println("0");
			return;
		}
		
		iterator = number - 1;

		for (int i = 0; i < number; i++) {
			for (int j = 0; j < number; j++) {
				System.out.print(iterator);
			}
			System.out.println();
			iterator += 2;
		}
	}

}
