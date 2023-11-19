package com.analysis.project1.controller;

import com.analysis.project1.model.SurveyReportEntity;
import com.analysis.project1.service.SurveyReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(maxAge = 99999)
public class SurveyReportController {
//    @Autowired
//    SurveyReportService reportSevice;
//    @PostMapping("/saveReport")
//    public SurveyReportEntity createComment(@RequestBody SurveyReportEntity data) {
//        SurveyReportEntity list  = reportSevice.saveReport(data);
//        return list;
//    }
}
