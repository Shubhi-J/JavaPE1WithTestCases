package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class LetterDigitSymbolCheckerTest {
        LetterDigitSymbolChecker objLetterDigitSymbolChecker;

        @Before
        public void setUp() {
            System.out.println("Before");
            objLetterDigitSymbolChecker = new LetterDigitSymbolChecker();
        }
        @After
        public void tearDown () {
            System.out.println("After");
            objLetterDigitSymbolChecker = null;
        }

        @BeforeClass
        public static void setUpBeforeClass() {
            System.out.println("BeforeClass");
        }
        @AfterClass
        public static void tearDownAfterClass () {
            System.out.println("AfterClass");
        }


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