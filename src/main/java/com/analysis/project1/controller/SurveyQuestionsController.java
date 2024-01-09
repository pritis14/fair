package com.analysis.project1.controller;

import java.util.List;

import com.analysis.project1.model.*;
import com.analysis.project1.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;

import com.analysis.project1.exception.RecordNotFoundException;

import com.analysis.project1.repository.SurveyReportRepository;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin(maxAge = 99999)
public class SurveyQuestionsController {
	private static final Logger logger = LoggerFactory.getLogger(SurveyQuestionsController.class);

	@Autowired
	SurveyQuestionsService service;
	SurveyQuestions1Service service1;
	SurveyQuestions2Service service2;
	SurveyQuestions3Service service3;



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

	@RequestMapping(path="/bySurvey1AndQuestionType/{surveyid}/{quesType}", method= RequestMethod.GET)
	public ResponseEntity<SurveyQuestions1Entity> getSurvey1QuestionById(@PathVariable("surveyid") int surveyId, @PathVariable String quesType)
			throws RecordNotFoundException {
		SurveyQuestions1Entity list = service1.getBySurveyIdAndQuesType(surveyId,quesType);
		if (list==null)
		{
			return new ResponseEntity<SurveyQuestions1Entity>(null, new HttpHeaders(), HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<SurveyQuestions1Entity>(list, new HttpHeaders(), HttpStatus.OK);
	}

	@RequestMapping(path="/bySurvey2AndQuestionType/bySurvey2AndQuestionType/{surveyid}/{quesType}", method= RequestMethod.GET)
	public ResponseEntity<SurveyQuestions2Entity> getSurvey2QuestionById(@PathVariable("surveyid") int surveyId, @PathVariable String quesType)
			throws RecordNotFoundException {
		SurveyQuestions2Entity list = service2.getBySurveyIdAndQuesType(surveyId,quesType);
		if (list==null)
		{
			return new ResponseEntity<SurveyQuestions2Entity>(null, new HttpHeaders(), HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<SurveyQuestions2Entity>(list, new HttpHeaders(), HttpStatus.OK);
	}

	@RequestMapping(path="/bySurvey3AndQuestionType/{surveyid}/{quesType}", method= RequestMethod.GET)
	public ResponseEntity<SurveyQuestions3Entity> getSurvey3QuestionById(@PathVariable("surveyid") int surveyId, @PathVariable String quesType)
			throws RecordNotFoundException {
		SurveyQuestions3Entity list = service3.getBySurveyIdAndQuesType(surveyId,quesType);
		if (list==null)
		{
			return new ResponseEntity<SurveyQuestions3Entity>(null, new HttpHeaders(), HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<SurveyQuestions3Entity>(list, new HttpHeaders(), HttpStatus.OK);
	}
	@Autowired
	SurveyReportService reportSevice;
	@PostMapping("/saveReport/all")
	public ResponseEntity<SurveyReportEntity> createReport(@RequestBody SurveyReportEntity data) {
		SurveyReportEntity list  = reportSevice.saveReport(data);
		return new ResponseEntity<SurveyReportEntity>(list, new HttpHeaders(), HttpStatus.OK);
	}

	@PostMapping(value = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity uploadFile(@RequestParam MultipartFile[] files) {
		for (int i = 0; i < files.length; i++) {
			logger.info(String.format("File name '%s' uploaded successfully.", files[i].getOriginalFilename()));
		}
		return ResponseEntity.ok().build();
	}

}
