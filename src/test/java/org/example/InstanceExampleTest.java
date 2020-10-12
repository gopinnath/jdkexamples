package org.example;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class InstanceExampleTest {

    private InstanceExample app = new InstanceExample();

    @Test
    public void test()  {
        assertNotNull(app.determine("Hello"));
        assertNull(app.determine(100f));
    }
}
