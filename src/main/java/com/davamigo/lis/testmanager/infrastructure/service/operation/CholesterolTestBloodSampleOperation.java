package com.davamigo.lis.testmanager.infrastructure.service.operation;

import com.davamigo.lis.testmanager.domain.entity.sample.Sample;
import com.davamigo.lis.testmanager.domain.entity.sampletype.BloodSampleType;
import com.davamigo.lis.testmanager.domain.entity.clinicaltest.CholesterolTest;
import com.davamigo.lis.testmanager.domain.entity.clinicaltest.ClinicalTest;
import com.davamigo.lis.testmanager.domain.dto.testresult.IntegerTestResult;
import com.davamigo.lis.testmanager.domain.dto.testresult.TestResult;
import com.davamigo.lis.testmanager.domain.dto.testresult.ResultUnit;
import com.davamigo.lis.testmanager.domain.service.operation.Operation;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @author david.amigo
 */
@Service
public class CholesterolTestBloodSampleOperation implements Operation {

    @Override
    public boolean isApplicable(ClinicalTest test, Sample sample) {
        return test instanceof CholesterolTest
                && sample.getSampleType() instanceof BloodSampleType;
    }

    @Override
    public TestResult performTest(ClinicalTest test, Sample sample) {
        final int result = 10 +  new Random().nextInt(500);
        return new IntegerTestResult(test, sample, result, ResultUnit.MG_100ML);
    }
}
