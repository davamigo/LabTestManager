package com.davamigo.lis.testmanager.domain.entity.clinicaltest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author david.amigo
 */
@Getter
@Setter
@AllArgsConstructor
public abstract class ClinicalTest {
    private final String testType;
    private final String testName;
    //private String genericPropA;
    //private String genericPropB;
    //private String genericPropC;
}
