package com.davamigo.lis.testmanager.domain.dto.testresult;

import com.davamigo.lis.testmanager.domain.entity.sample.Sample;
import com.davamigo.lis.testmanager.domain.entity.clinicaltest.ClinicalTest;
import lombok.Getter;

/**
 * @author david.amigo
 */
@Getter
public class IntegerTestResult extends TestResult {
    private final ResultUnit unit;
    private final int value;

    public IntegerTestResult(ClinicalTest test, Sample sample, int value, ResultUnit unit) {
        super(test, sample);
        this.value = value;
        this.unit = unit;
    }

    @Override
    public String toString() {
        return super.toString() + "Result: " + value + " " + unit.getName() + ".";
    }
}
