package com.quiz.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.entities.Quiz;
import com.quiz.service.QuizService;

@RestController
@RequestMapping("/quiz")
public class QuizController {
	private QuizService service;

	public QuizController(QuizService service) {
		this.service = service;
	}
	
	@PostMapping
	public Quiz create(@RequestBody Quiz quiz) {
		return service.add(quiz);
	}
	@GetMapping
	public List<Quiz> getAll(){
		service.getAll().stream().forEach(i -> System.out.println(i.toString()));
		return service.getAll();
	}
	@GetMapping("/{id}")
	public Quiz getQuiz(@PathVariable Long id){
		return service.get(id);
	}
	

}
