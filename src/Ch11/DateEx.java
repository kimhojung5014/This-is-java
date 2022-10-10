package Ch11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		Date now = new Date();
		String strnow = now.toString();
		System.out.println(strnow);
		SimpleDateFormat sdf =
				new SimpleDateFormat("yyyy년 mm월 dd일 hh시  mm분 ss초");
		String strnow2 = sdf.format(now);
		System.out.println(strnow2);
	}

}
