package com.stackroute.javape1;

import org.junit.*;

import static org.junit.Assert.*;

public class SubstringRepeaterTest {
    SubstringRepeater objSubstringRepeater;

    @Before
    public void setUp() {
        objSubstringRepeater = new SubstringRepeater();
    }
    @After
    public void tearDown () {
        objSubstringRepeater = null;
    }

    @BeforeClass
    public static void setUpBeforeClass(){}
    @AfterClass
    public static void tearDownAfterClass (){}


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