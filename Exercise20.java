package cycles;

public class Exercise20 {

	public static void main(String[] args) {
		for (int i = 1; i < 11; i++) {
			System.out.println();
			for (int j = 0; j < 10; j++) {
				if ((i + j) < 10) {
					System.out.print(i + j);
				} else {
					if ((i + j) >= 10) {
						System.out.print(((i + j) % 10));
					}
				}
			}
		}

	}

}
