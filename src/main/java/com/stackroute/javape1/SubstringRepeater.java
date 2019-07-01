package com.stackroute.javape1;

public class SubstringRepeater {
    public String substringRepeater(String inputString,int inputNum){
        String outputString="";
        // Calculate length of input string
        int inputStringLength = inputString.length();
        // Check whether the number given is less than length of input string
        if (inputNum <= inputStringLength) {
            //    for (int outerLoopIndex = inputStringLength - 1; outerLoopIndex >= inputStringLength - inputNum; outerLoopIndex--) {
            // run the loop for n number of times which is entered by the user
            for (int outerLoopIndex = 0; outerLoopIndex < inputNum; outerLoopIndex++) {
                for (int innerLoopIndex = inputStringLength - inputNum; innerLoopIndex < inputStringLength; innerLoopIndex++) {
                    // print the last n characters of the string
                    inputString = inputString + inputString.charAt(innerLoopIndex);
                }
            }
            outputString=outputString + inputString;
        } else {
            outputString="Input number cannot be greater than the string size";
        }
        return outputString;
    }
}
