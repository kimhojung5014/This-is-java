package Ch11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date2 {

	public static void main(String[] args) {
		
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 mm월 dd일 hh시 mm분 ss초");
		
		System.out.println(sdf.format(now));
	}

}
