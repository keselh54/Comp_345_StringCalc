package edu.ithaca.kesel;

public class StringCalculatorImpl implements StringCalculator {

    @Override
    public int add(String stringOfNumbers){

        //If there are no items in the string
        if(stringOfNumbers == null || stringOfNumbers.isEmpty()){
            return 0;
        }



        //If there is 1 item in the string.
        if(stringOfNumbers.matches("-?\\d?\\d?\\d?\\d")){

            String[] stringArray = stringOfNumbers.split(",");

            return Integer.valueOf(stringArray[0]);
        }








        return -1;
    }

}
