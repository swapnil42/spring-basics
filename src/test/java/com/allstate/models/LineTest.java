package com.allstate.models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by localadmin on 11/01/17.
 */
public class LineTest {

    @Test
    public void testDistance() {
        Line line = new Line(0,3,0,4);
        assertEquals(5.0, Line.distance(line), 0.1);
    }


    @Test
    public void testSlope() {
        Line line = new Line(0,3,0,4);
        assertEquals(1.33, Line.slope(line), 0.01);
    }

    @Test
    public void testYIntercept() {
        Line line = new Line(0,3,0,4);
        assertEquals(0, Line.yIntercept(line).getY(), 0.1);
    }

}