package com.mintsudev.atcoder.abc120.c;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MainTest {
    private ByteArrayOutputStream out;


    @Before
    public void setUp() {
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void case1() {
        String input = "2 11 4" + System.lineSeparator();
        String expected = "4" + System.lineSeparator();

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Main.main(null);

        assertThat(out.toString(), is(expected));
    }
}