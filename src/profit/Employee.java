package profit;

public class Employee {
	public String name;
	public String emp_id;
	public Employee(String name, String emp_id) {
		super();
		this.name = name;
		this.emp_id = emp_id;
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
		return "Employee [name=" + name + ", emp_id=" + emp_id + "]";
	}
	
}
