package com.davamigo.lis.testmanager.entity.sampletype;

import lombok.Getter;

/**
 * @author david.amigo
 */
@Getter
public class BloodSampleType extends SampleType {

    private static final String SAMPLE_TYPE = "blood";

    public BloodSampleType() {
        super(SAMPLE_TYPE);
    }
}
