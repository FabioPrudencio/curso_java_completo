package exercises.predicates;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import model.entities.Employee;

public class AppStreamExercise2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		System.out.print("Enter full file path: ");
		Scanner sc = new Scanner(System.in);
		// String path = sc.nextLine();
		String path = "c:\\temp\\employees.txt";
		System.out.println(path);
		
		//double salary = sc.nextDouble();
		double salary = 2000.0;

		List<Employee> list = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();

			while (line != null) {

				String[] fields = line.split(",");
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();

			}
			
			System.out.println("Email of people whose salary is more than " + salary);
			List<String> emails = list.stream()
					.filter(x -> x.getSalary() > salary)
					.map(x -> x.getEmail())
					.sorted()
					.collect(Collectors.toList());
			
			emails.forEach(System.out::println);
			
			double sum = list.stream()
					.filter(x -> x.getName().charAt(0) == 'M')
					.map(x -> x.getSalary())
					.reduce(0.0, (x, y) -> x + y);
			System.out.println("Sum of salary of people whose name starts whith 'M': " + String.format("%.2f",sum));
			

		} catch (IOException e) {
			e.printStackTrace();
		}

		sc.close();
	}

}
