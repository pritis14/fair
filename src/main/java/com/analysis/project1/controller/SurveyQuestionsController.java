package com.analysis.project1.controller;

import java.util.List;

import com.analysis.project1.model.SurveyReportEntity;
import com.analysis.project1.service.SurveyReportService;
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
import com.analysis.project1.repository.SurveyReportRepository;

@RestController
@CrossOrigin(maxAge = 99999)
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

	@RequestMapping(path="/bySurveyAndQuestionType/{surveyid}/{quesType}", method= RequestMethod.GET)
	public ResponseEntity<SurveyQuestionsEntity> getSurveyQuestionById(@PathVariable("surveyid") int surveyId,@PathVariable String quesType)
	                                              throws RecordNotFoundException {
		SurveyQuestionsEntity list = service.getBySurveyIdAndQuesType(surveyId,quesType);
		if (list==null)
		{
			return new ResponseEntity<SurveyQuestionsEntity>(null, new HttpHeaders(), HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<SurveyQuestionsEntity>(list, new HttpHeaders(), HttpStatus.OK);
	}
	@Autowired
	SurveyReportService reportSevice;
	@PostMapping("/saveReport/all")
	public ResponseEntity<SurveyReportEntity> createComment(@RequestBody SurveyReportEntity data) {
		SurveyReportEntity list  = reportSevice.saveReport(data);
		return new ResponseEntity<SurveyReportEntity>(list, new HttpHeaders(), HttpStatus.OK);
	}

}
