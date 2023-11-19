package com.analysis.project1.repository;


import com.analysis.project1.model.SurveyReportEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurveyReportRepository extends JpaRepository<SurveyReportEntity, Long> {
}
