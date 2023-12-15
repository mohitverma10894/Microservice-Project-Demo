package com.question.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.question.entity.Question;
import com.question.repository.QuestionRepository;
@Service
public class QuestionServiceImpl implements QuestionService {

	
	private QuestionRepository repo;
	
	
	public QuestionServiceImpl(QuestionRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public Question add(Question qus) {
		return repo.save(qus);
	}

	@Override
	public Question getQuestion(Long id) {

		return repo.findById(id).orElseThrow(() -> new RuntimeException("Question Not Found"));
	}

	@Override
	public List<Question> getAll() {
		return repo.findAll();
	}

	@Override
	public List<Question> getQuestionsOfQuiz(Long id) {
		repo.findByQuizId(id).stream().forEach(i -> System.out.println(i));
		return repo.findByQuizId(id);
	}

}
