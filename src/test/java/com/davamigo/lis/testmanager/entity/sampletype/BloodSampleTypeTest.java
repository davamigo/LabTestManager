package com.davamigo.lis.testmanager.entity.sampletype;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author david.amigo
 */
@SpringBootTest
public class BloodSampleTypeTest {
    @Test
    public void testConstructorSetsTheName() {
        final SampleType sampleType = new BloodSampleType();
        Assertions.assertEquals("blood", sampleType.getName());
    }
}
