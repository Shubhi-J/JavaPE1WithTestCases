package com.stackroute.junitdemo;

import java.util.Scanner;

public class OddEvenChecker {
        public String oddEvenChecker(int num){
            String outputMsg="";
            if(num >=20 && num <=30) {
                if (num % 2 != 0) {
                    outputMsg="Tom";
                } else {
                    outputMsg="Jerry";
                }
            } else {
                outputMsg="Number is not between 20 and 30";
            }
            return outputMsg;
        }
}
