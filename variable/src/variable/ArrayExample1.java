package variable;

public class ArrayExample1 {
	public static void main(String[] args) {
		int[] numbers = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		// 10, 20, 30, 40 ... 100
		// 숫자 중 홀수 위치에 있는 것만 더하는 프로그램 짜오기 (숙제)
		int sum = 0;
		for (int i = 0; i <= 9; i++) {
			if (i % 2 == 0) {
				System.out.println(numbers[i]);
				sum += numbers[i];
			}
		}
		System.out.println("홀수 위치의 값은" + sum);
	}
}
