package Ch11.thinclone;

public class MemberExample {

	public static void main(String[] args) {
		Member original = new Member("blue", "홍길동", "12345", 25, true);
		
		Member cloned = original.getMember();
		cloned.password = "67890";
		System.out.println("원본");
		System.out.println("id: "+original.id);
		System.out.println(original.name);
		System.out.println(original.password);
		System.out.println(original.age);
		System.out.println(original.adult);
		
		System.out.println("복사본");
		System.out.println("id: "+cloned.id);
		System.out.println(cloned.name);
		System.out.println(cloned.password);
		System.out.println(cloned.age);
		System.out.println(cloned.adult);
	}

}
