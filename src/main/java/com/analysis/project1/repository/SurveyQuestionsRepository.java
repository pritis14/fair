package com.analysis.project1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.analysis.project1.model.SurveyQuestionsEntity;

@Repository
public interface SurveyQuestionsRepository 
extends JpaRepository<SurveyQuestionsEntity,Integer>{
	//List<SurveyQuestionsEntity> findBySurveyId(Integer surveyId);
	List<SurveyQuestionsEntity> findByQuesId(Integer QuesId);
}
