package com.stackroute.javape1;

public class AddUnspecifiedNumbers {
    public String addUnspecifiedNumbers(String[] inputArray) {
        String outputMsg="";
        try {
            int sum = 0,loopIndex=0;
            // check until 0 is input
                while (Integer.parseInt(inputArray[loopIndex]) != 0) {
                    // add all numbers entered by user
                    sum = sum + Integer.parseInt(inputArray[loopIndex]);
                    loopIndex++;
                }
                outputMsg="The sum is "+ sum;
            } catch (Exception e) {
            // if input is not integer give error message
                outputMsg="Please enter integer input";
            }
        return outputMsg;
    }
}

