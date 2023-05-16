package com.davamigo.lis.testmanager.domain.entity.order;

import com.davamigo.lis.testmanager.domain.entity.sample.Sample;
import com.davamigo.lis.testmanager.domain.entity.clinicaltest.ClinicalTest;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Collection;
import java.util.UUID;

/**
 * @author david.amigo
 */
@Getter
@AllArgsConstructor
public class Order {
    private UUID uuid;
    private Sample sample;
    private Collection<ClinicalTest> tests;
}
