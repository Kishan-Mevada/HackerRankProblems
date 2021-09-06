package com.kishan.year_2021.month_sept.date_6;

/**
 * Given a time in -hour AM/PM format, convert it to military (24-hour) time.
 *
 * Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
 * - 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
 *
 * Example
 *
 * input  '12:01:00PM'
 * Return '12:01:00'.
 *
 * input  12:01:00AM
 * Return '00:01:00'.
 */
public class TimeConversion {

	static String convert(String s){
		String hour = s.substring(0,2);
		if(s.endsWith("AM")){
			if("12".equals(hour)){
				hour = "00";
			}
		}
		else if(s.endsWith("PM")){
			if(!"12".equals(hour)) {
				hour = "" + (Integer.parseInt(hour) + 12);
			}
		}

		if(hour.length() == 1){
			hour = "0" + hour;
		}

		return hour + s.substring(2,s.length()-2);
	}
	public static void main(String[] args) {
		System.out.println("convert 12:01:00PM -> " + convert("12:01:00PM"));
		System.out.println("convert 12:01:00AM -> " + convert("12:01:00AM"));
		System.out.println("convert 07:05:45PM -> " + convert("07:05:45PM"));
	}
}
