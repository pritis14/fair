package com.analysis.project1.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.analysis.project1.repository.SurveyQuestions1Repository;
import com.analysis.project1.exception.RecordNotFoundException;
import com.analysis.project1.model.SurveyQuestions1Entity;

@Service
public class SurveyQuestions1Service {

    @Autowired
    SurveyQuestions1Repository repository;

    public List<SurveyQuestions1Entity> getAllSurveyQuestions(){
        List<SurveyQuestions1Entity> surveyQuesList=repository.findAll();
        if(surveyQuesList.size()>0)
            return surveyQuesList;
        else
            return new ArrayList<SurveyQuestions1Entity>();

    }

    public SurveyQuestions1Entity getBySurveyIdAndQuesType(Integer surveyId, String quesType){
        SurveyQuestions1Entity surveyQuest=repository.findBySurveyIdAndQuesType(surveyId,quesType);
        return surveyQuest;

    }



}
