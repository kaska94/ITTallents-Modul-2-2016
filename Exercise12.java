package cycles;

public class Exercise12 {
	public static void main(String[] args) {

		int firstNumberInNumber;
		int secondNumberInNumber;
		int thirdNumberInNumber;

		for (int i = 100; i < 1000; i++) {
			firstNumberInNumber = (i / 100);
			secondNumberInNumber = (i % 100) / 10;
			thirdNumberInNumber = (i % 10);
			if ((firstNumberInNumber == secondNumberInNumber) || (secondNumberInNumber == thirdNumberInNumber)
					|| (thirdNumberInNumber == firstNumberInNumber)) {
				continue;
			} else {
				System.out.print(i + " ");
			}
		}
	}
}
