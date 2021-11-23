package ie.Lyit.flight;

public interface Payable
{
    public final double MAX_SALARY = 150000.00;	
	
    public abstract double calculatePay(double taxPercentage);
    
	double incrementSalary(double incrementAmount);
}


