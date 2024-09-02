import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate {

	private int month;
	private int date;
	private int year;

	public MyDate() {
		GregorianCalendar calendar = new GregorianCalendar();
		
		month = calendar.get(Calendar.MONTH);
		date = calendar.get(Calendar.DAY_OF_MONTH);
		year = calendar.get(Calendar.YEAR);
	}

	public MyDate(long lapsedTime) {
		setDate(lapsedTime);
	}

	public MyDate(int month, int date, int year) {
		this.month = month;
		this.date = date;
		this.year = year;
	}

	public void setDate(long elapsedTime) {
		
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTimeInMillis(elapsedTime);
		
		month = calendar.get(Calendar.MONTH);
		date = calendar.get(Calendar.DAY_OF_MONTH);
		year = calendar.get(Calendar.YEAR);
	}

	public int getMonth() {
		return month;
	}

	public int getDate() {
		return date;
	}

	public int getYear() {
		return year;
	}
}