package com.exercicios.heranca;

import com.exercicios.heranca.entities.AccountEntity;
import com.exercicios.heranca.entities.BussinessAccountEntity;
import com.exercicios.heranca.entities.SavingsAccountEntity;

public class Bank2 {

	public static void main(String[] args) {

		AccountEntity acc1 = new AccountEntity(1001, "Alex", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		AccountEntity acc2 = new SavingsAccountEntity(1002, "Maria", 1000.0, 0.01);
		acc2.withdraw(200);
		System.out.println(acc2.getBalance());
		
		AccountEntity acc3 = new BussinessAccountEntity(1003, "Bob", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
		
	}

}
