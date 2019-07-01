package com.stackroute.javape1;

public class ReverseString {
    public String reverseString(String inputString) {
        String outputString="";
        // check if the input string is null
        if(inputString!=null) {
        // run reverse for loop to print the reverse number
        for(int loopIndex=inputString.length()-1;loopIndex>=0;loopIndex--) {
            outputString= outputString+ inputString.charAt(loopIndex);
        }
        // if input number is same as the reverse string,it means input string is palindrome
        if(inputString.equals(outputString)) {
            outputString = outputString + " true";
        } else {
            outputString = outputString + " false";
        }
        } else {
            // if input string is null, return null
            outputString=null;
        }

        return outputString;
    }
}
