package com.davamigo.lis.testmanager.entity.clinicaltest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author david.amigo
 */
@SpringBootTest
public class GlucoseTestTest {

    @Test
    public void testConstructorSetsTestName() {
        final ClinicalTest test = new GlucoseTest() {};
        Assertions.assertEquals("glucose", test.getTestName());
    }
}
