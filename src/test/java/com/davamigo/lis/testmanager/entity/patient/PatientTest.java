package com.davamigo.lis.testmanager.entity.patient;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

/**
 * @author david.amigo
 */
@SpringBootTest
public class PatientTest {

    @Test
    public void testConstructorSetsTheUUID() {
        final String patientUuid = "00000000-0000-0000-0000-000000000101";
        final Patient patient = new Patient(UUID.fromString(patientUuid));
        Assertions.assertEquals(patientUuid, patient.getUuid().toString());
    }

    @Test
    public void testSetUuidSetsTheUUID() {
        final String patientUuid = "00000000-0000-0000-0000-000000000111";
        final Patient patient = new Patient(null);
        patient.setUuid(UUID.fromString(patientUuid));
        Assertions.assertEquals(patientUuid, patient.getUuid().toString());
    }
}
