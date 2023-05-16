package com.davamigo.lis.testmanager.domain.entity.sampletype;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author david.amigo
 */
@SpringBootTest
public class SampleTypeTest {

    @Test
    public void testConstructorSetsTheName() {
        final SampleType sampleType = new SampleType("101") {};
        Assertions.assertEquals("101", sampleType.getName());
    }
}
