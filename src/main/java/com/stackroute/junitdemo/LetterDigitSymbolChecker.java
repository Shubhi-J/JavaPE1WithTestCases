package com.stackroute.junitdemo;

import java.util.Scanner;

public class LetterDigitSymbolChecker {

    public String letterDigitSymbolChecker(char key) {
        String outputMsg="";
        int intKey=(int)key;
        if(intKey >= 97 && intKey <=122) {
            outputMsg="small letter";
        } else if (intKey >= 65 && intKey <=90) {
            outputMsg="capital letter";
        } else if (intKey >= 48 && intKey <=57) {
            outputMsg="digit";
        } else {
            outputMsg="special symbol";
        }
        return outputMsg;
    }
    }

