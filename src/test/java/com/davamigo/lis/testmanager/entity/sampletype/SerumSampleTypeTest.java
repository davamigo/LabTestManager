package com.davamigo.lis.testmanager.entity.sampletype;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author david.amigo
 */
@SpringBootTest
public class SerumSampleTypeTest {
    @Test
    public void testConstructorSetsTheName() {
        final SampleType sampleType = new SerumSampleType();
        Assertions.assertEquals("serum", sampleType.getName());
    }
}
