package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class GuessNumberCheckerTest {
    GuessNumberChecker objGuessNumberChecker;

    @Before
    public void setUp() {
        System.out.println("Before");
        objGuessNumberChecker = new GuessNumberChecker();
    }
    @After
    public void tearDown () {
        System.out.println("After");
        objGuessNumberChecker = null;
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
    public void givenNumberGreaterThanOriginalShouldReturnGreaterNumberMessage() {
        //arrange

        //act
        String result=objGuessNumberChecker.guessedNumberChecker(45);

        //assert
        assertEquals("Number guessed is greater than the original number",result);
    }

    @Test
    public void givenNumberLessThanOriginalShouldReturnLessNumberMessage() {
        //arrange

        //act
        String result=objGuessNumberChecker.guessedNumberChecker(21);

        //assert
        assertEquals("Number guessed is less than the original number",result);

    }
    @Test
    public void givenNumberEqualToOriginalShouldReturnMatchedNumberMessage() {
        //arrange

        //act
        //act
        String result=objGuessNumberChecker.guessedNumberChecker(38);

        //assert
        assertEquals("Number guessed matches the original number",result);
    }
    @Test
    public void givenZeroShouldReturnErrorMessage() {
        //arrange

        //act
        String result=objGuessNumberChecker.guessedNumberChecker(0);

        //assert
        assertEquals("The guessed number is out to range(that is 1 to 50)",result);
    }
    @Test
    public void givenNumberOutOfRangeShouldReturnErrorMessage() {
        //arrange

        //act
        String result=objGuessNumberChecker.guessedNumberChecker(9999);

        //assert
        assertEquals("The guessed number is out to range(that is 1 to 50)",result);
    }

}