package profit;
import java.util.ArrayList;
import java.util.Scanner;
public class ProfitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Organization comp = new Organization();
		ArrayList<Employee> emp = new ArrayList<Employee>();
		Scanner in = new Scanner(System.in);
		System.out.print("\nPlease Enter your company's name :");
		String cname = in.next();
		comp.setOrganizationName(cname);
		char c='y';
		while(c=='y') {
			displayMenu();
			int choice = in.nextInt();
			if(choice==1) {
				System.out.print("\nOld name: "+comp.getOrganizationName()+"\nNew name of this company : ");
				cname = in.next();
				comp.setOrganizationName(cname);
			}
			else if(choice==2) {
				System.out.print("\nHow many of employee:");
				int num  = in.nextInt();
				for(int i=0;i<num;i++) {
					System.out.print("\nEnter name of employee "+(i+1)+" : ");
					String name = in.next();
					System.out.print("\nEnter ID of employee "+(i+1)+" : ");
					String id = in.next();
					System.out.print("\nEnter Salary of employee "+(i+1)+" : ");
					double salary = in.nextDouble();
					emp.add(new Employee(name,id,salary));
				}
				comp.setEmp(emp);
				System.out.print("\n---Finish!---\n");
			}
			else if(choice==3) {
				System.out.print("\nEnter id : ");
				String id = in.next();
				System.out.print("\nEnter sell : ");
				double sell = in.nextDouble();
				System.out.println(comp.addSalary(id, sell)+"\n");
			}
			else if(choice==4) {
				System.out.print(comp.getEmp());
			}
			else {
				c='n';
				System.out.println("---End---");
			}
		}
	}
	
	public static void displayMenu() {
		System.out.print("\n[1]Rename Company's name\n[2]Add employees\n[3]Add sell of this month\n[4]Display Employees of this company\n[5]End this program\nYour choice==>");
	}
	
	
}
