package com.stackroute.javape1;

public class VowelConsonantChecker {

    public String vowelConsonantChecker(String inputString) {
        int loopIndex=0;
        String outputMsg="";

        // check if input string is null
        if(inputString != null) {
            for(loopIndex=0;loopIndex<inputString.length();loopIndex++) {
                // convert input string to character array
                char ch[]=inputString.toCharArray();
                // check if the character is a vowel
                if(ch[loopIndex]=='a'||ch[loopIndex]=='e'||ch[loopIndex]=='i'||ch[loopIndex]=='o'||ch[loopIndex]=='u'||ch[loopIndex]=='A'||
                        ch[loopIndex]=='E'||ch[loopIndex]=='I'||ch[loopIndex]=='O'||ch[loopIndex]=='U')
                {
                    outputMsg=outputMsg+ ch[loopIndex]+" - Vowel ";
                }
                // check if the character is a consonant
                else if((ch[loopIndex]>='a'&&ch[loopIndex]<='z')||(ch[loopIndex]>='A'&&ch[loopIndex]<='Z'))
                    outputMsg=outputMsg+ ch[loopIndex]+" - Consonant ";
                else
                    // check if the character is not an alphabet
                    outputMsg=outputMsg+ ch[loopIndex]+" - not an alphabet ";
            }
        } else {
            // check if input is null,return null
            outputMsg= null;
        }
        return outputMsg;
    }
}
