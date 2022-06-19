package com.geektech.testapp;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MathTest {
    Math math;

    @Before
    public void install() {
        math = new Math();
    }

    @Test
    public void simpleAddTest() {
        assertEquals("12", math.add("6", "6"));
    }

    @Test
    public void letterAddTest() {
        assertEquals("You can not plus letters", math.add("6", "a"));
    }

    @Test
    public void spaceAddTest() {
        assertEquals("You can not use empty spaces", math.add("6", " "));
    }

    @Test
    public void withDotAddTest() {
        assertEquals("You can use only whole numbers", math.add("6", "6.2"));
    }

    @Test
    public void minusAddTest() {
        assertEquals("You can not use negative numbers", math.add("6", "-6"));
    }

    @Test
    public void nullAddTest() {
        assertEquals("You can not use null", math.add("6", null));
    }
    @Test
    public void simpleDivideTest() {
        assertEquals("2", math.divide("4", "2"));
    }

    @Test
    public void zeroDivideTest() {
        assertEquals("You can not divide to zero", math.divide("6", "0"));
    }

    @After
    public void detach() {
        math = null;
    }
}
