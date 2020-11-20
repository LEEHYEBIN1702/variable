package back;

import java.util.Scanner;

public class Banking {
	public static void main(String[] args) {
		Customer[] customers = new Customer[100];
		Scanner scn = new Scanner(System.in); // 컨트롤 쉬프트 알파벳 O 눌러주면 오류 해결됨
		boolean run = true;

		while (run) {
			System.out.println("---------------------------------");
			System.out.println("1.계좌생성 2.리스트 3.입금 4.출금 5.종료");
			System.out.println("---------------------------------");
			System.out.println("선택> ");

			int selectNo = scn.nextInt();scn.nextLine();
			if (selectNo == 1) {
				System.out.println("1.계좌생성 선택했습니다.");
				System.out.print("계좌번호 입력> ");
				String accNo = scn.nextLine(); //nextLine이 문자열+엔터키 처리를 한번에 처리해줌 
				//그래서 계좌번호 입력도 안 했는데 계좌주 입력에서 깜빡거리고 있음
				// 그럴 땐 int selectNo = scn.nextInt(); 다음에 scn.nextLine(); 한번 더 입력해주면 됨
				System.out.print("계좌주 입력> ");
				String owner = scn.nextLine();
				System.out.println("입금액을 입력> ");
				int balance = scn.nextInt();
				Customer c1 = new Customer(accNo, owner, balance);
				for (int i = 0; i < customers.length; i++) {
					if (customers[i] == null) { // 값이 입력되어 있는데 다른 값이 입력되면 안되니까 
						customers[i] = c1;      // null일때만 들어가게 하는 것
						break;
					}
				}
				System.out.println("한건 입력 완료.");
			} else if (selectNo == 2) {
				System.out.println("2.리스트 선택했습니다.");
				for (int i=0; i<customers.length; i++) {
					if(customers[i] != null) //if 구문에 실행해야 할 라인이 하나밖에 없으면 중괄호 생략 가능
					   customers[i].showAccountInfo();
				}
			} else if (selectNo == 3) {
				System.out.println("3.입금 선택했습니다.");
				 System.out.println("계좌번호 선택> ");
				 String accNo = scn.nextLine();
				 System.out.println("입금액 입력> ");
				 int balance = scn.nextInt();
				 for(int i=0; i<customers.length; i++) {
					 if(customers[i] != null && accNo.equals(customers[i].getBankAccount())) {
						int currentBalance = customers[i].getBalance();
						customers[i].setBalance(currentBalance + balance);
					 }
				 }
			} else if (selectNo == 4) {
				System.out.println("4.출금 선택했습니다.");
			} else if (selectNo == 5) {
				System.out.println("5.종료 선택했습니다.");
				run = false;
			}
		} // end of while
		System.out.println("프로그램 종료.");
	}

}
