package ie.Lyit.flight;

public class Passenger extends Person
{
	private int noBags;
	private boolean priorityBoarding;
	
	public Passenger()
	{
		super();
		noBags = 0;
		priorityBoarding = false;
	}
	
	public Passenger( Name nameIn, Date dateIn, int noBagsIn, boolean pBIn)
	{
		super(nameIn, dateIn);
		this.noBags = noBagsIn;
		this.priorityBoarding = pBIn;
	}
	
	public String toString()
	{
		return( super.toString() + " | number of Bags: "+ noBags +" is a priority: " + priorityBoarding);	
	}
	
	public int getNoBags()
	{
		return noBags;
	}
	
	public void setNoBags(int bagIn)
	{
		noBags = bagIn;
	}
	
	public boolean getPBoarding()
	{
		return priorityBoarding;
	}
	
	public void setPBoarding(boolean pBIn)
	{
		priorityBoarding = pBIn;
	}
}
