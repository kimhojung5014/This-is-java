package Ch11.Test;

import java.util.StringTokenizer;

public class SplitExample {

	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";
		
		String[] result = str.split(",");
		for(String name:result) {
			System.out.println(name);
		}
		
		StringTokenizer st = new StringTokenizer(str, ",");
		
		int con = st.countTokens();
		for(int i=0; i<con; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
