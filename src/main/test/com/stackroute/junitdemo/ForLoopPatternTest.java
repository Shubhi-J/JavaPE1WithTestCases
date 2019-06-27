package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class ForLoopPatternTest {
    ForLoopPattern objForLoopPattern;

    @Before
    public void setUp() {
        System.out.println("Before");
        objForLoopPattern = new ForLoopPattern();
    }
    @After
    public void tearDown () {
        System.out.println("After");
        objForLoopPattern = null;
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
        //act
        String result=objForLoopPattern.forLoopPattern(0);

        //assert
        assertEquals("zero not allowed",result);
    }
}