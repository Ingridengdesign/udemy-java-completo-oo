package com.exercicios.heranca;

import com.exercicios.heranca.entities.AccountEntity;
import com.exercicios.heranca.entities.BussinessAccountEntity;
import com.exercicios.heranca.entities.SavingsAccountEntity;

public class Bank {

	public static void main(String[] args) {
		
	AccountEntity acc = new AccountEntity(1001, "Alex", 0.0);
	BussinessAccountEntity bacc = new BussinessAccountEntity(1002, "Maria", 0.0, 500.0);
	
	/*
	 * Upcasting
	 * 
	 * Utilizar um objeto da subclasse e atribuir a uma variavel da superclasse
	 */
	AccountEntity acc1 = bacc;
	AccountEntity acc2 = new BussinessAccountEntity(1003, "Bob", 0.0, 200.0);
	AccountEntity acc3 = new SavingsAccountEntity(1004, "Anna", 0.0, 0.01);
	
	
	/*
	 * Downcasting
	 * 
	 * Para fazer o downcasting é importante testar se a instancia pode ser mesmo
	 * ser convertida
	 */
	BussinessAccountEntity acc4 = (BussinessAccountEntity)acc2;
	acc4.loan(100.0);
	
	if(acc3 instanceof BussinessAccountEntity) {
		BussinessAccountEntity acc5 = (BussinessAccountEntity)acc3;
		acc5.loan(200.0);
		System.out.println("Loan!");
	}
	
	if(acc3 instanceof SavingsAccountEntity) {
		SavingsAccountEntity acc5 = (SavingsAccountEntity)acc3;
		acc5.updateBalance();
		System.out.println("Update!");
	}
	
	}

}
