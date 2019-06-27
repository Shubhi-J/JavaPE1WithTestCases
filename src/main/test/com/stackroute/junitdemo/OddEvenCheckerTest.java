package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class OddEvenCheckerTest {
    OddEvenChecker objOddEvenChecker;

    @Before
    public void setUp() {
        System.out.println("Before");
        objOddEvenChecker = new OddEvenChecker();
    }
    @After
    public void tearDown () {
        System.out.println("After");
        objOddEvenChecker = null;
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
    public void givenOutOfRangeShouldReturnErrorMessage() {
        //arrange

        //act
        String result=objOddEvenChecker.oddEvenChecker(50);

        //assert
        assertEquals("Number is not between 20 and 30",result);
    }

    @Test
    public void givenOddNumberInRangeShouldReturnTom() {
        //arrange

        //act
        String result=objOddEvenChecker.oddEvenChecker(23);

        //assert
        assertEquals("Tom",result);

    }
    @Test
    public void givenEvenNumberInRangeShouldReturnJerry() {
        //arrange

        //act
        //act
        String result=objOddEvenChecker.oddEvenChecker(28);

        //assert
        assertEquals("Jerry",result);
    }
    @Test
    public void givenZeroShouldReturnErrorMessage() {
        //arrange

        //act
        String result=objOddEvenChecker.oddEvenChecker(0);

        //assert
        assertEquals("Number is not between 20 and 30",result);
    }
    @Test
    public void givenSpaceShouldReturnErrorMessage() {
        //arrange

        //act
        String result=objOddEvenChecker.oddEvenChecker(' ');

        //assert
        assertEquals("Number is not between 20 and 30",result);
    }
}