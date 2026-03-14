package arraylist;

import java.util.*;

public class Joblist {
	static ArrayList<String> job = new ArrayList();

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
				addjobs(Company, Role);
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
		System.out.println("------Job--Utility--Sysem------");
		System.out.println("1.Add jobs");
		System.out.println("2.View jobs");
		System.out.println("3.Count jobs");
		System.out.println("4.Exit");
	}

	public static void addjobs(String Company, String Role) {
		job.add(Company + "-" + Role);
		System.out.println("Job Added Successfully!");
	}

	public static void viewjobs() {
		if(job.isEmpty()) {
			System.out.println("No jobs Available");
			return;
		}
		System.out.println("Available jobs");
		for (String s : job) {
			System.out.println(s);
		}
	}

	public static int countjobs() {
		
		return job.size();
	}

}
