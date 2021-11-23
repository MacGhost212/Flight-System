package ie.Lyit.tester;

import java.util.ArrayList;
import ie.Lyit.flight.*;

public class EmployeeTester 
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee();

		System.out.println(e1);

		e1.setName(new Name("Mr","Omri","Bandit"));
		e1.setStartDate(new Date(12,10,2020));
		e1.setSalary(36000.00);

		System.out.println(e1);

	    Name name = new Name("Mrs","Shala","Dune");
	    Employee e2 = new Employee(name,new Date(12,7,2000),new Date(12,10,2020), 24000.00);
	    
		System.out.println(e2);
		
		if(e1.equals(e2))
			System.out.println(e1.getName() + " is the same employee as " + e2.getName());
		else
			System.out.println(e1.getName() + " is NOT the same employee as " + e2.getName()+".");
		
		if(e1.equals(e1))
			System.out.println(e1.getName() + " is the same employee as " + e1.getName());
		else
			System.out.println(e1.getName() + " is NOT the same employee as " + e1.getName()+".");

		if(e1.getName().isFemale())
			System.out.println(e1.getName() + " is FEMALE.");
		else
			System.out.println(e1.getName() + " is MALE.");
		
		if(e2.getName().isFemale())
			System.out.println(e2.getName() + " is FEMALE.");
		else
			System.out.println(e2.getName() + " is MALE.");

		System.out.println(e1.getName() + "s take home pay is €" + e1.calculatePay(10));
		System.out.println(e2.getName() + "s take home pay is €" + e2.calculatePay(10));
		
		e1.incrementSalary(5000);
		e2.incrementSalary(5000.00);
		
		System.out.println(e1);
		System.out.println(e2);
		
		ArrayList<Person> personsOnPlane = new ArrayList<Person>();
		personsOnPlane.add(e1);
		personsOnPlane.add(e2);
			
		
		for(Person tmpP : personsOnPlane)
			System.out.println(tmpP);
		
		if(personSearch(e2, personsOnPlane))
			System.out.println("FOUND!");
		else
			System.out.println("NOT FOUND!");
		
		if(personSearch(e1, personsOnPlane))
			System.out.println("FOUND!");
		else
			System.out.println("NOT FOUND!");
	}

	public static boolean personSearch(Person personSearch, ArrayList<Person> listOfPersons)
	{
		return listOfPersons.contains(personSearch);
	}
}

