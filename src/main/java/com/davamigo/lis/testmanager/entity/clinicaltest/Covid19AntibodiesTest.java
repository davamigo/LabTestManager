package com.davamigo.lis.testmanager.entity.clinicaltest;

import lombok.Getter;
import lombok.Setter;

/**
 * @author david.amigo
 */
@Getter
@Setter
public class Covid19AntibodiesTest extends ImmunologyTestType {

    private static final String TEST_NAME = "covid_19_antibodies";

    //private String testPropA;
    //private String testPropB;
    //private String testPropC;

    public Covid19AntibodiesTest() {
        super(TEST_NAME);
    }
}
