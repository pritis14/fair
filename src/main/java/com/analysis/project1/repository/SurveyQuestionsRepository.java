package com.analysis.project1.repository;

import java.util.List;

import com.analysis.project1.model.MyKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.analysis.project1.model.SurveyQuestionsEntity;

@Repository
public interface SurveyQuestionsRepository 
extends JpaRepository<SurveyQuestionsEntity, Integer>{
    SurveyQuestionsEntity findBySurveyIdAndQuesType(Integer surveyId, String quesType);
	//List<SurveyQuestionsEntity> findAllBySurveyId(Integer SurveyId);
//	List<SurveyQuestionsEntity> findByQuesId(Integer QuesId);
}
