package com.davamigo.lis.testmanager.application.usecases;

import com.davamigo.lis.testmanager.domain.dto.testresult.TestResult;
import com.davamigo.lis.testmanager.domain.entity.order.Order;
import com.davamigo.lis.testmanager.domain.service.testmanager.TestManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * @author david.amigo
 */
@Service
public class PerformOrderTestsUseCase {

    private final TestManager testManager;

    @Autowired
    public PerformOrderTestsUseCase(TestManager testManager) {
        this.testManager = testManager;
    }

    public Collection<TestResult> performOrder(Order order) {
        return testManager.performOrder(order);
    }
}
