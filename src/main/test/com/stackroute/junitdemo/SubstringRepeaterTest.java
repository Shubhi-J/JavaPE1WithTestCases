package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class SubstringRepeaterTest {
    SubstringRepeater objSubstringRepeater;

    @Before
    public void setUp() {
        System.out.println("Before");
        objSubstringRepeater = new SubstringRepeater();
    }
    @After
    public void tearDown () {
        System.out.println("After");
        objSubstringRepeater = null;
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
    public void givenStringShouldReturnRepeatedString() {
        //arrange

        //act
        String result=objSubstringRepeater.substringRepeater("Hello",2);

        //assert
        assertEquals("Hellololo",result);
    }

    @Test
    public void givenNumericStringShouldReturnRepeatedNumericString() {
        //arrange

        //act
        String result=objSubstringRepeater.substringRepeater("12345",1);

        //assert
        assertEquals("123455",result);
    }

    @Test
    public void givenStringAndNumberOutOfRangeShouldReturnErrorMessage() {
        //arrange

        //act
        String result=objSubstringRepeater.substringRepeater("12345",6);

        //assert
        assertEquals("Input number cannot be greater than the string size",result);
    }
}