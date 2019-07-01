package com.stackroute.javape1;

public class ForLoopPattern {
    public String forLoopPattern(int loopVariable) {
        String outputString = "";
        // print pattern only if number is greater than zero
        if(loopVariable>0){
            for (int outerLoopIndex = 1; outerLoopIndex <= loopVariable; outerLoopIndex++) {
                for (int innerLoopIndex = 1; innerLoopIndex <= outerLoopIndex; innerLoopIndex++) {
                    // print the n number n times
                    outputString = outputString+ Integer.toString(outerLoopIndex);
                }
            }

        } else {
            // if input number is 0
            outputString = "zero not allowed";
        }
        return outputString;
    }
}