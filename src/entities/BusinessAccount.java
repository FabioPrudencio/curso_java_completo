package entities;

public final class BusinessAccount extends Account { //final evita que essa classe seja estendida e melhora a performance
	
	private Double loanLimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance); //executa o construtor da super classe
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan (double amount) {
		if (amount <= loanLimit) {
			balance += (amount - 10);
		}
	}
	
	@Override
	public final void withdraw(double amount) { // final evita sobreposi��o desse m�todo (Override)
		super.withdraw(amount); // chama primeiro o m�todo withdraw da super classe e depois adiciona mais uma l�gica		
		balance -= 2.0;
	}	
	
}
