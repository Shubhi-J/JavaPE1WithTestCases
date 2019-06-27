package com.stackroute.junitdemo;

public class ReverseString {
    public String reverseString(String inputString) {
        String outputString="";
        if(inputString!=null) {
        for(int loopIndex=inputString.length()-1;loopIndex>=0;loopIndex--) {
            outputString= outputString+ inputString.charAt(loopIndex);
        }
        } else {
            outputString="null not allowed";
        }

        return outputString;
    }
}
