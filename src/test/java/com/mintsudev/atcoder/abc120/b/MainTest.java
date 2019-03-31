package com.mintsudev.atcoder.abc120.b;

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
        String input = "8 12 2" + System.lineSeparator();
        String expected = "2" + System.lineSeparator();

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Main.main(null);

        assertThat(out.toString(), is(expected));
    }


    @Test
    public void case2() {
        String input = "100 50 4" + System.lineSeparator();
        String expected = "5" + System.lineSeparator();

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Main.main(null);

        assertThat(out.toString(), is(expected));
    }


    @Test
    public void case3() {
        String input = "1 1 1" + System.lineSeparator();
        String expected = "1" + System.lineSeparator();

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Main.main(null);

        assertThat(out.toString(), is(expected));
    }
}