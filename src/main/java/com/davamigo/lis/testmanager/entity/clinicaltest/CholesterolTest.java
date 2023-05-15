package com.davamigo.lis.testmanager.entity.clinicaltest;

import lombok.Getter;
import lombok.Setter;

/**
 * @author david.amigo
 */
@Getter
@Setter
public class CholesterolTest extends BiochemistryTestType {

    private static final String TEST_NAME = "cholesterol";

    //private String testPropA;
    //private String testPropB;
    //private String testPropC;

    public CholesterolTest() {
        super(TEST_NAME);
    }
}
