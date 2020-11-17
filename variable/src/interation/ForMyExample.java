package interation;

public class ForMyExample {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello World");
		}

		int sum = 0;
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);

	}
}
