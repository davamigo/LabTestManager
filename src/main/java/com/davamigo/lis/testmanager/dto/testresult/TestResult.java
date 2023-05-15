package com.davamigo.lis.testmanager.dto.testresult;

import com.davamigo.lis.testmanager.entity.sample.Sample;
import com.davamigo.lis.testmanager.entity.clinicaltest.ClinicalTest;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author david.amigo
 */
@Getter
@AllArgsConstructor
public abstract class TestResult {
    private final ClinicalTest test;
    private final Sample sample;

    @Override
    public String toString() {
        return "Performed " + test.getTestName() + " test (" + test.getTestType() + ") "
                + "on " + sample.getSampleType().getName() + " sample "
                + "in container labeled " + sample.getContainer().getLabel() + ". ";
    }
}
