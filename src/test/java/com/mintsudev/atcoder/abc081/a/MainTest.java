package com.mintsudev.atcoder.abc081.a;

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
    public void setUp() throws Exception {
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void case1() {
        String input = "101" + System.lineSeparator();

        String expected = "2" + System.lineSeparator();

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Main.main(null);

        assertThat(out.toString(), is(expected));
    }

    @Test
    public void case2() {
        String input = "000" + System.lineSeparator();

        String expected = "0" + System.lineSeparator();

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Main.main(null);

        assertThat(out.toString(), is(expected));
    }
}