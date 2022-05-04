package com.exercicios.heranca.entities;

public final class SavingsAccountEntity  extends AccountEntity{
	
	private Double interestRate;
	
	public SavingsAccountEntity() {
		super();
	}

	public SavingsAccountEntity(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}

}
