package com.davamigo.lis.testmanager.domain.entity.clinicaltest;

import lombok.Getter;
import lombok.Setter;

/**
 * @author david.amigo
 */
@Getter
@Setter
public class SodiumTest extends BiochemistryTestType {

    private static final String TEST_NAME = "sodium";

    //private String testPropA;
    //private String testPropB;
    //private String testPropC;

    public SodiumTest() {
        super(TEST_NAME);
    }
}
