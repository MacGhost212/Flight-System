package ie.Lyit.flight;

public class Employee extends Person implements Payable
{
	private Date startDate;		// start date
	private double salary;		// Salary
	private int number;			// Number
    
	private static int nextNumber=10000;
 
	
	public Employee() 
	{
		super();
		startDate = new Date();
		salary = 0.0;
		number = nextNumber++;
	}

	public Employee(Name nameIn, Date dateIn, Date startDate, double salary) 
	{

		super(nameIn, dateIn);
		this.startDate = startDate;
		this.salary = salary;
		this.number = nextNumber++;		
	}
	
	@Override
	public String toString() 
	{
		return number + " " + super.toString() + "\t€" + salary;
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		Employee eObj;
		if(obj instanceof Employee)
			eObj = (Employee)obj;
		else 
		   return false;
		
		return (this.number==eObj.number);
	}
	

	public void setStartDate(Date startDate)
	{
		this.startDate=startDate;
	}
	public Date getStartDate()
	{
		return startDate;
	}	
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public double getSalary()
	{
		return salary;
	}

	public int getNumber()
	{
		return number;
	}			
	
	@Override
	public double calculatePay(double taxPercentage) 
	{
		double pay=salary/12;
		pay -= (pay * (taxPercentage/100));
		return pay;
	}

	@Override
	public double incrementSalary(double incrementAmount) 
	{
		salary += incrementAmount;
			
		if(salary > MAX_SALARY)
			salary = MAX_SALARY;
			
		return salary;
	}

}
