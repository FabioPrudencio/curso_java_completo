package exercises;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import model.entities.Student;

public class AppHashSetStudents {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		
		Set<Student> set = new HashSet<>();
		
		for (int i = 1; i <= n; i++) {
			Integer id = sc.nextInt();
			set.add(new Student(id));			
		}
		
		System.out.print("How many students for course B? ");
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			Integer id = sc.nextInt();
			set.add(new Student(id));			
		}
		
		System.out.print("How many students for course C? ");
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			Integer id = sc.nextInt();
			set.add(new Student(id));			
		}
		
		System.out.println("Total students: " + set.size());
		
		sc.close();

	}

}
