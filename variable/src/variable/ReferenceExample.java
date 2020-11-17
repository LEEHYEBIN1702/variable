package variable;

public class ReferenceExample {
public static void main(String[] args) {
	String str1 = "Hello"; //고유 주소값..
	String str2 = "Hello"; //고유 주소값..
	String str3 = new String ("Hello"); // 고유 주소값..
    // new String 으로 입력해주면 새로운 주소값을 부여해준다.
	
	if (str1.equals(str3)) {
		System.out.println("동일한 주소값.");
	} else {
		System.out.println("다른 주소값.");
	
	}

}
}
