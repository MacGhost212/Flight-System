package ie.Lyit.tester;
import ie.Lyit.flight.Date;


public class DateTesting 
{
	public static void main(String[] args)
	{
		Date Date1 = new Date(1, 12, 2001);
		Date Date2 = new Date(22, 5, 1956);
		
		System.out.println(Date1.toString());
		System.out.println(Date2.toString());
	
		Date1.setYear(2001);
		System.out.println("");
		
		System.out.println(Date1.toString());
		System.out.println(Date2.toString());
		
		System.out.println("These have the same date?" + Date1.equals(Date2) );
		

	}

}
