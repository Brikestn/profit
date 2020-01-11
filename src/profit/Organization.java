package profit;
import java.util.ArrayList;
public class Organization {
	public String organizationName=null;
	public ArrayList<Employee> emp;
	public Organization() {
		emp = new ArrayList<Employee>();
	}
	public Organization(String name,ArrayList<Employee> emp) {
		organizationName = name;
		this.emp = emp;
	}
	public String addSalary(String emp_id,double sell) {
		for(int i=0;i<emp.size();i++) {
			if((emp.get(i).getEmp_id().equals(emp_id))){
				emp.get(i).salary.setCompensation(sell);
				return "Calculate complete!";
			}	
		}
		return "Can not find this employee!";
			
			
	}
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	public String getEmp() {
		String s ="";
		System.out.println("This company name's "+organizationName);
		for(int i=0;i<emp.size();i++) {
			s+="\n"+emp.get(i).toString();
		}
		return s;
	}
	public void setEmp(ArrayList<Employee> emp) {
		this.emp = emp;
	}
	
}
