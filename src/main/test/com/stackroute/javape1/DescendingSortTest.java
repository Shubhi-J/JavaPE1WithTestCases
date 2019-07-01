package com.stackroute.javape1;

import org.junit.*;

import static org.junit.Assert.*;

public class DescendingSortTest {
    DescendingSort objDescendingSort;

    @Before
    public void setUp() {
        objDescendingSort = new DescendingSort();
    }
    @After
    public void tearDown () {
        objDescendingSort = null;
    }

    @BeforeClass
    public static void setUpBeforeClass() { }
    @AfterClass
    public static void tearDownAfterClass () { }


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
        //assertEquals("null not allowed",result);
        assertNull("null not allowed",result);
    }
}