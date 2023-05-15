package com.davamigo.lis.testmanager.entity.clinicaltest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author david.amigo
 */
@SpringBootTest
public class ClinicalTestTest {

    @Test
    public void testConstructorSetsTestType() {
        final ClinicalTest test = new ClinicalTest("101", null) {};
        Assertions.assertEquals("101", test.getTestType());
    }

    @Test
    public void testConstructorSetsTestName() {
        final ClinicalTest test = new ClinicalTest(null, "102") {};
        Assertions.assertEquals("102", test.getTestName());
    }
}

