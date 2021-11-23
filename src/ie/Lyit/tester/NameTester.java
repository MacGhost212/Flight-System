package ie.Lyit.tester;
import ie.Lyit.flight.*;
import java.util.*;

public class NameTester {
	
	public static void main(String[] args)
	{
		Name person1 = new Name("Mr", "Bob", "Marsh");
		Name person2 = new Name("Mrs", "Betty", "MadTing");
		
		ArrayList<Name> personList = new ArrayList<Name>();
		
		personList.add(person2);
		personList.add(person1);
		
		personList.add(new Name ("Mr", "Rathew", "Gram"));
		personList.add(new Name ("Mr", "William", "Solar"));
		personList.add(new Name ("Ms", "Mara", "Sov"));
		
		for(Name person : personList) 
		{
			System.out.println(person.toString());
			System.out.println(person.isFemale());
		}	
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			
		}
		
		public static boolean nameSearch(Name nameSearch, ArrayList<Name> personList)
		{
			return personList.contains(nameSearch);
		}
	

}
