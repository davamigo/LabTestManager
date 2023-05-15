package com.davamigo.lis.testmanager.service.testmanager;

import com.davamigo.lis.testmanager.entity.order.Order;
import com.davamigo.lis.testmanager.dto.testresult.TestResult;

import java.util.Collection;

/**
 * @author david.amigo
 */
public interface TestManager {

    Collection<TestResult> performOrder(Order order);
}
