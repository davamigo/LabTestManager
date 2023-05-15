package com.davamigo.lis.testmanager.dto.testresult;

import com.davamigo.lis.testmanager.entity.clinicaltest.ClinicalTest;
import com.davamigo.lis.testmanager.entity.sample.Sample;
import lombok.Getter;

/**
 * @author david.amigo
 */
@Getter
public class ErrorTestResult extends TestResult {
    private final String message;

    public ErrorTestResult(ClinicalTest test, Sample sample, String message) {
        super(test, sample);
        this.message = message;
    }

    @Override
    public String toString() {
        return super.toString() + "Message: " + message + ".";
    }
}
