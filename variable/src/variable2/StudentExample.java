package variable2;

public class StudentExample {
	public static void main(String[] args) {

//  	Student s1 = new Student();
//		s1.name = "이혜빈";
//		s1.number = 27731702;
//		s1.math = 18;
//		s1.english = 10;

//		System.out.println(s1.name);
//		System.out.println(s1.number);
//		System.out.println(s1.math);
//		System.out.println(s1.english);
//		System.out.println();

//		Student s2 = new Student();
//		s2.name = "최유진";
//		s2.number = 28347853;
//		s2.math = 5;
//		s2.english = 10;

//		System.out.println(s2.name);
//		System.out.println(s2.number);
//		System.out.println(s2.math);
//		System.out.println(s2.english);
//		System.out.println();

//		Student[] student = { s1, s2 };
//		for (Student str : student) {
//			System.out.println(str.name);
//			System.out.println(str.number);
//			System.out.println(str.math);
//			System.out.println(str.english);
//		}
		Student s1 = new Student();
		s1.setName ("이혜빈");
		s1.setNumber(121212);
		s1.setMath (70);
		s1.setEnglish (80);
		s1.studentInfo();
		s1.totalScore();
		System.out.println("합계점수: " + s1.totalScore());
        // Sysout 없으면 토탈스코어는 실행해봐도 반응이 없음
		// 스튜던트 클래스 가보면 단순히 더해서 리턴까지만 해놨음.
		// Sysout 해서 출력해줘야 함
		
		
		
	}
}