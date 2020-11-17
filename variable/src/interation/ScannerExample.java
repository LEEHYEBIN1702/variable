package interation;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true; // 트루의 값으로 초기값이 들어가 있음
		int balance = 0; // 0의 값으로 초기값이 들어가 있음
		while (run) {
			System.out.println("----------------");
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			System.out.println("----------------");
			System.out.print("선택> ");
			int menu = scn.nextInt();
			if (menu == 1) {
				System.out.println("예금액> ");
				balance += scn.nextInt();
			} else if (menu == 2) {
				System.out.println("출금액> ");
				balance -= scn.nextInt();
			} else if (menu == 3) {
				System.out.println("잔고> " + balance);
     		} else if (menu == 4) {
				run = false; //while (run) = true 일 때만 반복되니까 
				             // 런 값에 페일 입력해주면 종료되는 원리.
         	}

		} // end of while
		System.out.println("프로그램 종료.");

	} // end of main ()
	
} // end of class
