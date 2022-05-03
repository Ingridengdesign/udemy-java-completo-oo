package com.exercicios.enumeracoes.entites;

public class CommentEntity {
	
	private String text;
	
	public CommentEntity() {
		
	}
	public CommentEntity(String text) {
		this.text = text;
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	

}
