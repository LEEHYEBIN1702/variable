 package variable2;

public class VariableExample {
	public static void main(String[] args) {
		int num = 10;
		String str = "Hello";
		double dbl = 3.4;

		String name = "Hong";
		int age = 10;
		double height = 178.8;

		String name1 = "Hwang";
		int age1 = 15;
		double height1 = 188.8;

		Person p1 = new Person("Choi", 20, 175.5);
		// 생성자 (=Person)를 필드에다가 값을 지정
		System.out.println("p1의 이름:" + p1.getName());
		System.out.println("p1의 이름:" + p1.getAge());
		System.out.println("p1의 이름:" + p1.getHeight());

		System.out.println("======================");

//		Person p1 = new Person(); // Person 클래스이름
		// 이런 걸 인스턴스라고 부름
		p1.name = "Hong";
		p1.setName("홍"); // 원래 Hong 이었는데 홍으로 메소드 이용해서 바꿈
		p1.age = 10;
		p1.setAge(11);
		p1.height = 178.8;

		System.out.println("p1의 이름:" + p1.getName());
		System.out.println("p1의 나이:" + p1.getAge());
		System.out.println("p1의 키:" + p1.getHeight());
		p1.showInfo();
		// 프라이빗 처리했더니 오류가 남.
		// 그래서 보통 필드 정보는 프라이빗 처리하고 메소드 이용해서 정보 입력하는 편
		// 메소드로 입력한 정보는 오류 안 남.

//		System.out.println(p1.name);
//		System.out.println(p1.age);
//		System.out.println(p1.height);

		Person p2 = new Person();
		p2.name = "Hwang";
		p2.age = 15;
		p2.height = 188.8;
		p2.showInfo();

//		System.out.println(p2.name);
//		System.out.println(p2.age);
//		System.out.println(p2.height);

		Person p3 = new Person();
		p3.name = "park";
		p3.age = 17;
		p3.height = 166.8;
		p3.showInfo();
//		 System.out.println(p3.name);
//		 System.out.println(p3.age);
//	     System.out.println(p3.height);
		System.out.println();
		System.out.println();

		Person[] persons = { p1, p2, p3 };
		for (Person per : persons) {
//			System.out.println(per.name);
//			System.out.println(per.age);
//			System.out.println(per.height);
			System.out.println();

		}

		// System.out.println(p3.name);
		// System.out.println(p3.age);
		// System.out.println(p3.height);
		// 클래스 펄슨의 구조를 따와서 정보를 출력하는 것

	}
}
