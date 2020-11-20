package method;

public class MethodExample {
	public static void main(String[] args) {
      Math m1 = new Math();
      double sum = m1.sum (10.5,20); //20도 알아서 더블타입으로 변환해줌
      System.out.println("결과: " + sum);
      
      
      double area = m1.getArea(5.5); //pi*r*r 
      System.out.println("원의 넓이: " +area);
      
      // 정사각형 넓이: getRectangle, 매개변수:4.2
      double rectangle = m1.getRectangle (4.2);
      System.out.println("정사각형 넓이: " + rectangle);
      
      // 직사각형 넓이 getRectangle, 매개변수:4.2, 2.4
      double rectangle1 = m1.getRectangle (4.2, 2.4);
      System.out.println("직사각형 넓이: " + rectangle1);
      
      int [] intAry = {5, 10, 15, 20};
      int arysum = m1.getArySum(intAry);
      System.out.println("배열의 합: " + arysum);
      
      
      Person p1 = new Person("이창호", 10, 135.5, 32.5);
      double d1 = m1.getProperWeight(p1);
      if(p1.weight > d1) {
    	  System.out.println("체중과다...");
      }else if (p1.weight == d1) {
    	  System.out.println("적정체중...");
      }else {
    	  System.out.println("체중미달...");
      }
      
	}
}
