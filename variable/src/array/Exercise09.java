package array;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 4;
		int[] scores;
		scores = new int[] { 85, 50, 80, 90 };
		int sum = 0;
		int avg = 0;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 : 2.점수입력 : 3.점수리스트 : 4.분석 : 5.종료");
			System.out.println("----------------------------------------------");
			System.out.println("선택> ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				System.out.println(studentNum);
			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("score [" + i + "]" + " > ");
					scores[i] = scanner.nextInt();
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]" + " > " + scores[i]);
 			   }
			} else if (selectNo == 4) {
				int score = 0;
				for (int max : scores) {
					if (score < max) {
						score = max;
					}
				}
				System.out.println("최고 점수: " + score);
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
					avg = sum / scores.length;
				}
       			System.out.println("평균 점수: " + avg);
			} else if (selectNo == 5) {
				run = false;
			}
		} // end of while

		System.out.println("프로그램 종료");
	}// end of main
}// end of class
