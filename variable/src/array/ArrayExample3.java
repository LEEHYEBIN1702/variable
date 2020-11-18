package array;

public class ArrayExample3 {
	public static void main(String[] args) {

		// int num1 = 10, num2 = 20;
		// int temp;
		// 두개의 숫자를 비교해서 큰 수를 템프에 담고 싶음
		// if (num1>num2) {
		// temp = num1;
		// }else {
		// temp = num2;
		// }
		// System.out.println("큰수는: " + temp);

		int temp =0;
		int[] intAry = { 34, 25, 57, 39, 55 };
		for (int num : intAry) {
			if (temp < num) {
				temp = num;
			}
		}
		System.out.println("큰수는: " + temp);
		// if절로 큰 수 따지는 건 경우 하나 하나 따져봐야 하는데.
		//배열을 이용해서 쉽게 가장 큰 값을 따질 수 있다.
	}
}
