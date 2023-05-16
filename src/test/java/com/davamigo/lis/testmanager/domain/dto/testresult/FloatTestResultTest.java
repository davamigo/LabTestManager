package com.davamigo.lis.testmanager.domain.dto.testresult;

import com.davamigo.lis.testmanager.domain.entity.clinicaltest.ClinicalTest;
import com.davamigo.lis.testmanager.domain.entity.clinicaltest.GlucoseTest;
import com.davamigo.lis.testmanager.domain.entity.container.TubeContainer;
import com.davamigo.lis.testmanager.domain.entity.sample.Sample;
import com.davamigo.lis.testmanager.domain.entity.sampletype.BloodSampleType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author david.amigo
 */
@SpringBootTest
public class FloatTestResultTest {

    @Test
    public void testConstructorSetsTheValue() {
        final FloatTestResult testResult = new FloatTestResult(null, null, 101f, null);

        Assertions.assertEquals(101f, testResult.getValue());
    }

    @Test
    public void testConstructorSetsTheUnit() {
        final FloatTestResult testResult = new FloatTestResult(null, null, 0, ResultUnit.MMOL_L);

        Assertions.assertEquals(ResultUnit.MMOL_L, testResult.getUnit());
    }

    @Test
    public void testToString() {
        final ClinicalTest clinicalTest = new GlucoseTest();
        final Sample sample = new Sample(null, new BloodSampleType(), new TubeContainer("201", null));
        final FloatTestResult testResult = new FloatTestResult(clinicalTest, sample, 202f, ResultUnit.MG_100ML);

        final String res = testResult.toString();
        final String expected = "Result: 202.0 mg/100mL.";
        Assertions.assertTrue(res.endsWith(expected), res);
    }
}
