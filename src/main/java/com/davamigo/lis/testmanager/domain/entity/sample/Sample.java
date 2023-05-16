package com.davamigo.lis.testmanager.domain.entity.sample;

import com.davamigo.lis.testmanager.domain.entity.container.Container;
import com.davamigo.lis.testmanager.domain.entity.sampletype.SampleType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

/**
 * @author david.amigo
 */
@Getter
@Setter
@AllArgsConstructor
public class Sample {
    private UUID uuid;
    private SampleType sampleType;
    private Container container;
}
