package com.stackroute.javape1;

import org.junit.*;

import static org.junit.Assert.*;

public class LetterDigitSymbolCheckerTest {
        LetterDigitSymbolChecker objLetterDigitSymbolChecker;

        @Before
        public void setUp() {
            objLetterDigitSymbolChecker = new LetterDigitSymbolChecker();
        }
        @After
        public void tearDown () {
            objLetterDigitSymbolChecker = null;
        }

        @BeforeClass
        public static void setUpBeforeClass(){}
        @AfterClass
        public static void tearDownAfterClass (){}


        @Test
        public void givenCapitalLetterShouldReturnCapitalLetterMessage() {
            //arrange

            //act
            String result=objLetterDigitSymbolChecker.letterDigitSymbolChecker('A');

            //assert
            assertEquals("capital letter",result);
        }

        @Test
        public void givenSmallLetterShouldReturnSmallLetterMessage() {
            //arrange

            //act
            String result=objLetterDigitSymbolChecker.letterDigitSymbolChecker('s');

            //assert
            assertEquals("small letter",result);

        }
        @Test
        public void givenDigitShouldReturnDigitMessage() {
            //arrange

            //act
            String result=objLetterDigitSymbolChecker.letterDigitSymbolChecker('5');

            //assert
            assertEquals("digit",result);
        }
        @Test
        public void givenSpecialSymbolShouldReturnSpecialSymbolMessage() {
            //arrange

            //act
            String result=objLetterDigitSymbolChecker.letterDigitSymbolChecker('&');

            //assert
            assertEquals("special symbol",result);
        }
        @Test
        public void givenSpaceShouldReturnSpecialSymbolMessage() {
        //arrange

        //act
        String result=objLetterDigitSymbolChecker.letterDigitSymbolChecker(' ');

        //assert
        assertEquals("special symbol",result);
    }
}