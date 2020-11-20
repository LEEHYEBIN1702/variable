package variable6;

public class Member {
	private int memNo;
	private String name;
	private String number;
	private String className;
	public int getMemNo() {
		return memNo;
	}
	public void setMemNo(int memNo) {
		this.memNo = memNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public Member(int memNo, String name, String number, String className) {
		super();
		this.memNo = memNo;
		this.name = name;
		this.number = number;
		this.className = className;
	}
	@Override
	public String toString() {
		return "Member [memNo=" + memNo + ", name=" + name + ", number=" + number + ", className=" + className + "]";
	}
	
}
