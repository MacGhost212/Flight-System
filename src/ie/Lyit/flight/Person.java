package ie.Lyit.flight;

public class Person 
{
	protected Name name;
	protected Date dateOfBirth;
	
	
	public Person()
	{
		name = new Name();
		dateOfBirth = new Date();
	}
	
	//overloaded initializtion constructor
	public Person (Name n, Date d)
	{
		name = n;
		dateOfBirth = d;
	}
	
	@Override
	public String toString()
	{
		return name.toString() + "," + dateOfBirth;
	}
	
	public boolean equals(Object obj)
	{
		Person naObject;
		if (obj instanceof Person)
			naObject = (Person)obj;
				
			else
				return false;
		
		return (name.equals(naObject.name)
				&&dateOfBirth.equals(naObject.dateOfBirth));
	}
	
	public void setName(Name nameIn)
	{
		name = nameIn;
	}
	
	public Name getName()
	{
		return name;
	}
	
	public void setDateOfBirth( Date dateOfBirthIn)
	{
		dateOfBirth = dateOfBirthIn;
	}
	
	public Date getDateOfBirth()
	{
		return dateOfBirth;
	}

}

