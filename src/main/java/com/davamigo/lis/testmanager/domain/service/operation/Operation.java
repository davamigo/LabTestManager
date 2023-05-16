package com.davamigo.lis.testmanager.domain.service.operation;

import com.davamigo.lis.testmanager.domain.entity.sample.Sample;
import com.davamigo.lis.testmanager.domain.entity.clinicaltest.ClinicalTest;
import com.davamigo.lis.testmanager.domain.dto.testresult.TestResult;

/**
 * @author david.amigo
 */
public interface Operation {

    boolean isApplicable(ClinicalTest test, Sample sample);

    TestResult performTest(ClinicalTest test, Sample sample);
}
