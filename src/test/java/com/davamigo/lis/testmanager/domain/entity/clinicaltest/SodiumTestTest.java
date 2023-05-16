package com.davamigo.lis.testmanager.domain.entity.clinicaltest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author david.amigo
 */
@SpringBootTest
public class SodiumTestTest {

    @Test
    public void testConstructorSetsTestName() {
        final ClinicalTest test = new SodiumTest() {};
        Assertions.assertEquals("sodium", test.getTestName());
    }
}
