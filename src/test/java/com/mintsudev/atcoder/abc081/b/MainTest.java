package com.mintsudev.atcoder.abc081.b;

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
        final String input = "3" + System.lineSeparator()
                + "8 12 40";

        final String expected = "2" + System.lineSeparator();

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Main.main(null);

        assertThat(out.toString(), is(expected));
    }

}