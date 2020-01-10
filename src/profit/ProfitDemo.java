package profit;
import java.util.ArrayList;
public class ProfitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Organization lotus;
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee("Susan","1000",25000));
		emp.add(new Employee("Nathan","1001",15000));
		emp.add(new Employee("Mery","1002",45000));
		emp.add(new Employee("Anna","1003",55000));
		emp.add(new Employee("Ben","1004",5000));
		lotus = new Organization("Tesco Lotus", emp);
		System.out.println(lotus.getEmp());
		lotus.addSalary("1001", 25000);
		System.out.println(emp.get(1).getName()+emp.get(1).getSalary());
	}

}
