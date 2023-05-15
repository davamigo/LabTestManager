package com.davamigo.lis.testmanager.service.operation;

import com.davamigo.lis.testmanager.entity.sample.Sample;
import com.davamigo.lis.testmanager.entity.sampletype.UrineSampleType;
import com.davamigo.lis.testmanager.entity.clinicaltest.GlucoseTest;
import com.davamigo.lis.testmanager.entity.clinicaltest.ClinicalTest;
import com.davamigo.lis.testmanager.dto.testresult.IntegerTestResult;
import com.davamigo.lis.testmanager.dto.testresult.TestResult;
import com.davamigo.lis.testmanager.dto.testresult.ResultUnit;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @author david.amigo
 */
@Service
public class GlucoseTestUrineSampleOperation implements Operation {

    @Override
    public boolean isApplicable(ClinicalTest test, Sample sample) {
        return test instanceof GlucoseTest
                && sample.getSampleType() instanceof UrineSampleType;
    }

    @Override
    public TestResult performTest(ClinicalTest test, Sample sample) {
        final int result = 30 +  new Random().nextInt(270);
        return new IntegerTestResult(test, sample, result, ResultUnit.MG_100ML);
    }
}
