package com.stackroute.javape1;

import org.junit.*;

import static org.junit.Assert.*;

public class AddUnspecifiedNumbersTest {
    AddUnspecifiedNumbers objAddUnspecifiedNumbers;

    @Before
    public void setUp() {
        objAddUnspecifiedNumbers = new AddUnspecifiedNumbers();
    }
    @After
    public void tearDown () {
        objAddUnspecifiedNumbers = null;
    }

    @BeforeClass
    public static void setUpBeforeClass() { }
    @AfterClass
    public static void tearDownAfterClass (){ }


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