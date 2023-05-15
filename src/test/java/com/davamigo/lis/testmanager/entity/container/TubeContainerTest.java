package com.davamigo.lis.testmanager.entity.container;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author david.amigo
 */
@SpringBootTest
public class TubeContainerTest {

    @Test
    public void testConstructorSetsTheContainerType() {
        final Container container = new TubeContainer(null, null);
        Assertions.assertEquals("tube", container.getContainerType());
    }
}
