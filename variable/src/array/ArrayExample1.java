package array;

public class ArrayExample1 {
	public static void main(String[] args) {
		int[] intAry;
		int sum = 0;
		intAry = new int[] { 34, 66, 82 };
		for (int i = 0; i < intAry.length; i++) {
			sum += intAry[i];
		}
		System.out.println("결과값1: " + sum);

		sum = 0;// 이걸 안 적으면 위에 값에 누적돼서 값이 보인다
		sum = sumAry(intAry);
		System.out.println("결과값2: " + sum);

		int[] intAry2 = { 11, 22, 33, 44, 55, 66, 77 };
		sum = sumAry(intAry2);
		System.out.println("결과값3: " + sum);
	}

	public static int sumAry(int[] ary) {
		// 인트형 매개변수를 받고 인트형으로 출력해주겠다
		int sum = 0;
		for (int num : ary) {
			sum += num;
			// ary 갯수만큼 반환하겠다
		}
		return sum;
	}
}
