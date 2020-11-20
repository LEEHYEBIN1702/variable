package variable4;

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
		// this 옆에 memNo는 필드의 memNo다.
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
	@Override
	public String toString() {
		return "Member [회원번호=" + memNo + ", 회원이름=" + name + ", 연락처=" + number + ", 강좌=" + className + "]";
	}
	
}
