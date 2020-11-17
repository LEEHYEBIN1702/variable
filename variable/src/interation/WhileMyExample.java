package interation;

public class WhileMyExample {
	public static void main(String[] args) {

		int sum = 0;
		int i = 0;
		while (i <= 10) {

			sum += i;
			i++;
			System.out.println("1부터 10까지의 합:" + sum);
		}

		int sum1 = 0;
		int i1 = 0;
		while (true) {

			sum1 += i1;
			i1++;
			if (i1 == 10) {
				break;
			}

		}
		System.out.println("1부터 10까지의 합:" + sum);

         
	}
}