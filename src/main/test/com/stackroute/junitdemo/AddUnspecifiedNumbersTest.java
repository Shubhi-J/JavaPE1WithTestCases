package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class AddUnspecifiedNumbersTest {
    AddUnspecifiedNumbers objAddUnspecifiedNumbers;

    @Before
    public void setUp() {
        System.out.println("Before");
        objAddUnspecifiedNumbers = new AddUnspecifiedNumbers();
    }
    @After
    public void tearDown () {
        System.out.println("After");
        objAddUnspecifiedNumbers = null;
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
    public void givenFiveNumbersShouldReturnSum() {
        //arrange

        //act
        String result=objAddUnspecifiedNumbers.addUnspecifiedNumbers(new String[] {"2","4","5","4","0"});

        //assert
        assertEquals("The sum is 15",result);
    }

    @Test
    public void given1NumbersShouldReturnSum() {
        //arrange

        //act
        String result=objAddUnspecifiedNumbers.addUnspecifiedNumbers(new String[] {"2", "0"});

        //assert
        assertEquals("The sum is 2",result);
    }

    @Test
    public void givenStringShouldReturnErrorMessage() {
        //arrange

        //act
        String result=objAddUnspecifiedNumbers.addUnspecifiedNumbers(new String[] {"u", "4", "5", "4", "0"});

        //assert
        assertEquals("Please enter integer input",result);
    }

}