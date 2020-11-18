package interation;

public class MorningCode1 {
	public static void main(String[] args) {
		int[] numbers = { 23, 56, 34, 65, 28, 21 };
		int sum = 0;
		for (int i = 0; i < 6; i++) {
			if (numbers[i] % 2 == 1) {
				System.out.println(numbers[i]);
			    sum += numbers[i];
			}
		} 
		System.out.println("홀수 값의 합은" + sum);
	}
}