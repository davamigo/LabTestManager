package com.davamigo.lis.testmanager.domain.entity.container;

import com.davamigo.lis.testmanager.domain.entity.patient.Patient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author david.amigo
 */
@Getter
@Setter
@AllArgsConstructor
public abstract class Container {
    private final String containerType;
    private String label;
    private Patient patient;
}
