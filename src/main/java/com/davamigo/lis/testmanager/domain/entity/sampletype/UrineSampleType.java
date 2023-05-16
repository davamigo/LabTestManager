package com.davamigo.lis.testmanager.domain.entity.sampletype;

import lombok.Getter;

/**
 * @author david.amigo
 */
@Getter
public class UrineSampleType extends SampleType {

    private static final String SAMPLE_TYPE = "urine";

    public UrineSampleType() {
        super(SAMPLE_TYPE);
    }
}
