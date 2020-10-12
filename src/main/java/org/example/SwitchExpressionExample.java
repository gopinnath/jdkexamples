package org.example;

public class SwitchExpressionExample {

    // 1. Value Yield
    public Integer getDaySequenceOfWeek(String dayOfWeek)    {
        return switch (dayOfWeek)   {
            case "Sunday" : yield 1;
            case "Monday" : yield 2;
            case "Tuesday" : yield 3;
            case "Wednesday" : yield 4;
            case "Thursday" : yield 5;
            case "Friday" : yield 6;
            case "Saturday" : yield 7;
            default:yield 0;
        };
    }

    // 2. Arrow Function
    public String getDayOfWeek(Integer dayOfWeek)    {
        return switch (dayOfWeek)   {
            case 1 -> "Sunday";
            case 2-> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "Could Not Determine";
        };
    }

    //3. Multi Case, Multi Line Example
    public Integer calculateDeckValue(String suite,String value)    {
        return switch (value)   {
            case "Ace" -> {
                if(suite != null && suite.equals("Spade"))  {
                    yield 13;
                }
                yield 1;
            }
            case "2"-> 2;
            case "3" -> 3;
            case "4" -> 4;
            case "5" -> 5;
            case "6" -> 6;
            case "7" -> 7;
            case "8" -> 8;
            case "9" -> 9;
            case "10","Jack","Queen","King" -> 10;
            default -> 0;
        };
    }
}
