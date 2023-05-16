package com.davamigo.lis.testmanager.domain.entity.container;

import com.davamigo.lis.testmanager.domain.entity.patient.Patient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

/**
 * @author david.amigo
 */
@SpringBootTest
public class ContainerTest {

    @Test
    public void testConstructorSetsTheContainerType() {
        final Container container = new Container("101", null, null) {};
        Assertions.assertEquals("101", container.getContainerType());
    }

    @Test
    public void testConstructorSetsTheLabel() {
        final Container container = new Container(null, "111", null) {};
        Assertions.assertEquals("111", container.getLabel());
    }

    @Test
    public void testConstructorSetsThePatient() {
        final String patientUuid = "00000000-0000-0000-0000-000000000121";
        final Container container = new Container(null, null, new Patient(UUID.fromString(patientUuid))) {};
        Assertions.assertEquals(patientUuid, container.getPatient().getUuid().toString());
    }

    @Test
    public void testSetLabelSetsTheLabel() {
        final Container container = new Container(null, null, null) {};
        container.setLabel("201");
        Assertions.assertEquals("201", container.getLabel());
    }

    @Test
    public void testSetPAtientSetsThePatient() {
        final String patientUuid = "00000000-0000-0000-0000-000000000211";
        final Container container = new Container(null, null, null) {};
        container.setPatient(new Patient(UUID.fromString(patientUuid)));
        Assertions.assertEquals(patientUuid, container.getPatient().getUuid().toString());
    }
}
