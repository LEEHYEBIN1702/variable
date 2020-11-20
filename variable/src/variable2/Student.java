package variable2;

public class Student {
	private String name;
	private int number;
	private int math;
	private int english;

	public void setName (String name) {
		this.name = name;
	}

	public void setNumber (int number) {
		this.number = number;
	}

	public void setMath (int math) {
		this.math = math;
	}

	public void setEnglish (int english) {
		this.english = english;
	}
    
	public int totalScore () {
		return math + english;
	}
	public void studentInfo() {
		System.out.println("이름: "+ name + ", " + "학번: "+ number);
		
	}
	
}