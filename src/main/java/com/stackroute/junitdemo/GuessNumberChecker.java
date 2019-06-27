package com.stackroute.junitdemo;

import java.util.Scanner;

public class GuessNumberChecker {
        public String guessedNumberChecker(int guessedNum) {
            int originalNumber= 38;
            String outputMsg="";
            if (guessedNum >= 1 && guessedNum <= 50) {
                if(guessedNum>originalNumber) {
                    outputMsg="Number guessed is greater than the original number";
                } else if(guessedNum<originalNumber) {
                    outputMsg="Number guessed is less than the original number";
                } else {
                    outputMsg="Number guessed matches the original number";
                }
            } else {
                outputMsg="The guessed number is out to range(that is 1 to 50)";
            }
            return outputMsg;
        }

}
