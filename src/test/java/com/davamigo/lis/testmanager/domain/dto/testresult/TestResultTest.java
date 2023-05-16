package com.davamigo.lis.testmanager.domain.dto.testresult;

import com.davamigo.lis.testmanager.domain.entity.clinicaltest.ClinicalTest;
import com.davamigo.lis.testmanager.domain.entity.clinicaltest.GlucoseTest;
import com.davamigo.lis.testmanager.domain.entity.container.TubeContainer;
import com.davamigo.lis.testmanager.domain.entity.sample.Sample;
import com.davamigo.lis.testmanager.domain.entity.sampletype.BloodSampleType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

/**
 * @author david.amigo
 */
@SpringBootTest
public class TestResultTest {

    @Test
    public void testConstructorSetsTheClinicalTest() {
        final ClinicalTest clinicalTest = new ClinicalTest("101", null) {};
        final TestResult testResult = new TestResult(clinicalTest, null) {};

        Assertions.assertEquals("101", testResult.getTest().getTestType());
    }

    @Test
    public void testConstructorSetsTheSample() {
        final Sample sample = new Sample(UUID.randomUUID(), new BloodSampleType(), null);
        final TestResult testResult = new TestResult(null, sample) {};

        Assertions.assertEquals("blood", testResult.getSample().getSampleType().getName());
    }

    @Test
    public void testToString() {
        final ClinicalTest clinicalTest = new GlucoseTest();
        final Sample sample = new Sample(null, new BloodSampleType(), new TubeContainer("201", null));
        final TestResult testResult = new TestResult(clinicalTest, sample) {};

        final String expected = "Performed glucose test (biochemistry) on blood sample in container labeled 201.";
        Assertions.assertEquals(expected, testResult.toString().trim());
    }
}
