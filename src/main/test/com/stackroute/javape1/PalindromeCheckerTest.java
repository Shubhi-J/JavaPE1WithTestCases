package com.stackroute.javape1;

import org.junit.*;

import static org.junit.Assert.*;

public class PalindromeCheckerTest {
    PalindromeChecker objPalindromeChecker;

    @Before
    public void setUp() {
        objPalindromeChecker = new PalindromeChecker();
    }
    @After
    public void tearDown () {
        objPalindromeChecker = null;
    }

    @BeforeClass
    public static void setUpBeforeClass(){}
    @AfterClass
    public static void tearDownAfterClass (){}


    @Test
    public void givenPalindromeWithSumOfEvenDigitsLessThan25ShouldReturnSuccessMessage() {
        //arrange

        //act
        String result=objPalindromeChecker.palindromeChecker(27872);

        //assert
        assertEquals("Given number is a palindrome number and sum of even numbers is less than 25",result);
    }

    @Test
    public void givenPalindromeWithSumOfEvenDigitsGreaterThan25ShouldReturnSuccessMessage() {
        //arrange

        //act
        String result=objPalindromeChecker.palindromeChecker(2898982);

        //assert
        assertEquals("Given number is a palindrome number and sum of even numbers is greater than 25",result);

    }
    @Test
    public void givenNotPalindromeShouldReturnNotPalindromeMessage() {
        //arrange

        //act
        //act
        String result=objPalindromeChecker.palindromeChecker(19898);

        //assert
        assertEquals("Given number is not palindrome",result);
    }
    @Test
    public void givenZeroShouldReturnSuccessMessage() {
        //arrange

        //act
        //act
        String result=objPalindromeChecker.palindromeChecker(0);

        //assert
        assertEquals("Given number is a palindrome number and sum of even numbers is less than 25",result);
    }

}