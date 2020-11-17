package variable;

public class OperatorExample2 {
	public static void main(String[] args) {

		int num1 = 0;
		int result = 0; // 짝수 :0, 홀수 :1
		// 1 ) if구문
		// 2) ? : 구문

		int num2 = 4;
		int result1 = (num2 % 3);
        if (result1 > 0) {
			System.out.println("홀수");
		} else {
			System.out.println("짝수");
		}

		boolean result2 = true;
        result2 = (num2 % 2) == 0 ? true : false;
		System.out.println(result2);

	}
}