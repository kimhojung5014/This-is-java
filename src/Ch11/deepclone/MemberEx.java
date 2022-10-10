package Ch11.deepclone;

public class MemberEx {

	public static void main(String[] args) {
		Member original = new Member("홍길동", 25, new int[] {90,90}, new Car("소나타"));
		Member cloned = original.getMember();
		
		System.out.println("[원본 필드값]");
		System.out.println("이름 "+original.name);
		System.out.println("나이 "+original.age);
		System.out.print("배열 "+original.scores[0]+" ");
		System.out.println(original.scores[1]);
		System.out.println("카모델"+original.car.model);
		
		original.name = "김";
		original.age = 20;
		original.scores[0]=1;
		original.scores[1]=2;
		original.car.model = "아반떼";
		System.out.println();
		
		
		System.out.println("[복제 필드값]");
		System.out.println("이름 "+cloned.name);
		System.out.println("나이 "+cloned.age);		
		System.out.print("배열 "+cloned.scores[0]+" ");
		System.out.println(cloned.scores[1]);
		System.out.println("카모델 "+cloned.car.model);
		
		
	}

}
