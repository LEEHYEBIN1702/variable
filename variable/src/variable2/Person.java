package variable2;

public class Person {
	// 필드 ***용어 외워***
	String name;
	int age;
	double height;

//	private name;
//	private age;
//	private height;
	// 외부에서 정보에 접근 못 하게 막겠다.

	// 생성자: 필드의 초기값 지정.
	public Person() {
		this.name = "초기이름";
		this.age = 10;
		this.height = 170.0;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;

	}

	// 메소드 ***용어 외워***
	public void showInfo() {
		System.out.println("이름: " + name + " " + "나이: " + age + " " + "키 : " + height);
		// 네임은 변수가 아니라 필드를 말 하는 것
	}

	// 필드에 값을 저장, 불러오는 기능.
	public void setName(String name) {
		this.name = name;
		//
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public double getHeight() {
		return this.height;
	}

	public void setAge(int age) {
		if (age > 0)
			this.age = age;
		else
			this.age = age;
	} // 잘못된 값을 방지하기 위해 if 구문 사용.
		// 프라이빗으로 접근을 막아서 다른 클래스에서 못 보지만 같은 클래스 내에선 보기 가능.
		// 따로 this.age라고 지정해줘서 볼 수 있음.
}
