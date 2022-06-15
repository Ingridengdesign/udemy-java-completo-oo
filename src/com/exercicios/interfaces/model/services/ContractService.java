package com.exercicios.interfaces.model.services;

import java.util.Calendar;
import java.util.Date;

import com.exercicios.interfaces.model.entites.ContractEntity;
import com.exercicios.interfaces.model.entites.InstallmentEntity;

public class ContractService {
	
	private OnlinePaymentService onlinePaymentService;
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(ContractEntity contract, int months) {
		double basicQuota = contract.getTotalValue()/ months;
		for(int i = 1; i<= months; i++) {
			double updateQuota = basicQuota + onlinePaymentService.interest(basicQuota, i);
			double fullQuota = updateQuota + onlinePaymentService.paymentFee(updateQuota);
			Date dueDate = addMonths(contract.getDate(), i);
			contract.getInstallments().add(new InstallmentEntity(dueDate, fullQuota));
		}
	}
	public Date addMonths(Date date, int N) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, N);
		return calendar.getTime();
	}
}
