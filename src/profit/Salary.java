package profit;
import java.util.ArrayList;
public class Salary {
	public double salary=0;
	public double compensation=0;
	public Salary() {
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
		this.compensation = this.salary;
	}
	public double getCompensation() {
		return compensation;
	}
	public void setCompensation(double sell) {
		double commission = 0;
		if((sell>=1)&&(sell<=25000))
			commission = sell*(1.0/100);
		else if((sell>25000)&&(sell<=50000))
			commission = sell*(2.0/100);
		else
			commission = sell*(3.0/100);
		compensation += commission;
		
	}
	@Override
	public String toString() {
		return " Salary= " + salary + ", Compensation = " + compensation;
	}
	
}