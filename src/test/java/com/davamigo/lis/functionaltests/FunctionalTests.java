package com.davamigo.lis.functionaltests;

import com.davamigo.lis.testmanager.application.usecases.PerformOrderTestsUseCase;
import com.davamigo.lis.testmanager.domain.dto.testresult.*;
import com.davamigo.lis.testmanager.domain.entity.clinicaltest.ClinicalTest;
import com.davamigo.lis.testmanager.domain.entity.clinicaltest.GlucoseTest;
import com.davamigo.lis.testmanager.domain.entity.clinicaltest.PotassiumTest;
import com.davamigo.lis.testmanager.domain.entity.clinicaltest.SodiumTest;
import com.davamigo.lis.testmanager.domain.entity.container.Container;
import com.davamigo.lis.testmanager.domain.entity.container.TubeContainer;
import com.davamigo.lis.testmanager.domain.entity.order.Order;
import com.davamigo.lis.testmanager.domain.entity.patient.Patient;
import com.davamigo.lis.testmanager.domain.entity.sample.Sample;
import com.davamigo.lis.testmanager.domain.entity.sampletype.BloodSampleType;
import com.davamigo.lis.testmanager.domain.entity.sampletype.SampleType;
import com.davamigo.lis.testmanager.domain.entity.sampletype.SerumSampleType;
import com.davamigo.lis.testmanager.domain.entity.sampletype.UrineSampleType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.UUID;

/**
 * @author david.amigo
 */
@SpringBootTest
public class FunctionalTests {

    @Autowired
    private PerformOrderTestsUseCase uc;

    @Test
    public void testOrderWithBloodSampleAndOneGlucoseTest() {

        final UUID patientUuid = UUID.randomUUID();
        final Patient patient = new Patient(patientUuid);
        final long rawLabel = new Random().nextLong(1000000000000L, 9999999999999L);
        final Container tubeContainer = new TubeContainer(String.valueOf(rawLabel), patient);
        final UUID sampeUuid = UUID.randomUUID();
        final SampleType bloodSampleType = new BloodSampleType();
        final Sample bloodSample = new Sample(sampeUuid, bloodSampleType, tubeContainer);
        final ClinicalTest test = new GlucoseTest();
        final Collection<ClinicalTest> tests = List.of(test);
        final UUID orderUuid = UUID.randomUUID();
        final Order order = new Order(orderUuid, bloodSample, tests);

        final List<TestResult> results = new ArrayList<>(uc.performOrder(order));
        Assertions.assertEquals(1, results.size());

        final TestResult result = results.get(0);
        Assertions.assertNotNull(result);
        Assertions.assertTrue(result instanceof IntegerTestResult);
        Assertions.assertTrue(((IntegerTestResult) result).getValue() > 0);
        Assertions.assertSame(ResultUnit.MG_100ML, ((IntegerTestResult) result).getUnit());

        final String res = result.toString();
        Assertions.assertTrue(res.startsWith("Performed glucose test (biochemistry) on blood sample"));
        Assertions.assertTrue(res.contains("in container labeled " + rawLabel));
        Assertions.assertTrue(res.endsWith("mg/100mL."));
        System.out.println(res);
    }

    @Test
    public void testOrderWithUrineSampleAndOneGlucoseTest() {

        final long rawLabel = new Random().nextLong(1000000000000L, 9999999999999L);
        final Container tubeContainer = new TubeContainer(String.valueOf(rawLabel), new Patient(UUID.randomUUID()));
        final Sample urineSample = new Sample(UUID.randomUUID(), new UrineSampleType(), tubeContainer);
        final ClinicalTest test = new GlucoseTest();
        final Order order = new Order(UUID.randomUUID(), urineSample, List.of(test));

        final List<TestResult> results = new ArrayList<>(uc.performOrder(order));
        Assertions.assertEquals(1, results.size());

        final TestResult result = results.get(0);
        Assertions.assertNotNull(result);
        Assertions.assertTrue(result instanceof IntegerTestResult);
        Assertions.assertTrue(((IntegerTestResult) result).getValue() > 0);
        Assertions.assertSame(ResultUnit.MG_100ML, ((IntegerTestResult) result).getUnit());

        final String res = result.toString();
        Assertions.assertTrue(res.startsWith("Performed glucose test (biochemistry) on urine sample"));
        System.out.println(res);
    }

    @Test
    public void testOrderWithBloodSampleAndOnePotassiumTest() {

        final long rawLabel = new Random().nextLong(1000000000000L, 9999999999999L);
        final Container tubeContainer = new TubeContainer(String.valueOf(rawLabel), new Patient(UUID.randomUUID()));
        final Sample bloodSample = new Sample(UUID.randomUUID(), new BloodSampleType(), tubeContainer);
        final ClinicalTest test = new PotassiumTest();
        final Order order = new Order(UUID.randomUUID(), bloodSample, List.of(test));

        final List<TestResult> results = new ArrayList<>(uc.performOrder(order));
        Assertions.assertEquals(1, results.size());

        final TestResult result = results.get(0);
        Assertions.assertNotNull(result);
        Assertions.assertTrue(result instanceof FloatTestResult);
        Assertions.assertTrue(((FloatTestResult) result).getValue() > 0);
        Assertions.assertSame(ResultUnit.MMOL_L, ((FloatTestResult) result).getUnit());

        final String res = result.toString();
        Assertions.assertTrue(res.startsWith("Performed potassium test (biochemistry) on blood sample"));
        System.out.println(res);
    }

    @Test
    public void testWhenThereIsNoOperationForTheTestAndSample() {

        final long rawLabel = new Random().nextLong(1000000000000L, 9999999999999L);
        final Container tubeContainer = new TubeContainer(String.valueOf(rawLabel), new Patient(UUID.randomUUID()));
        final Sample bloodSample = new Sample(UUID.randomUUID(), new SerumSampleType(), tubeContainer);
        final ClinicalTest test = new PotassiumTest();
        final Order order = new Order(UUID.randomUUID(), bloodSample, List.of(test));

        final List<TestResult> results = new ArrayList<>(uc.performOrder(order));
        Assertions.assertEquals(1, results.size());

        final TestResult result = results.get(0);
        Assertions.assertNotNull(result);
        Assertions.assertTrue(result instanceof ErrorTestResult);
        Assertions.assertEquals("No operations found for this test and sample", ((ErrorTestResult) result).getMessage());

        final String res = result.toString();
        System.out.println(res);
    }

    @Test
    public void testOrderWithBloodSampleAndSodiumAndPotassiumAndGlucoseTest() {

        final long rawLabel = new Random().nextLong(1000000000000L, 9999999999999L);
        final Container tubeContainer = new TubeContainer(String.valueOf(rawLabel), new Patient(UUID.randomUUID()));
        final Sample bloodSample = new Sample(UUID.randomUUID(), new BloodSampleType(), tubeContainer);
        final ClinicalTest test1 = new PotassiumTest();
        final ClinicalTest test2 = new SodiumTest();
        final ClinicalTest test3 = new GlucoseTest();
        final Order order = new Order(UUID.randomUUID(), bloodSample, List.of(test1, test2, test3));

        final List<TestResult> results = new ArrayList<>(uc.performOrder(order));
        Assertions.assertEquals(3, results.size());
        results.forEach(testResult -> System.out.println(testResult.toString()));
    }
}
