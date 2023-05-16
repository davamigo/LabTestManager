package com.davamigo.lis.testmanager.domain.entity.clinicaltest;

import lombok.Getter;
import lombok.Setter;

/**
 * @author david.amigo
 */
@Getter
@Setter
public class PotassiumTest extends BiochemistryTestType {

    private static final String TEST_NAME = "potassium";

    //private String testPropA;
    //private String testPropB;
    //private String testPropC;

    public PotassiumTest() {
        super(TEST_NAME);
    }
}
