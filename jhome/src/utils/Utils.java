package utils;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Utils {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	}

	public static boolean workday(Calendar date) {
		boolean rv;
		int dow = date.get(Calendar.DAY_OF_WEEK);
		int ggPasquetta = 0;
		int mmPasquetta = 0;

		rv = 
				(dow != Calendar.SATURDAY) && 
				(dow != Calendar.SUNDAY) && 
				!(
						dayIs(date, 1, 1) ||			// 1 gennaio (capodanno)
						dayIs(date, 6, 1) ||			// 6 gennaio (epifania)
						dayIs(date, 15, 2) ||			// 15 febbraio (San Faustino e Giovita)
						dayIs(date, ggPasquetta, mmPasquetta) ||
						dayIs(date, 25, 4) ||			// 25 aprile (liberazione)
						dayIs(date, 1, 5) ||			// 1 maggio (lavoratori)
						dayIs(date, 2, 6) ||			// 2 giugno (repubblica)
						dayIs(date, 15, 8) ||			// 15 agosto (assunzione)
						dayIs(date, 1, 11) ||			// 1 novembre (tutti i santi)
						dayIs(date, 8, 12) ||			// 8 dicembre (immacolata)
						dayIs(date, 25, 12) ||		// 25 dicembre (natale)
						dayIs(date, 26, 12)			// 26 dicembre (San Stefano)
				)
		;
		return rv;
	}

	/**
	 * 
	 * @param day
	 * @param month
	 * @return
	 */
	public static boolean todayIs(int day, int month) {
		return dayIs(new GregorianCalendar(), day, month);
	}

	/**
	 * 
	 * @param date
	 * @param day
	 * @param month
	 * @return
	 */
	private static boolean dayIs(Calendar date, int day, int month) {
		month--;
		return (date.get(Calendar.DAY_OF_MONTH) == day) && (date.get(Calendar.MONTH) == month);
	}


}
