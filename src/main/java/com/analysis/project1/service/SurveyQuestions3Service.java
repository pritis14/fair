package com.analysis.project1.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.analysis.project1.repository.SurveyQuestions3Repository;
import com.analysis.project1.exception.RecordNotFoundException;
import com.analysis.project1.model.SurveyQuestions3Entity;

@Service
public class SurveyQuestions3Service {

    @Autowired
    SurveyQuestions3Repository repository;

    public List<SurveyQuestions3Entity> getAllSurveyQuestions(){
        List<SurveyQuestions3Entity> surveyQuesList=repository.findAll();
        if(surveyQuesList.size()>0)
            return surveyQuesList;
        else
            return new ArrayList<SurveyQuestions3Entity>();

    }

    public SurveyQuestions3Entity getBySurveyIdAndQuesType(Integer surveyId, String quesType){
        SurveyQuestions3Entity surveyQuest=repository.findBySurveyIdAndQuesType(surveyId,quesType);
        return surveyQuest;

    }



}
