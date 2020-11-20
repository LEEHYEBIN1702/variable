package variable5;

public class Member {
	private int memNo;
	private String name;
	private String number;
	private String className;
	
	public Member() { //기본생성자:매개변수 X
		

	}
	
	public Member(int memNo, String name) {
		super();
		this.memNo = memNo;
		this.name = name;
		// 이클립스 기능으로 만들어 본 것
	}

	public Member(int memNo, String name, String number, String className) {
		this.memNo=memNo;
		this.name=name;
		this.number=number;
		this.className=className;
	}
	
	public int getMemNo() {
		return memNo;
	}
	public String getName() {
		return name;
	}
	public String getNumber() {
		return number;
	}
	public String getClassName() {
		return className;
	}
	
}
