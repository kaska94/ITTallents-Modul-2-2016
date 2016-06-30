package cycles;

public class Exercise3 {
	public static void main(String[] args) {
		for (int i = -10; i <= 10; i++) {
			// can be done with if (((i & 1) == 1) || ((i & 1) == -1))
			if (((i % 2) == 1) || ((i % 2) == -1)) {
				System.out.println(i);
			}
		}
	}
}
