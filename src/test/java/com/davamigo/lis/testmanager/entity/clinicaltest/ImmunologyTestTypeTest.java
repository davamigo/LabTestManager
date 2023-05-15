package com.davamigo.lis.testmanager.entity.clinicaltest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author david.amigo
 */
@SpringBootTest
public class ImmunologyTestTypeTest {

    @Test
    public void testConstructorSetsTestType() {
        final ClinicalTest test = new ImmunologyTestType(null) {};
        Assertions.assertEquals("immunology", test.getTestType());
    }

    @Test
    public void testConstructorSetsTestName() {
        final ClinicalTest test = new ImmunologyTestType("101") {};
        Assertions.assertEquals("101", test.getTestName());
    }
}
