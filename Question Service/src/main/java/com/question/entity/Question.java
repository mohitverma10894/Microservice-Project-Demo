package com.question.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String question;
	private long quizId;
	public Question(long id, String question, long quizId) {
		super();
		this.id = id;
		this.question = question;
		this.quizId = quizId;
	}
	public long getId() {
		return id;
	}
	public Question() {
		super();
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public long getQuizId() {
		return quizId;
	}
	public void setQuizId(long quizId) {
		this.quizId = quizId;
	}
	@Override
	public String toString() {
		return "Question [id=" + id + ", question=" + question + ", quizId=" + quizId + "]";
	}
	
	
	
}
