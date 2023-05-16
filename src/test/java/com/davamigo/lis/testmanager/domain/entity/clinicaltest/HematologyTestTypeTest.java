package com.davamigo.lis.testmanager.domain.entity.clinicaltest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author david.amigo
 */
@SpringBootTest
public class HematologyTestTypeTest {

    @Test
    public void testConstructorSetsTestType() {
        final ClinicalTest test = new HematologyTestType(null) {};
        Assertions.assertEquals("hematology", test.getTestType());
    }

    @Test
    public void testConstructorSetsTestName() {
        final ClinicalTest test = new HematologyTestType("101") {};
        Assertions.assertEquals("101", test.getTestName());
    }
}
