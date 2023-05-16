package com.davamigo.lis.testmanager.domain.entity.sampletype;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author david.amigo
 */
@SpringBootTest
public class UrineSampleTypeTest {
    @Test
    public void testConstructorSetsTheName() {
        final SampleType sampleType = new UrineSampleType();
        Assertions.assertEquals("urine", sampleType.getName());
    }
}
