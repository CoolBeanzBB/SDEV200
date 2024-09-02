public class MyDateTest {
	public static void main(String[] args) {

		MyDate date1 = new MyDate();
		MyDate date2 = new MyDate(561555550000L);
	
		System.out.println("Year: " + date1.getYear());
		System.out.println("Month: " + date1.getMonth());
		System.out.println("Date: " + date1.getDate());
		
		System.out.println();
		System.out.println("Year: " + date2.getYear());
		System.out.println("Month: " + date2.getMonth());
		System.out.println("Date: " + date2.getDate());
	}
}
