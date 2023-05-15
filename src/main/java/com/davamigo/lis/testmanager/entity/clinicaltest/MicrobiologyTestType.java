package com.davamigo.lis.testmanager.entity.clinicaltest;

import lombok.Getter;

/**
 * @author david.amigo
 */
@Getter
public abstract class MicrobiologyTestType extends ClinicalTest {

    private static final String TEST_TYPE = "microbiology";

    //private String typePropA;
    //private String typePropB;
    //private String typePropC;

    public MicrobiologyTestType(String testName) {
        super(TEST_TYPE, testName);
    }
}
