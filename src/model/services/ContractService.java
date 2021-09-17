package model.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	
	private OnlinePaymentService onlinePaymentService;
	
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, Integer months) throws ParseException {		
		
		for (int i = 1; i <= months; i++) {
			Installment installment = new Installment();
			installment.setAmount(onlinePaymentService.interest(contract.getTotalValue() / months, i));			
			installment.setDueDate(addMonths(contract.getDate(), i));
			
			contract.getInstallments().add(installment);
		}		
	}
	
	private Date addMonths(Date date, int months) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, months);
		return calendar.getTime();
	}

}
