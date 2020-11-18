package array;

public class ArrayExample2 {
	public static void main(String[] args) {
       double result = 0;
       double [] dAry = {23.2, 55.3, 52.8, 62.8};
       result = doubleSum(dAry);
       System.out.println(result);
       result = doubleSum1(dAry);
       System.out.println(result);
       
	}
	
	// double [] => 23.2, 55.3, 52.8, 62.8 : dAry
	// method: doubleSum() , 매개변수 : double []
	// 반환해주는 값 : double
	
	public static double doubleSum (double[] dAry) {
		double sum=0;
		for (double num:dAry) {
			sum+= num;
		}
		return sum;
	}
	public static double doubleSum1 (double[] dAry) {
		double sum=0;
		double avg =0;
		for(double num:dAry) {
			sum+=num;
			avg= sum/dAry.length;
			
			
		}
		return avg;
	}
}
