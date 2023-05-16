package com.davamigo.lis.testmanager.domain.entity.clinicaltest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author david.amigo
 */
@SpringBootTest
public class GlycatedHaemoglobinHbA1cTestTest {

    @Test
    public void testConstructorSetsTestName() {
        final ClinicalTest test = new GlycatedHaemoglobinHbA1cTest() {};
        Assertions.assertEquals("glycated_haemoglobin_hba1c", test.getTestName());
    }
}
