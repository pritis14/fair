package com.analysis.project1.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.analysis.project1.repository.SurveyQuestions2Repository;
import com.analysis.project1.exception.RecordNotFoundException;
import com.analysis.project1.model.SurveyQuestions2Entity;

@Service
public class SurveyQuestions2Service {

    @Autowired
    SurveyQuestions2Repository repository;

    public List<SurveyQuestions2Entity> getAllSurveyQuestions(){
        List<SurveyQuestions2Entity> surveyQuesList=repository.findAll();
        if(surveyQuesList.size()>0)
            return surveyQuesList;
        else
            return new ArrayList<SurveyQuestions2Entity>();

    }

    public SurveyQuestions2Entity getBySurveyIdAndQuesType(Integer surveyId, String quesType){
        SurveyQuestions2Entity surveyQuest=repository.findBySurveyIdAndQuesType(surveyId,quesType);
        return surveyQuest;

    }



}
