package ie.Lyit.flight;

public class Name {
	
	private String title;
	private String firstName;
	private String surname;
	
	public Name()
	{
		title = "";
		firstName = "";
		surname = "";
	}
	
	public Name (String t, String fN, String sN)
	{
		title = t;
		firstName = fN;
		surname = sN;
	}
	
	@Override
	public String toString()
	{
		return(title+"\t"+firstName+","+surname);
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Name naObject;
		if (obj instanceof Name)
			naObject = (Name)obj;
				
			else
				return false;
		
		return (this.title.equals(naObject.title)
				&&this.firstName.equals(naObject.firstName)
				&&this.surname.equals(naObject.surname));
	}
	
	public void setTitle(String setTitleTo)
	{
		title = setTitleTo;
	}
	public String getTitle()
	{
		return title;
	}
	
	public void setFirstName( String setFirstNameTo)
	{
		firstName = setFirstNameTo;
	}
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setSurname ( String setSurnameTo)
	{
		surname = setSurnameTo;
	}
	public String getSurname()
	{
		return surname;
	}
	
	
	public boolean isFemale()
	{
		if(title.contains("Miss") || title.contains("Mrs") || title.contains("Ms"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
