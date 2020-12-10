package dao;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public interface dateSQLFormat {
	/**
	 *  
	 * @param date from Date java package
	 * @return the correct String format according to SQL "yyyy-mm-dd"
	 */
	public default String dateFormatSQL(Date date) {
		
		if(date == null) {
			return null;
		}
		
		// The ZoneId here has no implication since we only keep the year, month and day
		ZonedDateTime localDate = date.toInstant().atZone(ZoneId.of("Europe/Paris"));
		
		Integer year = localDate.getYear(); // Year
		String dateFormat = year.toString();
		dateFormat += "-";
		dateFormat += localDate.getMonthValue(); // Month
		dateFormat += "-";
		dateFormat += localDate.getDayOfMonth(); // Day
		
		return dateFormat;
	}
}
