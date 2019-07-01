package com.stackroute.javape1;

public class OddEvenChecker {
        public String oddEvenChecker(int num){
            String outputMsg="";
            // check if number is between 20 and 30
            if(num >=20 && num <=30) {
                // if number is odd, print tom
                if (num % 2 != 0) {
                    outputMsg="Tom";
                } else {
                    // if number is even, print jerry
                    outputMsg="Jerry";
                }
            } else {
                outputMsg="Number is not between 20 and 30";
            }
            return outputMsg;
        }
}
