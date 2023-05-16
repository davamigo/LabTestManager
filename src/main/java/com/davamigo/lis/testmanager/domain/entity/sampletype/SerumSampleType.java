package com.davamigo.lis.testmanager.domain.entity.sampletype;

import lombok.Getter;

/**
 * @author david.amigo
 */
@Getter
public class SerumSampleType extends SampleType {

    private static final String SAMPLE_TYPE = "serum";

    public SerumSampleType() {
        super(SAMPLE_TYPE);
    }
}
