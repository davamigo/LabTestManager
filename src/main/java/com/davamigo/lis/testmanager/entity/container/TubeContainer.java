package com.davamigo.lis.testmanager.entity.container;

import com.davamigo.lis.testmanager.entity.patient.Patient;
import lombok.Getter;

/**
 * @author david.amigo
 */
@Getter
public class TubeContainer extends Container {

    private static final String CONTAINER_TYPE = "tube";

    public TubeContainer(String label, Patient patient) {
        super(CONTAINER_TYPE, label, patient);
    }
}
