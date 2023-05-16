package com.davamigo.lis.testmanager.domain.service.testmanager;

import com.davamigo.lis.testmanager.domain.dto.testresult.ErrorTestResult;
import com.davamigo.lis.testmanager.domain.dto.testresult.TestResult;
import com.davamigo.lis.testmanager.domain.entity.clinicaltest.ClinicalTest;
import com.davamigo.lis.testmanager.domain.entity.clinicaltest.GlucoseTest;
import com.davamigo.lis.testmanager.domain.entity.order.Order;
import com.davamigo.lis.testmanager.domain.entity.sample.Sample;
import com.davamigo.lis.testmanager.domain.entity.sampletype.BloodSampleType;
import com.davamigo.lis.testmanager.domain.service.operation.Operation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collection;
import java.util.List;

/**
 * @author david.amigo
 */
@SpringBootTest
public class TestManagerServiceTest {

    @Test
    public void testPerformOrderCallsOperationIsApplicableWhenThreeOperations() {

        final Operation operation1 = Mockito.mock(Operation.class);
        final Operation operation2 = Mockito.mock(Operation.class);
        final Operation operation3 = Mockito.mock(Operation.class);
        final TestManager testManager = new TestManagerService(List.of(operation1, operation2, operation3));

        final Sample sample = new Sample(null, new BloodSampleType(), null);
        final ClinicalTest test = new GlucoseTest();
        final Order order = new Order(null, sample, List.of(test));

        testManager.performOrder(order);

        Mockito.verify(operation1, Mockito.times(1)).isApplicable(test, sample);
        Mockito.verify(operation2, Mockito.times(1)).isApplicable(test, sample);
        Mockito.verify(operation3, Mockito.times(1)).isApplicable(test, sample);
    }

    @Test
    public void testPerformOrderCallsOperationPerformTestWhenTheOperationIsApplicable() {

        final Operation operation1 = Mockito.mock(Operation.class);
        final Operation operation2 = Mockito.mock(Operation.class);
        final Operation operation3 = Mockito.mock(Operation.class);
        final TestManager testManager = new TestManagerService(List.of(operation1, operation2, operation3));

        final Sample sample = new Sample(null, new BloodSampleType(), null);
        final ClinicalTest test = new GlucoseTest();
        final Order order = new Order(null, sample, List.of(test));

        Mockito.doReturn(true).when(operation2).isApplicable(test, sample);

        testManager.performOrder(order);

        Mockito.verify(operation1, Mockito.times(0)).performTest(test, sample);
        Mockito.verify(operation2, Mockito.times(1)).performTest(test, sample);
        Mockito.verify(operation3, Mockito.times(0)).performTest(test, sample);
    }
    @Test
    public void testPerformOrderReturnsErrorResultWhenNoOperationApplicable() {

        final Operation operation1 = Mockito.mock(Operation.class);
        final Operation operation2 = Mockito.mock(Operation.class);
        final Operation operation3 = Mockito.mock(Operation.class);
        final TestManager testManager = new TestManagerService(List.of(operation1, operation2, operation3));

        final Sample sample = new Sample(null, new BloodSampleType(), null);
        final ClinicalTest test = new GlucoseTest();
        final Order order = new Order(null, sample, List.of(test));

        Collection<TestResult> results = testManager.performOrder(order);

        Assertions.assertEquals(1, results.size());
        results.forEach(testResult -> Assertions.assertTrue(testResult instanceof ErrorTestResult));
    }
}
