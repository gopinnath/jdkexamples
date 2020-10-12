package org.example;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.logging.Logger;

public class MeaningfulNullTest {

    private static final Logger LOGGER = Logger.getLogger(MeaningfulNullTest.class.getName());

    private MeaningfulNull app;

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void testException() {
        exceptionRule.expect(NullPointerException.class);
        exceptionRule.expectMessage("org.example.MeaningfulNull.findNameLength(String)\" because \"this.app\" is null");
        app.findNameLength(null);
        exceptionRule.expectMessage("Cannot invoke \"String.length()\" because \"name\" is null");
        app = new MeaningfulNull();
        app.findNameLength(null);
    }
}
