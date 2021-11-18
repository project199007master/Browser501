package time;

import java.util.Calendar;

public class Time_Java {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		System.out.println(hour + "시 " + minute + "분 " + second +"초");

	}

}
