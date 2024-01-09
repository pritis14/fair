package com.analysis.project1.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.analysis.project1.repository.SurveyQuestionsRepository;
import com.analysis.project1.exception.RecordNotFoundException;
import com.analysis.project1.model.SurveyQuestionsEntity;

@Service
public class SurveyQuestionsService {
	
	@Autowired
	SurveyQuestionsRepository repository;
	
	public List<SurveyQuestionsEntity> getAllSurveyQuestions(){
		List<SurveyQuestionsEntity> surveyQuesList=repository.findAll();
		if(surveyQuesList.size()>0)
			return surveyQuesList;
		else
			return new ArrayList<SurveyQuestionsEntity>();
		
	}

	public SurveyQuestionsEntity getBySurveyIdAndQuesType(Integer surveyId, String quesType){
		SurveyQuestionsEntity surveyQuest=repository.findBySurveyIdAndQuesType(surveyId,quesType);
			return surveyQuest;

	}

	

}
