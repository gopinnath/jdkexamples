package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class MultiLineStringExamples
{

    // 1. Simple Text Block
    public String multiLineStringExample()
    {
        return """
            New Hello World
            Multi Line Comments
            with NewLine Character
        """;
    }

    // 2. Text Block with Expression
    public String multiLineStringExampleWithPlaceHolders(Object... args)
    {
        return """
            Repeat %s 
            %d Time
            at %f rate 
        """.formatted(args);
    }

    // 3. Text Block with Replace Expression
    public String greetingExample(String name)
    {
        return """
            Hello $name, Welcome to my tutorial.
        """.replace("$name",name);
    }

    // 4. Text Block with Quotes inside
    public String emailTemplate(Object... args)
    {
        return """
        Hello %s ,
        
            This is to let you know that your subscription 
        for 'Newsletter on "Java"' has been activate as of "%s".
        
        Yours,
        %s 
        """.formatted(args);
    }
}
