package com.davamigo.lis.testmanager.domain.service.testmanager;

import com.davamigo.lis.testmanager.domain.entity.order.Order;
import com.davamigo.lis.testmanager.domain.dto.testresult.TestResult;

import java.util.Collection;

/**
 * @author david.amigo
 */
public interface TestManager {

    Collection<TestResult> performOrder(Order order);
}
