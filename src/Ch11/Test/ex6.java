package Ch11.Test;

import java.io.UnsupportedEncodingException;

public class ex6 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		byte[] b = {1,2,3};
		
			String string = new String(b,"MS949");
		
		System.out.println(b);
	}

}
