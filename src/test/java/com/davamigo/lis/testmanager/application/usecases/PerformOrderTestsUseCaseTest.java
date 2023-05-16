package com.davamigo.lis.testmanager.application.usecases;

import com.davamigo.lis.testmanager.domain.entity.order.Order;
import com.davamigo.lis.testmanager.domain.service.testmanager.TestManager;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author david.amigo
 */
@SpringBootTest
public class PerformOrderTestsUseCaseTest {

    @Mock
    private TestManager testManagerMock;

    @Test
    public void testPerformOrderCallsTestManagerPerformOrder() {

        final PerformOrderTestsUseCase useCase = new PerformOrderTestsUseCase(testManagerMock);

        final Order order = Mockito.mock(Order.class);
        useCase.performOrder(order);

        Mockito.verify(testManagerMock, Mockito.times(1)).performOrder(order);
    }
}
