package com.stackroute.junitdemo;

import java.util.Scanner;

public class SubstringRepeater {
    public String substringRepeater(String inputString,int inputNum){
        String outputString="";
        int inputStringLength = inputString.length();
        if (inputNum <= inputStringLength) {
            //    for (int outerLoopIndex = inputStringLength - 1; outerLoopIndex >= inputStringLength - inputNum; outerLoopIndex--) {
            for (int outerLoopIndex = 0; outerLoopIndex < inputNum; outerLoopIndex++) {
                for (int innerLoopIndex = inputStringLength - inputNum; innerLoopIndex < inputStringLength; innerLoopIndex++) {
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
