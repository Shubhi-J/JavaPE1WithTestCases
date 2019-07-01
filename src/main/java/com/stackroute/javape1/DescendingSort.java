package com.stackroute.javape1;

import java.util.Arrays;

public class DescendingSort {

    public String descendingSort(String inputNum) {
        String outputMsg = "";
        try {
            int sumOfEvenDigits = 0;
            // convert input string to character array
            char ch[] = inputNum.toCharArray();
            // sort the character array
            Arrays.sort(ch);
            // return sorted array in descending manner
            for (int loopIndex = ch.length - 1; loopIndex >= 0; loopIndex--) {
                int arrayIntElement = Character.getNumericValue(ch[loopIndex]);
                outputMsg = outputMsg + arrayIntElement;
                // if number is even then add the numbers
                if (arrayIntElement % 2 == 0) {
                    sumOfEvenDigits = sumOfEvenDigits + arrayIntElement;
                }
            }
            outputMsg = outputMsg + " The sum is " + sumOfEvenDigits;
            // check if number is greater than 15
            if (sumOfEvenDigits > 15) {
                outputMsg = outputMsg + " true";
            } else {
                outputMsg = outputMsg + " false";
            }
        } catch(Exception e) {
            // if input is null then show error message
                outputMsg=null;
            }
        return outputMsg;
        }
}
