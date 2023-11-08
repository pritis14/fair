package com.analysis.project1.model;

import java.util.Date;

import jakarta.persistence.*;


@Entity
@Table(name = "Survey_Questions")
public class SurveyQuestionsEntity {

	@EmbeddedId
	private MyKey myKey;

	public MyKey getMyKey() {
		return myKey;
	}

	public void setMyKey(MyKey myKey) {
		this.myKey = myKey;
	}

	//	@Id
//	@Column(name = "surveyId")
//	public Integer surveyId;
//	@Id
//	@Column(name = "quesId")
//	private Integer quesId;
	@Column(name = "quesDescription")
	private String quesDescription;
    @Column(name = "activityDate")
	private Date activityDate;

// @Override
// public String toString() {
//	 return "Survey_Question( SurveyId"+ surveyId+"QuesId"+quesId+"QuesDescription"+quesDescription+")";
// }

//public Integer getSurveyId() {
//	return surveyId;
//}
//
//public void setSurveyId(Integer surveyId) {
//	surveyId = surveyId;
//}

//public Integer getQuesId() {
//	return quesId;
//}
//
//public void setQuesId(Integer quesId) {
//	quesId = quesId;
//}

public String getQuesDescription() {
	return quesDescription;
}

public void setQuesDescription(String quesDescription) {
	quesDescription = quesDescription;
}

public Date getActivityDate() {
	return activityDate;
}

public void setActivityDate(Date activityDate) {
	activityDate = activityDate;
}
 

}
