package model.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public void processContract(Contract contract, Integer months, OnlinePaymentService paymentService) throws ParseException {		
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(contract.getDate());
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int month = cal.get(Calendar.MONTH) + 1;
		int year = cal.get(Calendar.YEAR);		
		
		for (int i = 1; i <= months; i++) {
			Installment installment = new Installment();
			installment.setAmount(paymentService.interest(contract.getTotalValue() / months, i));
			
			if ((month + i) > 12) {
				year += 1; 
			}
			
			String strDate = String.format("%d/%d/%d", day, month + i, year);
			Date date = sdf.parse(strDate);
			installment.setDueDate(date);
			
			contract.addInstallments(installment);
		}
		
	}

}
