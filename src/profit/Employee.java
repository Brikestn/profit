package profit;
import java.util.ArrayList;
public class Employee {
	public String name;
	public String emp_id;
	public Salary salary = new Salary();
	public Employee(String name, String emp_id, double salary) {
		super();
		this.name = name;
		this.emp_id = emp_id;
		this.salary.setSalary(salary);
	}	
	public Salary getSalary() {
		return salary;
	}
	public void setSalary(Salary salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}
	@Override
	public String toString() {
		return "Employee name=" + name + ", emp_id=" + emp_id + ", "+salary.toString();
	}
	
}