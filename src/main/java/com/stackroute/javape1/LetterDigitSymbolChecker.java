package com.stackroute.javape1;

public class LetterDigitSymbolChecker {

    public String letterDigitSymbolChecker(char key) {
        String outputMsg="";
        // convert input key to its ASCII value
        int intKey=(int)key;
        // if ascii of input is between 97 and 122, print small letter
        if(intKey >= 97 && intKey <=122) {
            outputMsg="small letter";
        // if ascii of input is between 65 and 90, print capital letter
        } else if (intKey >= 65 && intKey <=90) {
            outputMsg="capital letter";
        // if ascii of input is between 48 and 57, print digit
        } else if (intKey >= 48 && intKey <=57) {
            outputMsg="digit";
        } else {
         // else, print special symbol
            outputMsg="special symbol";
        }
        return outputMsg;
    }
    }

