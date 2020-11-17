package interation;

public class MorningCode {
	public static void main(String[] args) {
		int sum7 = 7;
		for (int i = 1; i <= 50; i++) {
			if (i % sum7 == 0) {
				System.out.println(i + "는" + "7의 배수입니다.");

			}
		}
		int sum8 = 8;
		for (int i1 = 1; i1 <= 50; i1++) {
			if (i1 % sum8 == 0) {
				System.out.println(i1 + "는" + "8의 배수입니다.");

			}
		}
       int i = 1;
       int sum56 = 7*8;
       while (i <50) {
    	   i++;
    	   if (i % sum56 == 0) {
    		   System.out.println(i + "는" + "7과 8의 공통배수 입니다.");
    	   }
       }
	}
}
