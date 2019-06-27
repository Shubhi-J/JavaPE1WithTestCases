package com.stackroute.junitdemo;

public class ForLoopPattern {
    public String forLoopPattern(int loopVariable) {
        String outputString = "";
        if(loopVariable>0){
            for (int outerLoopIndex = 1; outerLoopIndex <= loopVariable; outerLoopIndex++) {
                for (int innerLoopIndex = 1; innerLoopIndex <= outerLoopIndex; innerLoopIndex++) {
                    outputString = outputString+ Integer.toString(outerLoopIndex);
                }
            }

        } else {
            outputString = "zero not allowed";
        }
        return outputString;
    }
}