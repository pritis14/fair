package com.analysis.project1.repository;

import com.analysis.project1.model.SurveyQuestions3Entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurveyQuestions3Repository extends JpaRepository<SurveyQuestions3Entity, Integer> {
    SurveyQuestions3Entity findBySurveyIdAndQuesType(Integer surveyId, String quesType);
}