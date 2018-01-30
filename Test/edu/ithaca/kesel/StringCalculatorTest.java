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
        //Run the add function with the empty string
        int testInt = myFunc.add(emptyString);
        //Test to see if the function returned what should be expected. This case I expect a sum of 0 to be returned.
        assertEquals(0, testInt);



    //Second test case: if there is 1 item in the string
        //Create a string of 1 item
            //Make several different strings of 1 item, whee each string has a different item in it.
        //Testing if " " will result in a sum of 0.
        String test1 = " ";
        int testInt1 = myFunc.add(test1);
        assertEquals(0, testInt1);

        //Testing if "," will return a sum of 0.
        String test2 = ",";
        int testInt2 = myFunc.add(test2);
        assertEquals(0, testInt2);

        //Testing if "0" will return sum of 0.
        String test3 = "0";
        int testInt3 = myFunc.add(test3);
        assertEquals(0, testInt3);

        //Testing if "-1" will return sum of -1.
        String test4 = "-1";
        int testInt4 = myFunc.add(test4);
        assertEquals(-1, testInt4);

        //Testing if "10" will return sum of 10.
        String test5 = "1";
        int testInt5 = myFunc.add(test5);
        assertEquals(1, testInt5);

        //Testing if "-10" will return sum of -10.
        String test6 = "-10";
        int testInt6 = myFunc.add(test6);
        assertEquals(-10, testInt6);

        //Testing if "10" will return sum of 10.
        String test7 = "10";
        int testInt7 = myFunc.add(test7);
        assertEquals(10, testInt7);

    }

}