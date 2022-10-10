package Ch11;

import java.text.MessageFormat;

public class MessageFormatex {

	public static void main(String[] args) {
		String id = "java";
		String name = "신용권";
		String tel = "010-1234-1234";
		
		String text = "회원 ID: {0} \n회원 이름: {1}\n회원 전화: {2}";
		String result1 = MessageFormat.format(text, id, name, tel);
		System.out.println(result1);
	}

}