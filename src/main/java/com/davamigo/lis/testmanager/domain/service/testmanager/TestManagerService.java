package com.davamigo.lis.testmanager.domain.service.testmanager;

import com.davamigo.lis.testmanager.domain.entity.order.Order;
import com.davamigo.lis.testmanager.domain.entity.sample.Sample;
import com.davamigo.lis.testmanager.domain.dto.testresult.ErrorTestResult;
import com.davamigo.lis.testmanager.domain.dto.testresult.TestResult;
import com.davamigo.lis.testmanager.domain.service.operation.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author david.amigo
 */
@Service
public class TestManagerService implements TestManager {

    final Collection<Operation> operations;

    @Autowired
    public TestManagerService(Collection<Operation> operations) {
        this.operations = operations;
    }

    @Override
    public Collection<TestResult> performOrder(Order order) {
        final Sample sample = order.getSample();
        final Collection<TestResult> results = new ArrayList<>();
        order.getTests().forEach(test -> {
            final Collection<TestResult> res = new ArrayList<>();
            operations.forEach(operation -> {
                if (operation.isApplicable(test, sample)) {
                    final TestResult testResult = operation.performTest(test, sample);
                    res.add(testResult);
                }
            });
            if (res.isEmpty()) {
                final String msg = "No operations found for this test and sample";
                res.add(new ErrorTestResult(test, sample, msg));
            }
            results.addAll(res);
        });
        return results;
    }
}
