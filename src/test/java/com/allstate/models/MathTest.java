package com.allstate.models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by localadmin on 11/01/17.
 */
public class MathTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }
    @Test
    public void shouldSquareInteger() throws Exception{
        double result = Math.square(4);
        assertEquals(16, result);
    }

    @Test
    public void shouldReturnFactorial() throws Exception{
        int result = Math.factorial(5);
        assertEquals(2, result);
    }


    @Test
    public void shouldReturnFibo() throws Exception{
        int result = Math.fibo(11);
        assertEquals(89, result);
    }

//    @Test
//    public void shouldReturnFibo2() throws Exception{
//        Accumulator result = Math.fibo2(0);
//        assertEquals(0, result.getSum());
//    }
}