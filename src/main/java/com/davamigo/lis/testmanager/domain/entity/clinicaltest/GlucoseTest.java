package com.davamigo.lis.testmanager.domain.entity.clinicaltest;

import lombok.Getter;
import lombok.Setter;

/**
 * @author david.amigo
 */
@Getter
@Setter
public class GlucoseTest extends BiochemistryTestType {

    private static final String TEST_NAME = "glucose";

    //private String testPropA;
    //private String testPropB;
    //private String testPropC;

    public GlucoseTest() {
        super(TEST_NAME);
    }
}
