package com.analysis.project1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.analysis.project1.model.SurveyQuestions1Entity;

public interface SurveyQuestions1Repository extends JpaRepository<SurveyQuestions1Entity, Integer>{
    SurveyQuestions1Entity findBySurveyIdAndQuesType(Integer surveyId, String quesType);
}
