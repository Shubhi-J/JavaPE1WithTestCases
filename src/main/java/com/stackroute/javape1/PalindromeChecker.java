package com.stackroute.javape1;

public class PalindromeChecker {

    public static String palindromeChecker(int inputNum) {
        String outputMsg="";
        try{
        int remainder,sum=0,temp,r=0,sumOfEvenDigits=0;
        //inputNum is the number variable to be checked for palindrome

        temp=inputNum;
            while(inputNum>0){
        remainder=inputNum%10;  //getting remainder
        sum=(sum*10)+remainder;
        inputNum=inputNum/10;
        }
        // check if reverse number is same as input number
        if(temp==sum) {
        // calculate sum of even digits
        while (temp > 0) {
            r = temp % 10;
            if (r % 2 == 0) {
                sumOfEvenDigits = sumOfEvenDigits + r;
            }
            temp = temp / 10;
        }
        // check if sum of even digits is greater than 25
        if (sumOfEvenDigits < 25) {
        outputMsg=  "Given number is a palindrome number and sum of even numbers is less than 25";
        } else {
        outputMsg= "Given number is a palindrome number and sum of even numbers is greater than 25";
        }
        }
        else
        outputMsg= "Given number is not palindrome";
        } catch (Exception e) {
          outputMsg= "only integer input allowed";
        }
        return outputMsg;
    }
}

