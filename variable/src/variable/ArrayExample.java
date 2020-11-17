package variable;

public class ArrayExample {
	public static void main(String[] args) {
       int num1 = 10;
       int num2 = 20;
       
       int[] numbers = {10, 20, 30, 40, 50};
    	//값을 여러개 담을 수 있는 배열 타입의 데이터 타입 배열 변수
       numbers[1] = 200;
       System.out.println(numbers[1]);
       // 변수를 담을 수도 있다.
       
      int sum = 0;
      for (int i = 0; i < 5; i++) {
    	  System.out.println(numbers[i]); 
    	  sum += numbers[i];
      }
      System.out.println("합 : " + sum);
      
      String[] strings =  { "Hello", "World", "Nico", "To", "Meet"};
      // 문자를 담는 변수
      strings[2] = "Good";
      //문자도 역시도 다른 변수를 담을 수 있다.
      for(int i=0; i<strings.length; i++) {
    	  System.out.print(strings[i]);
      }
	}
}
