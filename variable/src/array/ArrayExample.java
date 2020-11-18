package array;

public class ArrayExample {
	public static void main(String[] args) {
       int[] intAry = new int [5];
       intAry [0] = 15;
       intAry [4] = 33;
       for (int i = 0; i <5; i++) {
    	   System.out.println(intAry[i]);
    	   // 출력해보면 값을 지정해준 건 지정해준대로 나오지만
    	   //정해주지 않은 기본 값은 0이다.
       }
       double[] doubleAry;
       doubleAry = new double[] {2.3, 2, 4.5, 2.2, 1.6}; 
       System.out.println(doubleAry[0]);
       // 배열을 선언하면서 값을 넣을 수 있다.
       double sum = 0;
       for(int i=0; i<doubleAry.length; i++) {
    	   sum += doubleAry [i];
       }
       System.out.println("sum: " + sum);
       // 숫자를 따로 세서 적지 않아도 .length를 적으면 입력된 숫자만큼 범위 지정해준다.
       
       
       
       
       // enhanced for 
       // 되게 자주 쓰고 입력한 숫자 전체를 더할 때나 기타 등등 자주 씀
       // 간편하게 쓰는 방법
       sum = 0;
       for (double dbl : doubleAry) {
    	  sum += dbl;
//    	   System.out.println(dbl);
    	  
    	   //doubleAry 값에 들어있는 숫자만큼 dbl에 담아서 반복해서 출력 
       }
       System.out.println("sum: " + sum);
	}
}
