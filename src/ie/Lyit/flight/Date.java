package ie.Lyit.flight;

public class Date {
	
	private int day;
	private int month;
	private int year;
	
	public Date()
	{
		day = 0;
		month = 0;
		year = 0;
	}
	
	public Date (int d, int m, int y)
	{
		day = d;
		month = m;
		year = y;
	}
	
	@Override
	public String toString()
	{
		return(day+"\t"+month+","+year);
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Date naObject;
		if (obj instanceof Date)
			naObject = (Date)obj;
				
			else
				return false;
		
		return (this.day == (naObject.day)
				&&this.month == (naObject.month)
				&&this.year == (naObject.year));
	}
	
	public void setDay( int setDayTo)
	{
		day = setDayTo;
	}
	public int getDay()
	{
		return day;
	}
	
	public void setMonth( int setMonthTo)
	{
		month = setMonthTo;
	}
	public int getFirstName()
	{
		return month;
	}
	
	public void setYear ( int setYearTo)
	{
		year = setYearTo;
	}
	public int getYear()
	{
		return year;
	}	
}
