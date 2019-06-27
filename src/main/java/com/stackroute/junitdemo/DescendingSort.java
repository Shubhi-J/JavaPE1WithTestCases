package com.stackroute.junitdemo;

import java.util.Arrays;
import java.util.Scanner;

public class DescendingSort {

    public String descendingSort(String inputNum) {
        String outputMsg = "";
        try {
            int sumOfEvenDigits = 0;
            char ch[] = inputNum.toCharArray();
            Arrays.sort(ch);
            for (int i = ch.length - 1; i >= 0; i--) {
                int arrayIntElement = Character.getNumericValue(ch[i]);
                outputMsg = outputMsg + arrayIntElement;
                if (arrayIntElement % 2 == 0) {
                    sumOfEvenDigits = sumOfEvenDigits + arrayIntElement;
                }
            }
            outputMsg = outputMsg + " The sum is " + sumOfEvenDigits;
            if (sumOfEvenDigits > 15) {
                outputMsg = outputMsg + " true";
            } else {
                outputMsg = outputMsg + " false";
            }
        } catch(Exception e) {
                outputMsg="null not allowed";
            }
        return outputMsg;
        }
}
