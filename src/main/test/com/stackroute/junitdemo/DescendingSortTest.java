package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class DescendingSortTest {
    DescendingSort objDescendingSort;

    @Before
    public void setUp() {
        System.out.println("Before");
        objDescendingSort = new DescendingSort();
    }
    @After
    public void tearDown () {
        System.out.println("After");
        objDescendingSort = null;
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
    public void givenNumericStringShouldReturnDescendingStringWithSumOfEvenDigitsAndFalse() {
        //arrange

        //act
        String result=objDescendingSort.descendingSort("4254511");

        //assert
        assertEquals("5544211 The sum is 10 false",result);
    }

    @Test
    public void givenNumericStringShouldReturnDescendingStringWithSumOfEvenDigitsAndTrue() {
        //arrange

        //act
        String result=objDescendingSort.descendingSort("8258511");

        //assert
        assertEquals("8855211 The sum is 18 true",result);
    }
    @Test
    public void givenZeroShouldReturnDescendingStringWithSumOfEvenDigitsAndFalse() {
        //arrange

        //act
        String result=objDescendingSort.descendingSort("0");

        //assert
        assertEquals("0 The sum is 0 false",result);
    }
    @Test
    public void givenNullShouldReturnErrorMessage() {
        //arrange

        //act
        String result=objDescendingSort.descendingSort(null);

        //assert
        assertEquals("null not allowed",result);
    }
}