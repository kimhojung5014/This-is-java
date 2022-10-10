package Ch11;

import java.util.Calendar;

public class CalendearEx {
	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int weak = now.get(Calendar.DAY_OF_WEEK);
		int ampm = now.get(Calendar.AM_PM);
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.print(year+"년 ");
		System.out.print(month+"월 ");
		System.out.print(day+"일 ");
		System.out.print(weak+"요일 ");
		System.out.print(ampm);
		System.out.print(hour+"시 ");
		System.out.print(minute+"분");
		System.out.print(second+"초");
	}
}
