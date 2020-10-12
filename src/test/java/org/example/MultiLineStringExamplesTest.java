package org.example;

import org.junit.Before;
import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.Assert.*;

public class MultiLineStringExamplesTest
{
    private static final Logger LOGGER = Logger.getLogger(MultiLineStringExamplesTest.class.getName());

    private MultiLineStringExamples app;

    @Before
    public void setup() {
        app = new MultiLineStringExamples();
    }

    @Test
    public void multiLineStringExampleTest()
    {
        String message = app.multiLineStringExample();
        assertNotNull(message);
        LOGGER.info("multiLineStringExampleTest :" + message);
    }

    @Test
    public void multiLineStringExampleWithPlaceHoldersTest()
    {
        String message = app.multiLineStringExampleWithPlaceHolders("Hello World",10,0.2f);
        assertNotNull(message);
        LOGGER.info("multiLineStringExampleWithPlaceHolders :" + message);
    }

    @Test
    public void greetingExampleTest()
    {
        String message = app.greetingExample("Alice");
        assertNotNull(message);
        LOGGER.info("greetingExampleTest :" + message);
    }

    @Test
    public void emailTemplateTest()
    {
        String message = app.emailTemplate("Alice","12th October 2020", "Java World");
        assertNotNull(message);
        LOGGER.info("emailTemplateTest :" + message);
    }
}
