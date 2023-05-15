package com.davamigo.lis.testmanager.service.operation;

import com.davamigo.lis.testmanager.entity.sample.Sample;
import com.davamigo.lis.testmanager.entity.clinicaltest.ClinicalTest;
import com.davamigo.lis.testmanager.dto.testresult.TestResult;

/**
 * @author david.amigo
 */
public interface Operation {

    boolean isApplicable(ClinicalTest test, Sample sample);

    TestResult performTest(ClinicalTest test, Sample sample);
}
