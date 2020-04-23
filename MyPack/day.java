package MyPack;

import java.util.Calendar;

public class day {

	
	public static String findDay(int month, int day, int year) {

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, month-1);
        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.YEAR, year);

        String[] day_of_week = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY","SATURDAY"};

        return day_of_week[cal.get(Calendar.DAY_OF_WEEK)-1];
    }
	

	public static void main(String[] args) {
		String dayString = findDay(10, 9, 1998);
		
		System.out.println(dayString);
	}

}
