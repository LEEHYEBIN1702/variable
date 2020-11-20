package variable3;

public class MemberExample {
	public static void main(String[] args) {
       Member m1 = new Member();
	   m1.memNo = 1;
       m1.name = "이혜빈";
       m1.number = "01027731702";
       m1.className = "스포츠댄스";
       m1.showMemberInfo ();
       
       Member m2 = new Member();
	   m2.memNo = 2;
       m2.name = "김다현";
       m2.number = "01033909817";
       m2.className = "수영";
       m2.showMemberInfo ();
       System.out.println();
       
       Member [] Members = {m1, m2};
       for (Member Mem : Members) {
    	   System.out.println(Mem.memNo);
    	   System.out.println(Mem.name);
    	   System.out.println(Mem.number);
    	   System.out.println(Mem.className);
    	   System.out.println();
       }
	}
}
