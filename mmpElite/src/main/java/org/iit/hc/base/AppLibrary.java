package org.iit.hc.base;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AppLibrary {
	
	public static String FutureDate(int days , String Pattern) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, days);
		Date d = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat(Pattern);
		return sdf.format(d);
	}

}