package edu.ithaca.kesel;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    StringCalculator myFunc = new StringCalculatorImpl();

    @org.junit.jupiter.api.Test
    void testEmptyString() {

        //First Test Case: If no values are in the string.
        //Create an empty string.
        String emptyString = "";
        //Run the add function with the empty string
        int testInt = myFunc.add(emptyString);
        //Test to see if the function returned what should be expected. This case I expect a sum of 0 to be returned.
        assertEquals(0, testInt);

    }

    @org.junit.jupiter.api.Test
    void testStringWithOneNumber(){

    //Second test case: if there is 1 item in the string
        //Create a string of 1 item
            //Make several different strings of 1 item, whee each string has a different item in it.

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


    @org.junit.jupiter.api.Test
    void testForStringWithTwoNumbers(){

        //Test if 2 numbers work that are the same.
        String test = "1,1";
        int testInt = myFunc.add(test);
        assertEquals(2, testInt);

        //Test if negative and positive numbers work
        String test2 = "1,-1";
        int testInt2 = myFunc.add(test2);
        assertEquals(0, testInt2);

        //Test if negative and positive numbers work
        String test3 = "-1,1";
        int testInt3 = myFunc.add(test3);
        assertEquals(0, testInt3);

        //Test if multiple digit numbers work
        String test4 = "10,100";
        int testInt4 = myFunc.add(test4);
        assertEquals(110, testInt4);

        //Test if negative and positive multi-digit numbers work
        String test5 = "100,-10";
        int testInt5 = myFunc.add(test5);
        assertEquals(90, testInt5);

        //Test if "empty" second digit works
        String test6 = "1,";
        int testInt6 = myFunc.add(test6);
        assertEquals(1, testInt6);

    }


    @org.junit.jupiter.api.Test
    void testForStringWithMultipleNumbers(){

        //Test if 5 numbers work that are the same.
        String test = "1,1,1,1,1";
        int testInt = myFunc.add(test);
        assertEquals(5, testInt);

        //Test if negative and positive numbers work
        String test2 = "1,-1,1,-1,1,-1";
        int testInt2 = myFunc.add(test2);
        assertEquals(0, testInt2);

        //Test if negative and positive numbers work
        String test3 = "1,1,1,1,-1,-1,-1,-1,-1";
        int testInt3 = myFunc.add(test3);
        assertEquals(-1, testInt3);

        //Test if multiple digit numbers work
        String test4 = "10,100,-10";
        int testInt4 = myFunc.add(test4);
        assertEquals(100, testInt4);

        //Test if negative and positive multi-digit numbers work
        String test5 = "100,-10,-100";
        int testInt5 = myFunc.add(test5);
        assertEquals(-10, testInt5);

        //Test if "empty" last digit works
        String test6 = "1,2,3,";
        int testInt6 = myFunc.add(test6);
        assertEquals(6, testInt6);

    }


}