 package variable;

public class OperatorExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";
		str = str + "World";
		System.out.println(str);
		String str1 = "Hello";
		str1 += "World";
		System.out.println(str1);
		int num2 = 10;
		num2 += 5;
		num2 -= 3; // 12
		num2 *= 5;
		num2 /= 6;
		System.out.println(num2);

		int num3 = 10;
		num3 = num3 + 1;
		num3++;
		num3--;
		num3--;
		num3--;
		num3--;
		System.out.println("num3: " + num3);

		int num4 = 10;
		num4 -= 5;
		if (num4 > 0) {
			System.out.println("num4는 0보다 큽니다.");
		} else if (num4 < 0) {
			System.out.println("num4는 0보다 작습니다.");
		} else {
			System.out.println("num4는 0입니다.");
		}
		int num5 = 30;
		num5 /= 2;

		if (num5 % 2 == 0) {
			System.out.println("num5는 짝수입니다.");
		} else {
			System.out.println("num5는 홀수입니다.");
		}

		boolean result = true;
		result = (num5 % 2) == 0 ? true : false;
		System.out.println(result);

		int num6 = 30;
		boolean result3 = true;
		result3 = (num6 % 2) == 0 ? true : false;
		System.out.println(result3);
		
	}

}
