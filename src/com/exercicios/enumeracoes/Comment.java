package com.exercicios.enumeracoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.exercicios.enumeracoes.entites.CommentEntity;
import com.exercicios.enumeracoes.entites.Post;

public class Comment {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		CommentEntity c1 = new CommentEntity("Have a nice trip!");
		CommentEntity c2 = new CommentEntity("Wow that's awesome!");
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand", "I'm going to visit this wonderful country!", 12);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);
		
	}

}
