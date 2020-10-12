package org.example;

import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class SwitchExpressionExampleTest {

    private static final Logger LOGGER = Logger.getLogger(SwitchExpressionExampleTest.class.getName());

    private SwitchExpressionExample app;

    @Before
    public void setup() {
        app = new SwitchExpressionExample();
    }

    @Test
    public void switchExpressionTest()  {
        Integer daySequenceOfWeek = 1;
        String dayOfTheWeek = app.getDayOfWeek(daySequenceOfWeek);
        assertEquals("Sunday",dayOfTheWeek);
        LOGGER.info("getDayOfWeek : "+ dayOfTheWeek);
        Integer resultDaySequenceOfWeek = app.getDaySequenceOfWeek(dayOfTheWeek);
        assertEquals(daySequenceOfWeek,resultDaySequenceOfWeek);
        LOGGER.info("getDaySequenceOfWeek : "+ resultDaySequenceOfWeek);

        List<String> desk = Stream.of("Ace","2","4").collect(Collectors.toList());
        Integer expectedDeckvalue = 19;
        Integer deskValue = desk.stream().map(
                                card -> app.calculateDeckValue("Spade",card)
                        ).reduce(0,Math::addExact);
        assertEquals(expectedDeckvalue,deskValue);
    }
}
