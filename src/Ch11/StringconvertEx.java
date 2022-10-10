package Ch11;

public class StringconvertEx {

	public static void main(String[] args) {
		String str = "200";
		int intdata1 = Integer.parseInt(str);
		System.out.println(intdata1);
		
		int intdata2 = 200;
		String str1 = String.valueOf(intdata2);
		System.out.println(str1);
	}

}
