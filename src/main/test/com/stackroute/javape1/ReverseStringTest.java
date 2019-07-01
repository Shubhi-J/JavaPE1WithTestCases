package com.stackroute.javape1;

import org.junit.*;

import static org.junit.Assert.*;

public class ReverseStringTest {
    ReverseString objReverseString;

    @Before
    public void setUp() {
        objReverseString = new ReverseString();
    }
    @After
    public void tearDown () {
        objReverseString = null;
    }

    @BeforeClass
    public static void setUpBeforeClass(){}
    @AfterClass
    public static void tearDownAfterClass (){}


    @Test
    public void givenCharacterStringShouldReturnReverseString() {
        //arrange

        //act
        String result=objReverseString.reverseString("london");

        //assert
        assertEquals("nodnol",result);
    }

    @Test
    public void givenIntegerStringShouldReturnReverseString() {
        //arrange

        //act
        String result=objReverseString.reverseString("123456789");

        //assert
        assertEquals("987654321",result);

    }
    @Test
    public void givenNullShouldReturnNull() {
        //arrange

        //act
        //act
        String result=objReverseString.reverseString(null);

        //assert
        assertNull("null not allowed",result);
    }
    @Test
    public void givenZeroShouldReturnZero() {
        //arrange

        //act
        String result=objReverseString.reverseString("0");

        //assert
        assertEquals("0",result);
    }
    @Test
    public void givenAlphaNumericStringShouldReturnReverseString() {
        //arrange

        //act
        String result=objReverseString.reverseString("123qwertyuiopasdfghjklzxcvbnm123");

        //assert
        assertEquals("321mnbvcxzlkjhgfdsapoiuytrewq321",result);
    }

}