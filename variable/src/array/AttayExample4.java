package array;

public class AttayExample4 {
	public static void main(String[] args) {

		int[][] intAry = new int[3][3];
		intAry[0] = new int[] { 11, 12, 13 };
		intAry[1] = new int[] { 21, 22, 23 };
		intAry[2] = new int[] { 31, 32, 33 };
		System.out.println(intAry[0][0]);
		System.out.println(intAry [0].length);
		// 배열 몇번째 줄에 몇 자 들어갔는지 세어줌
		for (int i = 0; i < intAry.length;i++) {
			for (int j =0; j <intAry[i].length; j++) {
				System.out.println("intAry[" +i+ "," +j+ "]" + ">" + intAry [i][j]);
			}
		}
		int[][] intAry2 = { //
				{11, 12, 13},//
				{21},//
				{31, 32}//
		}; // 이런 이상한 배열도 있음 
		// 근데 잘 안 써 걍 참고용
		System.out.println(intAry2[0].length);
		//intAry2의 배열의 각 합, 평균...
		// intAry2[0] = > 합: ??, 평균: ??
		// intAry2[1] = > 합: ??, 평균: ??
		// intAry2[2] = > 합: ??, 평균: ??
		int sum =0;
		for (int i=0; i<intAry2.length; i++) {
			
		}
		
	}
}