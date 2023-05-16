package com.davamigo.lis.testmanager.domain.entity.clinicaltest;

import lombok.Getter;
import lombok.Setter;

/**
 * @author david.amigo
 */
@Getter
@Setter
public class GlycatedHaemoglobinHbA1cTest extends BiochemistryTestType {

    private static final String TEST_NAME = "glycated_haemoglobin_hba1c";

    //private String testPropA;
    //private String testPropB;
    //private String testPropC;

    public GlycatedHaemoglobinHbA1cTest() {
        super(TEST_NAME);
    }
}
