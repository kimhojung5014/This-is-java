package Ch11.Test;

public class eX7 {

	public static void main(String[] args) {
		String str = "모든 프로그램은 자바 언어로 개발될 수 있다.";
		int index = str.indexOf(str);
		if(index == -1) {
			System.out.println("자바가 포함되어 있지 않다.");
		}else {
			System.out.println("자바 문자열이 포함되어 있다.");
			str = str.replace("자바", "java");
			System.out.println("--"+str);
		}
	}

}
