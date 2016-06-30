package cycles;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		// An integer greater than one is called a prime number
		// if its only positive divisors (factors) are one and itself.
		Scanner sc = new Scanner(System.in);
		int number, iterator = 2;
		boolean isPrime = true;

		System.out.println("Enter number");
		number = sc.nextInt();

		if (number == 0) {
			// It's a pun!
			System.out.println("Here is a small definition for the ones who don't know:\n"
					+ "Zero is neither prime nor composite. The number 0 divided by any \n"
					+ "number except for 0 is 0. This would suggest that 0 is a \n"
					+ "composite number, but it does not have factors in the way that \n"
					+ "other composite numbers do. Prime and composite numbers must be \n"
					+ "positive, so 0 is neither prime nor composite. YOU ARE WELLCOME!!! ");
			return;
		}

		if (!(number >= 2)) {
			System.out.println("Not a prime");
			return;
		}

		while (iterator < number) {
			if ((number % iterator) == 0) {
				isPrime = false;
			}
			iterator++;
		}
		if (isPrime == true) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}
	}

}
