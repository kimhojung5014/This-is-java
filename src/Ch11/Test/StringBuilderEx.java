package Ch11.Test;

public class StringBuilderEx {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder(100);
		for(int i=1;i<=100;i++) {
			sb.append(i);
		}
		System.out.println(sb);
	}

}
