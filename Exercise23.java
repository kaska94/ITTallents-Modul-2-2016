package cycles;

public class Exercise23 {
	public static void main(String[] args) {
		int counter = 1, counterInner = 1;
		while (counter < 10) {
			counterInner = counter;
			while (counterInner < 10) {
				System.out.println(counter + "*" + counterInner + " = " + (counter * counterInner));
				counterInner++;
			}
			counter++;
		}
	}
}
