package interation;

public class ForMultiTable {
	public static void main(String[] args) {
		int sum = 2;
		for (int i = 1; i < 10; i++) {
			System.out.println(sum * i);
		}

		for (int i = 1; i < 10; i++) {
			System.out.println("3 * " + i + " = " + (3 * i));

		}
		sum++;
		for (int i = 1; i < 10; i++) {
			System.out.println(sum + " * " + i + " = " + (sum * i));
		}
		sum++;
		for (int i = 1; i < 10; i++) {
			System.out.println(sum + " * " + i + " = " + (sum * i));
		}
		sum++;
		for (int i = 1; i < 10; i++) {
			System.out.println(sum + " * " + i + " = " + (sum * i));
		}
		for (int num = 2; num <= 9; num++) {
			System.out.println("[" + num + "단]");
			for (int i = 1; i <= 9; i++) {
				System.out.println(num + "*" + i + "=" + (num * i));
			}
		}

	}
}