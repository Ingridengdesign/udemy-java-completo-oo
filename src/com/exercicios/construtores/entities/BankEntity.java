package com.exercicios.construtores.entities;

public class BankEntity {
	
	private int account;
	private String name;
	private double balance;
	
	public BankEntity(int account, String name) {
		this.account = account;
		this.name = name;
	}
	
	public BankEntity(int account, String name, double firstDeposit) {
		this.account = account;
		this.name = name;
		deposit(firstDeposit);
	}

	public int getAccount() {
		return account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double deposit) {
		balance+= deposit;
	}
	
	public void withdraw(double withdraw) {
		balance-= withdraw + 5;
	}
	
	public String toString() {
		return "Account "
				+ account
				+ ", Holder: "
				+ name
				+ ", Balance: $ "
				+ String.format("%.2f", balance );
				
	}

}
