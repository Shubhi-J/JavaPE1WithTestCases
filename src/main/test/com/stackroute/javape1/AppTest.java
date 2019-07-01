package com.stackroute.javape1;

import org.junit.*;

import static org.junit.Assert.*;

public class AppTest {
    App app;

    @Before
    public void setUp() {
        System.out.println("Before");
        app = new App();
    }
    @After
    public void tearDown () {
        System.out.println("After");
        app = null;
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
    public void givenTwoStringShouldReturnConcatanatedUpperString() {
        //arrange

        //act
        String result=app.concatAndConvertString("SHUBHI","JAIN");

        //assert
        assertEquals("SHUBHIJAIN",result);
        }

    @Test
    public void givenTwoNullShouldReturnErrorMessage() {
        //arrange

        //act
        String result=app.concatAndConvertString(null,null);

        //assert
        assertEquals("null not allowed",result);
    }
    @Test
    public void givenOneNullOneStringShouldReturnErrorMessage() {
        //arrange

        //act
        String result=app.concatAndConvertString(null,null);

        //assert
        assertEquals("null not allowed",result);
    }
    @Test
    public void givenOneEmptyStringOneNumericStringShouldReturnNumericString() {
        //arrange

        //act
        String result=app.concatAndConvertString("","1233");

        //assert
        assertEquals("1233",result);
    }
}