package exercises;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.OnlinePaymentService;
import model.services.PaypalService;

public class AppContractInterfaces {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter contract data");
		System.out.print("Number: ");		
		int number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): "); 
		Date date = sdf.parse(sc.next());
		System.out.print("Contract value: "); 
		double value = sc.nextDouble();
		System.out.print("Enter number of installments: "); 
		int months = sc.nextInt();

		Contract contract = new Contract(number, date, value);
		//Contract contract = new Contract(8028, sdf.parse("25/06/2018"), 600.0);

		ContractService contractService = new ContractService(new PaypalService());
		contractService.processContract(contract, months);

		System.out.println();
		System.out.println("Installments:");
		for (Installment i : contract.getInstallments()) {
			System.out.println(sdf.format(i.getDueDate()) + " - " + String.format("%.2f", i.getAmount()));
		}
		
		sc.close();
	}

}
