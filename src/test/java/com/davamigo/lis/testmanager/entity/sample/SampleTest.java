package com.davamigo.lis.testmanager.entity.sample;

import com.davamigo.lis.testmanager.entity.container.TubeContainer;
import com.davamigo.lis.testmanager.entity.sampletype.BloodSampleType;
import com.davamigo.lis.testmanager.entity.sampletype.UrineSampleType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

/**
 * @author david.amigo
 */
@SpringBootTest
public class SampleTest {

    @Test
    public void testConstructorSetsTheUUID() {
        final String sampleUuid = "00000000-0000-0000-0000-000000000101";
        final Sample sample = new Sample(UUID.fromString(sampleUuid), null, null);
        Assertions.assertEquals(sampleUuid, sample.getUuid().toString());
    }

    @Test
    public void testConstructorSetsTheSampleType() {
        final Sample sample = new Sample(null, new BloodSampleType(), null);
        Assertions.assertEquals("blood", sample.getSampleType().getName());
    }

    @Test
    public void testConstructorSetsTheContainer() {
        final Sample sample = new Sample(null, null, new TubeContainer("201", null));
        Assertions.assertEquals("201", sample.getContainer().getLabel());
    }

    @Test
    public void testSetUuidSetsTheUUID() {
        final String sampleUuid = "00000000-0000-0000-0000-000000000111";
        final Sample sample = new Sample(null, null, null);
        sample.setUuid(UUID.fromString(sampleUuid));
        Assertions.assertEquals(sampleUuid, sample.getUuid().toString());
    }

    @Test
    public void testSetSampleTypeSetsTheSampleType() {
        final Sample sample = new Sample(null, null, null);
        sample.setSampleType(new UrineSampleType());
        Assertions.assertEquals("urine", sample.getSampleType().getName());
    }

    @Test
    public void testSetContainerSetsTheContainer() {
        final Sample sample = new Sample(null, null, null);
        sample.setContainer(new TubeContainer("211", null));
        Assertions.assertEquals("211", sample.getContainer().getLabel());
    }
}
