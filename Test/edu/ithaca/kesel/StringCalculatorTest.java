package edu.ithaca.kesel;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    StringCalculator myFunc = new StringCalculatorImpl();

    @org.junit.jupiter.api.Test
    void testStringCalculator(){

    //First Test Case: If no values are in the string.
        //Create an empty string.

        String emptyString = "";

        int testInt = myFunc.add(emptyString);

        assertEquals(0, testInt);

    }

}