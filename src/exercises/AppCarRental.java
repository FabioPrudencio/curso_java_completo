package exercises;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class AppCarRental {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm"); 
		
		System.out.println("Enter rental data");
		System.out.print("Car model: ");
		String model = sc.nextLine();
		
		
		

	}

}
