package com.davamigo.lis.testmanager.dto.testresult;

import com.davamigo.lis.testmanager.entity.sample.Sample;
import com.davamigo.lis.testmanager.entity.clinicaltest.ClinicalTest;
import lombok.Getter;

/**
 * @author david.amigo
 */
@Getter
public class FloatTestResult extends TestResult {
    private final ResultUnit unit;
    private final float value;

    public FloatTestResult(ClinicalTest test, Sample sample, float value, ResultUnit unit) {
        super(test, sample);
        this.value = value;
        this.unit = unit;
    }

    @Override
    public String toString() {
        return super.toString() + "Result: " + value + " " + unit.getName() + ".";
    }
}
