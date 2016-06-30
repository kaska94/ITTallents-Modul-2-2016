package cycles;

import java.util.Scanner;

public class Exercise6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number, sum = 0;
		boolean isNegative = false;

		System.out.println("Enter number");
		number = sc.nextInt();

		isNegative = (number > 0) ? false : true;
		int i = 0;
		if (!isNegative) {
			while (i <= number) {
				sum += i;
				i++;
			}
		} else {
			while (i >= number) {
				sum += i;
				i--;
			}
		}
		System.out.println(sum);
	}
}
