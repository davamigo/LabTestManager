package com.davamigo.lis.testmanager.domain.entity.clinicaltest;

import lombok.Getter;
import lombok.Setter;

/**
 * @author david.amigo
 */
@Getter
@Setter
public abstract class HematologyTestType extends ClinicalTest {

    private static final String TEST_TYPE = "hematology";

    //private String typePropA;
    //private String typePropB;
    //private String typePropC;

    public HematologyTestType(String testName) {
        super(TEST_TYPE, testName);
    }
}
