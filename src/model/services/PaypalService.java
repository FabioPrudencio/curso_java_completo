package model.services;

public class PaypalService implements OnlinePaymentService {

	public Double paymentFee(Double amount) {
		return amount * 0.02;
	}

	public Double interest(Double amount, Integer months) {
		Double simlpleInterest = amount * (months / 100.0);
		Double paymentFee = paymentFee(amount + simlpleInterest);
		
		return amount + paymentFee + simlpleInterest;
	}

}
