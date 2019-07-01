package com.stackroute.javape1;

import org.junit.*;

import static org.junit.Assert.*;

public class ForLoopPatternTest {
    ForLoopPattern objForLoopPattern;

    @Before
    public void setUp() {
        objForLoopPattern = new ForLoopPattern();
    }
    @After
    public void tearDown () {
        objForLoopPattern = null;
    }

    @BeforeClass
    public static void setUpBeforeClass() { }
    @AfterClass
    public static void tearDownAfterClass () { }


    @Test
    public void givenInput5ShouldReturnPattern() {
        //arrange

        //act
        String result=objForLoopPattern.forLoopPattern(5);

        //assert
        assertEquals("122333444455555",result);
    }

    @Test
    public void givenInput2ShouldReturnPattern() {
        //arrange

        //act
        String result=objForLoopPattern.forLoopPattern(2);

        //assert
        assertEquals("122",result);

    }
    @Test
    public void givenInputZeroShouldReturnErrorMessage() {
        //arrange

        //act
        String result=objForLoopPattern.forLoopPattern(0);

        //assert
        assertEquals("zero not allowed",result);
    }
}