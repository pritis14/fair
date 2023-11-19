package com.analysis.project1.service;

import com.analysis.project1.model.SurveyReportEntity;
import com.analysis.project1.repository.SurveyReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SurveyReportService {
    @Autowired
    SurveyReportRepository repository;
    public SurveyReportEntity saveReport(SurveyReportEntity report){
        SurveyReportEntity surveyQuest=repository.save(report);
        return surveyQuest;

    }
}
