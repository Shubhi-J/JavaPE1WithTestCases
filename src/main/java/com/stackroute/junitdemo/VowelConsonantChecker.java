package com.stackroute.junitdemo;

import java.util.Scanner;

public class VowelConsonantChecker {

    public String vowelConsonantChecker(String inputString) {
        int loopIndex=0;
        String outputMsg="";
        if(inputString != null) {
            for(loopIndex=0;loopIndex<inputString.length();loopIndex++) {
                char ch[]=inputString.toCharArray();
                if(ch[loopIndex]=='a'||ch[loopIndex]=='e'||ch[loopIndex]=='i'||ch[loopIndex]=='o'||ch[loopIndex]=='u'||ch[loopIndex]=='A'||
                        ch[loopIndex]=='E'||ch[loopIndex]=='I'||ch[loopIndex]=='O'||ch[loopIndex]=='U')
                {
                    outputMsg=outputMsg+ ch[loopIndex]+" - Vowel ";
                }
                else if((ch[loopIndex]>='a'&&ch[loopIndex]<='z')||(ch[loopIndex]>='A'&&ch[loopIndex]<='Z'))
                    outputMsg=outputMsg+ ch[loopIndex]+" - Consonant ";
                else
                    outputMsg=outputMsg+ ch[loopIndex]+" - not an alphabet ";
            }
        } else {
            outputMsg= "null not allowed";
        }

        return outputMsg;
    }

}
