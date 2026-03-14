package upgradeproject;

import java.util.*;

public class Joblist {
	static ArrayList<Application> job = new ArrayList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println();
			displaymenu();
			int choice = sc.nextInt();
			sc.nextLine();
			
			
			switch (choice) {
			case 1:
				System.out.print("Enter Company Name: "); 
				String Company = sc.nextLine();
				System.out.print("Enter Role: ");
				String Role = sc.nextLine();
				System.out.print("Enter Location: ");
				String Location = sc.nextLine();
				System.out.print("Enter Salary: ");
				int Salary = sc.nextInt();
				sc.nextLine();
				addjobs(Company, Role,Location,Salary);
				System.out.println();
				break;
			
			case 2:
				viewjobs();
				System.out.println();
				break;
			case 3:
				System.out.println("Total count : "+countjobs()); 
				System.out.println();
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Input please check and retry again !!!");
				System.out.println();
			}
		}

	}

	public static void displaymenu() {
		System.out.println("------Job--Utility--System------");
		System.out.println("1.Add jobs");
		System.out.println("2.View jobs");
		System.out.println("3.Count jobs");
		System.out.println("4.Exit");
	}

	public static void addjobs(String Company, String Role,String Location,int Salary) {
		Application app = new Application(Company, Role, Location, Salary);
		job.add(app);
		System.out.println("Job Added Successfully!");
	}

	public static void viewjobs() {
		if(job.isEmpty()) {
			System.out.println("No jobs Available");
			return;
		}
		System.out.println("Available jobs");
		System.out.println();
		for (Application s : job) {
			System.out.println("company : "+s.getCompany());
			System.out.println("location : "+s.getLocation());
			System.out.println("role : "+s.getRole());
			System.out.println("salary : "+s.getSalary());
			System.out.println();
		}
	}

	public static int countjobs() {
		
		return job.size();
	}

}
class Application{
	private String company;
	private String Role;
	private String Location;
	private int salary;
	
	public Application(String company,String Role,String Location,int salary) {
		this.company = company;
		this.Role = Role;
		this.Location = Location;
		this.salary = salary;
	}
	
	public String getCompany() {
		return company;
	}
	public String getRole() {
		return Role;
	}
	public String getLocation() {
		return Location;
	}
	public int getSalary() {
		return salary;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setRole(String Role) {
		this.Role = Role;
	}
	public void setLocation(String Location) {
		this.Location = Location;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}