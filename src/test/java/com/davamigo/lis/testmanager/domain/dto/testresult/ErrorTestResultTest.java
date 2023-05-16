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
public class ErrorTestResultTest {

    @Test
    public void testConstructorSetsTheMessage() {
        final ErrorTestResult testResult = new ErrorTestResult(null, null, "101");

        Assertions.assertEquals("101", testResult.getMessage());
    }

    @Test
    public void testToString() {
        final ClinicalTest clinicalTest = new GlucoseTest();
        final Sample sample = new Sample(null, new BloodSampleType(), new TubeContainer("201", null));
        final ErrorTestResult testResult = new ErrorTestResult(clinicalTest, sample, "202");

        final String res = testResult.toString();
        final String expected = "Message: 202.";
        Assertions.assertTrue(res.endsWith(expected), res);
    }
}
