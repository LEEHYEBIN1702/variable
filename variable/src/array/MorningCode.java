package array;

public class MorningCode {
	public static void main(String[] args) {
		int[][] intAry = new int[5][5];
		int sum = 1;
		for (int i = 0; i < intAry.length; i++) {
			for (int j = 0; j < intAry.length; j++) {
				System.out.println("intAry[" + i + "," + j + "]" + sum++);
			}
		}
		int[][] intAry2 = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 } };

		// for문을 이용하면 저렇게 쉽게 배열의 값을 넣을 수 있지만
		// for문이 아닐 시 일일이 하나하나 다 적어줘야 한다.

		String[] strAry = { "Hello", "World" };
		for (String str : strAry) {
			System.out.print(str);
			
			//어제 한 거라 안 적어도 되는데 걍 따라 적어봤음.. 
		}
	}
}
