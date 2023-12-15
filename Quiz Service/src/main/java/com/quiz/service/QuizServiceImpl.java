package com.quiz.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.entities.Quiz;
import com.quiz.repository.QuizRepository;

@Service
public class QuizServiceImpl implements QuizService{

	private QuizRepository repo;
	@Autowired
	private QuestionClient client;
	
	public QuizServiceImpl(QuizRepository repo) {
		this.repo = repo;
	}

	@Override
	public Quiz add(Quiz quiz) {
		System.out.println("-----Save ");
		return repo.save(quiz);
	}

	@Override
	public Quiz get(Long id) {
		System.out.println("-----Get By ID ");
		Quiz quiz= repo.findById(id).orElseThrow(() ->  new RuntimeException("Quiz not found"));
		  quiz.setQuestions(client.getQuestionsOfQuiz(quiz.getId()));
		return quiz; 
	}

	@Override
	public List<Quiz> getAll() {
		System.out.println("-----Get All ");
		List<Quiz> quizList = repo.findAll();
		 List<Quiz> newQuizList = quizList.stream().map(quiz -> {
			 quiz.setQuestions(client.getQuestionsOfQuiz(quiz.getId()));
			 return quiz;
			 
		 }).collect(Collectors.toList());
		return newQuizList;
	}

}
