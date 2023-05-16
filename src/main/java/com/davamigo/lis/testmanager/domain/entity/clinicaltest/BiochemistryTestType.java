package com.davamigo.lis.testmanager.domain.entity.clinicaltest;

import lombok.Getter;
import lombok.Setter;

/**
 * @author david.amigo
 */
@Getter
@Setter
public abstract class BiochemistryTestType extends ClinicalTest {

    private static final String TEST_TYPE = "biochemistry";

    //private String typePropA;
    //private String typePropB;
    //private String typePropC;

    public BiochemistryTestType(String testName) {
        super(TEST_TYPE, testName);
    }
}
