package interation;

public class Exercise04 {
	public static void main(String[] args) {
		boolean run = true;
		int num1 = (int) (Math.random() * 4) + 1;
		int num2 = (int) (Math.random() * 4) + 1;
		int result = num1 + num2;
		while (run) {
		if (result != 5) {
		} run = false;
		if (result == 5) {
	    System.out.println(num1 + "," + num2);
		  run = false;
			}
		}
	}
}
