package com.analysis.project1.model;

import java.util.Date;

import jakarta.persistence.*;


@Entity
@Table(name = "Survey_Questions1")
public class SurveyQuestions1Entity {
    @Column(name = "surveyId")
    public Integer surveyId;

    public Integer getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(Integer surveyId) {
        surveyId = surveyId;
    }

    @Id
    @Column(name = "quesId")
    private Integer quesId;

    public Integer getQuesId() {
        return quesId;
    }

    public void setQuesId(Integer quesId) {
        quesId = quesId;
    }

    @Column(name = "quesDescription")
    private String quesDescription;
    @Column(name = "activityDate")
    private Date activityDate;
    @Column(name = "quesType")
    private String quesType;
    @Column(name="quesNoLabel")
    private String quesNoLabel;

    public String getQuesNoLabel() {
        return quesNoLabel;
    }

    public void setQuesNoLabel(String quesNoLabel) {
        this.quesNoLabel = quesNoLabel;
    }

    public String getQuesYesLabel() {
        return quesYesLabel;
    }

    public void setQuesYesLabel(String quesYesLabel) {
        this.quesYesLabel = quesYesLabel;
    }

    @Column(name="quesYesLabel")
    private String quesYesLabel;


    public String getQuesType() {
        return quesType;
    }

    public void setQuesType(String quesType) {
        this.quesType = quesType;
    }

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
