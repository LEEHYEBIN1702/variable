package variable;

public class DateTypeExample {

	public static void main(String[] args) {
	       byte num1 = 127;
	       short num2 = 128;
	       int num3 = 100000000;
	       long num4 = 10000000000L;
	       
	       byte val1 = 10;
	       num3 = val1;
	       // 아래는 오류 나는데 얘는 안 나는 이유
	       //자동으로 데이터 타입 맞춰줌 (행변화 자동)
	       //프로모션
	       byte result = (byte) (num1 + val1);
	       // num1 + val1만 적으면 데이터 타입이 안 맞아서 오류가 남
	       // 앞에 byte 적어주고 괄호 쳐주면 강제로 데이터 타입을 맞춰준다는 의미
	       // 캐스팅 
	       // 자바에선 데이터 타입 맞춰주는 게 중요함
	       
	       num1 = 120; // -128~127
	       num1++;
	       //증가 연산자를 썼을 때 인트 (정수)로 바뀌지 않고 그대로 바이트 타입
//	       num1++;
			for (int i = 0; i < 20; i++) {
				System.out.println(num1++);
			}
			
			char char1 = 65;
			System.out.println(char1);
			//정수 65에 해당하는 문자가 A
			char char2 = 66;
			System.out.println(char2);
			//정수 66에 해당하는 문자가 B
			char char3 = 97;
			for (int i = 0; i < 26; i++) {
				System.out.println(char3++);
			}
			
			float floatVal = 4.567F;
			//float 타입일 땐 뒤에 F 붙여서 표기
			double doubleVal = 3.4567;
			// 실수 타입 때는 double이 기준형
			
			
				
		
		}
}
