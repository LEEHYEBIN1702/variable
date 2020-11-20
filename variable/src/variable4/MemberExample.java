package variable4;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.setMemNo(1);
		m1.setName("홍길동");

		System.out.println(m1.getMemNo());
		System.out.println(m1.getName());

		
		System.out.println(m1.toString());

	}

}
