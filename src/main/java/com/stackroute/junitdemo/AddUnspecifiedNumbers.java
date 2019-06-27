package com.stackroute.junitdemo;

import java.util.Scanner;

public class AddUnspecifiedNumbers {
    public String addUnspecifiedNumbers(String[] inputArray) {
        String outputMsg="";
        try {
            int sum = 0,loopIndex=0;
                while (Integer.parseInt(inputArray[loopIndex]) != 0) {
                    sum = sum + Integer.parseInt(inputArray[loopIndex]);
                    loopIndex++;
                }
                outputMsg="The sum is "+ sum;
            } catch (Exception e) {
                outputMsg="Please enter integer input";
            }
        return outputMsg;
    }
}

