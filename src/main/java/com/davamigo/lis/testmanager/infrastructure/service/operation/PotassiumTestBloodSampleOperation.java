package com.davamigo.lis.testmanager.infrastructure.service.operation;

import com.davamigo.lis.testmanager.domain.entity.sample.Sample;
import com.davamigo.lis.testmanager.domain.entity.sampletype.BloodSampleType;
import com.davamigo.lis.testmanager.domain.entity.clinicaltest.ClinicalTest;
import com.davamigo.lis.testmanager.domain.entity.clinicaltest.PotassiumTest;
import com.davamigo.lis.testmanager.domain.dto.testresult.FloatTestResult;
import com.davamigo.lis.testmanager.domain.dto.testresult.TestResult;
import com.davamigo.lis.testmanager.domain.dto.testresult.ResultUnit;
import com.davamigo.lis.testmanager.domain.service.operation.Operation;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @author david.amigo
 */
@Service
public class PotassiumTestBloodSampleOperation implements Operation {

    @Override
    public boolean isApplicable(ClinicalTest test, Sample sample) {
        return test instanceof PotassiumTest
                && sample.getSampleType() instanceof BloodSampleType;
    }

    @Override
    public TestResult performTest(ClinicalTest test, Sample sample) {
        final int integer = 1 + new Random().nextInt(8);
        final int decimal = new Random().nextInt(9);
        final float result = (float) integer + (float) decimal / 10;
        return new FloatTestResult(test, sample, result, ResultUnit.MMOL_L);
    }
}
