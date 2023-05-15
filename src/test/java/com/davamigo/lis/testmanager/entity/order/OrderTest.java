package com.davamigo.lis.testmanager.entity.order;

import com.davamigo.lis.testmanager.entity.sample.Sample;
import com.davamigo.lis.testmanager.entity.clinicaltest.ClinicalTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.UUID;

/**
 * @author david.amigo
 */
@SpringBootTest
public class OrderTest {

    @Test
    public void testConstructorSetsTheUUID() {
        final String orderUuid = "00000000-0000-0000-0000-000000000101";
        final Order order = new Order(UUID.fromString(orderUuid), null, null);
        Assertions.assertEquals(orderUuid, order.getUuid().toString());
    }

    @Test
    public void testConstructorSetsTheSample() {
        final String sampleUuid = "00000001-0000-0000-0000-000000000101";
        final Sample sample = new Sample(UUID.fromString(sampleUuid), null, null);
        final Order order = new Order(null, sample, null);
        Assertions.assertEquals(sampleUuid, order.getSample().getUuid().toString());
    }

    @Test
    public void testConstructorSetsTheTests() {
        final ClinicalTest testMock1 = Mockito.mock(ClinicalTest.class);
        final ClinicalTest testMock2 = Mockito.mock(ClinicalTest.class);
        final List<ClinicalTest> tests = List.of(testMock1, testMock2);

        final Order order = new Order(null, null, tests);
        Assertions.assertEquals(2, order.getTests().size());
    }
}
