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
public class IntegerTestResultTest {

    @Test
    public void testConstructorSetsTheValue() {
        final IntegerTestResult testResult = new IntegerTestResult(null, null, 101, null);

        Assertions.assertEquals(101, testResult.getValue());
    }

    @Test
    public void testConstructorSetsTheUnit() {
        final IntegerTestResult testResult = new IntegerTestResult(null, null, 0, ResultUnit.MG_100ML);

        Assertions.assertEquals(ResultUnit.MG_100ML, testResult.getUnit());
    }

    @Test
    public void testToString() {
        final ClinicalTest clinicalTest = new GlucoseTest();
        final Sample sample = new Sample(null, new BloodSampleType(), new TubeContainer("201", null));
        final IntegerTestResult testResult = new IntegerTestResult(clinicalTest, sample, 202, ResultUnit.MG_100ML);

        final String res = testResult.toString();
        final String expected = "Result: 202 mg/100mL.";
        Assertions.assertTrue(res.endsWith(expected), res);
    }
}
