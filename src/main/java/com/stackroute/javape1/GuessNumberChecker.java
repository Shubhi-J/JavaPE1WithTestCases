package com.stackroute.javape1;

public class GuessNumberChecker {
        public String guessedNumberChecker(int guessedNum) {
            // let the original number is 38
            int originalNumber= 38;
            String outputMsg="";
            // check if the guessed number is in range, i.e 1 to 50
            if (guessedNum >= 1 && guessedNum <= 50) {
                // check if the guessed number is greater than original number
                if(guessedNum>originalNumber) {
                    outputMsg="Number guessed is greater than the original number";
                // check if the guessed number is less than original number
                } else if(guessedNum<originalNumber) {
                    outputMsg="Number guessed is less than the original number";
                // check if the guessed number is equal to original number
                } else {
                    outputMsg="Number guessed matches the original number";
                }
            } else {
                //if the guessed number is not in range
                outputMsg="The guessed number is out to range(that is 1 to 50)";
            }
            return outputMsg;
        }

}
