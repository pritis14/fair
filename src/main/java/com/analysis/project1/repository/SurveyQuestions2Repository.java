package com.analysis.project1.repository;

import com.analysis.project1.model.SurveyQuestions2Entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurveyQuestions2Repository extends JpaRepository<SurveyQuestions2Entity, Integer>{
    SurveyQuestions2Entity findBySurveyIdAndQuesType(Integer surveyId, String quesType);
}
