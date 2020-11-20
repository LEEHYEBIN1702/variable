package method;

public class MethodExample1 {
	public static void main(String[] args) {
      Rectangle r1 = new Rectangle();
       r1.drawRectangle();
       // return 값이 없다 
       
      String result = r1.getRectangle();
      System.out.println("결과: " + result);
        
      r1.drawShape("ㅇㅇㅇ");
	}
}
