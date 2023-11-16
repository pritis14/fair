package com.analysis.project1.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
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


	
//	@GetMapping("/bySurveyAndQuestionId/{surveyid}/{quesType}")
//	 public ResponseEntity<SurveyQuestionsEntity> getSurveyQuestionById(@PathVariable(surveyid) Integer surveyId,String quesType)
//	                                              throws RecordNotFoundException {

	@RequestMapping(path="/bySurveyAndQuestionType/{surveyid}/{quesType}", method= RequestMethod.GET)
//public String welcomepage(@PathVariable String name){
	public ResponseEntity<SurveyQuestionsEntity> getSurveyQuestionById(@PathVariable("surveyid") int surveyId,@PathVariable String quesType)
	                                              throws RecordNotFoundException {
		SurveyQuestionsEntity list = service.getBySurveyIdAndQuesType(surveyId,quesType);
		return new ResponseEntity<SurveyQuestionsEntity>(list, new HttpHeaders(), HttpStatus.OK);
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
