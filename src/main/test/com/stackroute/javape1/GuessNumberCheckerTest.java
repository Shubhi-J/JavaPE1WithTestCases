package com.stackroute.javape1;

import org.junit.*;

import static org.junit.Assert.*;

public class GuessNumberCheckerTest {
    GuessNumberChecker objGuessNumberChecker;

    @Before
    public void setUp() {
        objGuessNumberChecker = new GuessNumberChecker();
    }
    @After
    public void tearDown () {
        objGuessNumberChecker = null;
    }

    @BeforeClass
    public static void setUpBeforeClass(){}
    @AfterClass
    public static void tearDownAfterClass (){}


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