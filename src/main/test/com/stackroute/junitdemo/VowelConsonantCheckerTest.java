package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class VowelConsonantCheckerTest {
    VowelConsonantChecker objVowelConsonantChecker;

    @Before
    public void setUp() {
        System.out.println("Before");
        objVowelConsonantChecker = new VowelConsonantChecker();
    }
    @After
    public void tearDown () {
        System.out.println("After");
        objVowelConsonantChecker = null;
    }

    @BeforeClass
    public static void setUpBeforeClass()
    {
        System.out.println("BeforeClass");
    }
    @AfterClass
    public static void tearDownAfterClass ()
    {
        System.out.println("AfterClass");
    }


    @Test
    public void givenStringShouldReturnVowelConsonant() {
        //arrange

        //act
        String result=objVowelConsonantChecker.vowelConsonantChecker("abEiddd");

        //assert
        assertEquals("a - Vowel b - Consonant E - Vowel i - Vowel d - Consonant d - Consonant d - Consonant ",result);
    }

    @Test
    public void givenAVowelShouldReturnVowel() {
        //arrange

        //act
        String result=objVowelConsonantChecker.vowelConsonantChecker("A");

        //assert
        assertEquals("A - Vowel ",result);

    }
    @Test
    public void givenNullShouldReturnErrorMessage() {
        //arrange

        //act
        String result=objVowelConsonantChecker.vowelConsonantChecker(null);

        //assert
        assertEquals("null not allowed",result);
    }
    @Test
    public void givenAlphaNumericStringShouldReturnConsonantVowelNotAnAlphabet() {
        //arrange

        //act
        String result=objVowelConsonantChecker.vowelConsonantChecker("UG8");

        //assert
        assertEquals("U - Vowel G - Consonant 8 - not an alphabet ",result);
    }
}