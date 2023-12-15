package com.question.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.question.entity.Question;

public interface QuestionService {
	
	Question add(Question qus);
	Question getQuestion(Long id);
	List<Question> getAll();
	List<Question> getQuestionsOfQuiz(Long id);
}
