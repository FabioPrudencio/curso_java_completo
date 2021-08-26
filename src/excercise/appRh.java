package excercise;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class appRh {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);		
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		var listEmploy = new ArrayList<Employee>();
		for (int i=0; i < n; i++) {
			System.out.println();
			System.out.println("Emplyoee #"+(i+1)+":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			Employee employ = new Employee(id, name, salary);
			listEmploy.add(employ);
		}
		
		System.out.println();
		
		System.out.print("Enter the employee id that will have salary increase : ");
		int id = sc.nextInt();
		Employee employee = listEmploy.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (employee == null) {
			System.out.println("This id does not exist!");
		} else {		
			System.out.print("Enter the percentage: ");
			double perc = sc.nextDouble();
			employee.increaseSalary(perc);
		}
		
		System.out.println();		
		System.out.println("List of employees:");
		for(Employee employ : listEmploy) {
			System.out.print(employ.toString());
		}
		
		sc.close();
	}

}
