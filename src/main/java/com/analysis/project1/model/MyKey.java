package com.analysis.project1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;

import java.io.Serializable;

@Embeddable
public class MyKey implements Serializable {


    @Column(name = "SurveyId")
    public Integer SurveyId;

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


    @Column(name = "QuesId")
    private Integer QuesId;

    /** getters and setters **/
}
