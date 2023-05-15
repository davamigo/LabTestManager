package com.davamigo.lis.testmanager.entity.clinicaltest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author david.amigo
 */
@SpringBootTest
public class CholesterolTestTest {

    @Test
    public void testConstructorSetsTestName() {
        final ClinicalTest test = new CholesterolTest() {};
        Assertions.assertEquals("cholesterol", test.getTestName());
    }
}
