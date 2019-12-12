package com.ibm.shopping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDifference {
	public String dateDiff(String dateStart) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		Date d1 = null;
		Date d2 = new Date();

		try {
			d1 = format.parse(dateStart);
			//d2 = format.parse(dateStop);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("d1 : " + d1);
		//System.out.println("d2 : " + d2);
		// Get msec from each, and subtract.
		long diff = d2.getTime() - d1.getTime();
		long diffSeconds = diff / 1000;
		long diffMinutes = diff / (60 * 1000);
		long diffHours = diff / (60 * 60 * 1000);
		
		String status = "";
		
		if(diffHours == 0) {
			if(diffMinutes == 0) {
				if(diffSeconds == 0) {
					status = "just now";
				} else {
					status = String.valueOf(diffSeconds) + " seconds ago";
				}
			} else {
				status = String.valueOf(diffMinutes) + " minutes ago";
			}
		} else {
			status = String.valueOf(diffHours) + " hours ago";
		}
		
		return status;
	}

}
