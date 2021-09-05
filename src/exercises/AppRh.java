package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class AppRh {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		List<Employee> list = new ArrayList<Employee>();
		for (int i=0; i < n; i++) {
			System.out.println();
			System.out.println("Emplyoee #"+(i+1)+":");
			int id = 0;
			Employee empId = new Employee();
			do {
				System.out.print("Id: ");
				int newId = sc.nextInt();
				sc.nextLine();				
				empId = list.stream().filter(x -> x.getId() == newId).findFirst().orElse(null);
				if (empId != null) {
					System.out.println("The id is not available, please type an another id.");
				}
				id = newId;
			} while (empId != null);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			list.add(emp);
		}
		
		System.out.println();
		
		System.out.print("Enter the employee id that will have salary increase : ");
		int id = sc.nextInt();
		Employee employee = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (employee == null) {
			System.out.println("This id does not exist!");
		} else {		
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			employee.increaseSalary(percent);
		}
		
		System.out.println();		
		System.out.println("List of employees:");
		for(Employee employ : list) {
			System.out.print(employ.toString());
		}
		
		sc.close();
	}
	
	public static Integer position(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}		
		return null;
	}

}
