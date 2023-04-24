package model_test;

import java.util.Scanner;

import model.*;

public class EmployeeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of employees:: ");
		int n = sc.nextInt();
		Employee earr[] = new Employee[n];
		for(int i=0; i<n; i++) {
			System.out.println("1. Manager\n2. Salesman\n3. Clerk\nEnter your choice:: ");
			int ch = sc.nextInt();
			System.out.println("Give name:: ");
			sc.nextLine();  // Consume newline left-over
			String name = sc.nextLine();
			System.out.println("Give basic:: ");
			float basic = sc.nextFloat();
			switch(ch) {
				case 1: 
					System.out.println("Give car allowance:: ");
					float allow = sc.nextFloat();
					earr[i] = new Manager(name, basic, allow);
					break;
				case 2: 
					System.out.println("Give commission:: ");
					float comm = sc.nextFloat();
					earr[i] = new Salesman(name, basic, comm);
					break;
				case 3: 
					System.out.println("Give overtime:: ");
					float ot = sc.nextFloat();
					earr[i] = new Clerk(name, basic, ot);
					break;
				default:
					System.out.println("Invalid choice :(");
					System.exit(1);
			}
		}
		System.out.println("Your Employee details::");
		for(Employee e : earr) {
			System.out.println(e);
			System.out.printf("Salary => INR %.2f\n", e.computeSalary());
		}
	}

}
