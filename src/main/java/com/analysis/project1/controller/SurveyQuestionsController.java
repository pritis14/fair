package com.analysis.project1.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.analysis.project1.exception.RecordNotFoundException;
import com.analysis.project1.model.SurveyQuestionsEntity;

import com.analysis.project1.service.SurveyQuestionsService;

@RestController
public class SurveyQuestionsController {

	@Autowired
	SurveyQuestionsService service;

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@GetMapping("/SurveyQuestions/all")
	public ResponseEntity<List<SurveyQuestionsEntity>> getAllSurveyQuestions() {
		List<SurveyQuestionsEntity> list = service.getAllSurveyQuestions();

		return new ResponseEntity<List<SurveyQuestionsEntity>>(list, new HttpHeaders(), HttpStatus.OK);
	}
	
	@GetMapping("/bySurveyAndQuestionId")
	 public ResponseEntity<List<SurveyQuestionsEntity>> getSurveyQuestionById(@RequestParam Integer surveyId)
	                                              throws RecordNotFoundException {
		List<SurveyQuestionsEntity> list = service.getSurveyQuestionById(surveyId);
		return new ResponseEntity<List<SurveyQuestionsEntity>>(list, new HttpHeaders(), HttpStatus.OK);
		
		
	}

	/*
	 * @GetMapping("/bySurveyAndQuestionId") public
	 * ResponseEntity<List<SurveyQuestionsEntity>>
	 * getSurveyQuestionById(@RequestParam Integer surveyId, @RequestParam Integer
	 * quesId) throws RecordNotFoundException { List<SurveyQuestionsEntity> list =
	 * service.getSurveyQuestionById(surveyId,quesId); return new
	 * ResponseEntity<List<SurveyQuestionsEntity>>(list, new HttpHeaders(),
	 * HttpStatus.OK);
	 * 
	 * 
	 * }
	 */

}
