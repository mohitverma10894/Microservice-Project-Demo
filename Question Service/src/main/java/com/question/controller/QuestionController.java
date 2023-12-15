package com.question.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.question.entity.Question;
import com.question.service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {

	
	private QuestionService service;
	
	public QuestionController(QuestionService service) {
		this.service = service;
	}
	@GetMapping("/{id}")
	public Question getQuestion(@PathVariable Long id){
		System.out.println(id);
		return service.getQuestion(id);
	}
	@PostMapping
	public Question addQuestion (@RequestBody  Question qus) {
		
		return service.add(qus);
	}
	
	@GetMapping
	public List<Question> getQuestion(){
		service.getAll().stream().forEach(st -> System.out.println(st));
		return service.getAll();
	}
	
	@GetMapping("/quiz/{id}")
	public List<Question> getQuestionsOfQuiz(@PathVariable Long id){
		System.out.println("getQuestionsOfQuiz Callled");
		return service.getQuestionsOfQuiz(id);
	}
	
}
