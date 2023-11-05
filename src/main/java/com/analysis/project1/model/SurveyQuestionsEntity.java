package com.analysis.project1.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "Survey_Questions2")
public class SurveyQuestionsEntity {
	@Id
	@Column(name = "SurveyId")
	public Integer SurveyId;
	@Column(name = "QuesId")
	private Integer QuesId;
	@Column(name = "QuesDescription")
	private String QuesDescription;
    @Column(name = "ActivityDate")
	private Date ActivityDate;
    
 @Override
 public String toString() {
	 return "Survey_Question( SurveyId"+ SurveyId+"QuesId"+QuesId+"QuesDescription"+"QuesDescription)";
 }

public Integer getSurveyId() {
	return SurveyId;
}

public void setSurveyId(Integer surveyId) {
	SurveyId = surveyId;
}

public Integer getQuesId() {
	return QuesId;
}

public void setQuesId(Integer quesId) {
	QuesId = quesId;
}

public String getQuesDescription() {
	return QuesDescription;
}

public void setQuesDescription(String quesDescription) {
	QuesDescription = quesDescription;
}

public Date getActivityDate() {
	return ActivityDate;
}

public void setActivityDate(Date activityDate) {
	ActivityDate = activityDate;
}
 

}
