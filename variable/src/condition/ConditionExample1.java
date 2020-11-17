package condition;

public class ConditionExample1 {
	public static void main(String[] args) {
		int score = 59;
		String grade = "";

		// if (score >= 90) {
		// grade = "A";
		// } else if (score >= 80) {
		// grade = "B";
//
//		}

		// 70점 이상 C , 60점 이상 D, 60 미만 F

		if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}

		System.out.println(score + "점은 " + grade + " 입니다.");
	}
}