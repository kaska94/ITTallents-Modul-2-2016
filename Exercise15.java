package cycles;

import java.util.Scanner;

public class Exercise15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number, sum = 0;
		int i;

		System.out.println("Enter number");
		number = sc.nextInt();

		i = 0;
		if (number > 0) {
			do {
				sum += i;
				i++;
			} while (i <= number);
			System.out.println(sum);
		} else {
			do {
				sum += i;
				i--;
			} while (i >= number);
			System.out.println(sum);
		}

	}

}
