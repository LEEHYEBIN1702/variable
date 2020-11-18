package array;

public class MethodExample1 {
	public static void main(String[] args) {
		showInfo("이혜빈");
//		int result = showDouble(45); 
		// 새로 값 도출하려 하는데 
		// int result 값이 있어서 double result 값이 안 나와서
		// int result 값을 주석 처리한 것.
		double result = divide (20, 100);
		System.out.println("반환1: " + showDouble(33.2));
		System.out.println("반환2: " + multi(33, 22, 11));
		System.out.println("반환3: " + divide(22, 11.5));
		System.out.println("반환4: " + result);
	}

	public static void showInfo(String name) {
		System.out.println("안녕하세요." + name + "입니다.");
		// 스트링 타입의 매개변수가 들어감 "이혜빈"
	}

	public static int showDouble(int num) {
		return num * 2;
	}

	public static double showDouble(double num) {
		return num * 2;
	}

	// 정수형 변수 2개를 받아서 두수의 합을 반환해주는 메소드 (sum)
	public static int sum (int a, int b) {

		int result = 0;
		result = a + b;
		return result;
	}

	// 정수형 변수 3개를 받아서 세수의 곱을 반환 메소드 (multi)
	public static int multi(int a, int b, int c) {

		int result = 0;
		result = a * b * c;
		return result;
	}

	// 더블 타입의 실수 두개를 받아서 첫번째 매개변수/두번째 매개변수 (divide)
	//public static double divide(double a, double b) {
	//  double result = 0;
	//  result = a/b;
	//  return result;
	
	// double 변수 두개를 받아서 큰수/작은수
	
	public static double divide(double a, double b) {
		double result = 0;
		if (a > b) {
			result = a / b;
			return result;
		} else {
			result = b / a;
			return result;
		} 
	}
}