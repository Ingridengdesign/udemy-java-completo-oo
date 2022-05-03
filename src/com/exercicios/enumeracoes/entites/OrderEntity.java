package com.exercicios.enumeracoes.entites;

import java.util.Date;

import com.exercicios.enumeracoes.entites.enums.OrderStatus;

public class OrderEntity {
	
	private Integer id;
	private Date moment;
	private OrderStatus status;
	
	public OrderEntity() {
		
	}

	public OrderEntity(Integer id, Date moment, OrderStatus status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "OrderEntity [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}
	
	
	

}
