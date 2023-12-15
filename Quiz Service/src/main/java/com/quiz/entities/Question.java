package com.quiz.entities;

public class Question {

	
	private long questionId;
	private long quizId;
	private String question;
	public Question(long questionId, long quizId, String question) {
		super();
		this.questionId = questionId;
		this.quizId = quizId;
		this.question = question;
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getQuestionId() {
		return questionId;
	}
	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}
	public long getQuizId() {
		return quizId;
	}
	public void setQuizId(long quizId) {
		this.quizId = quizId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	
	
	
}
