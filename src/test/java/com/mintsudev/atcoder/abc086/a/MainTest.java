package com.mintsudev.atcoder.abc086.a;

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
        String input = "3 4" + System.lineSeparator();

        String expected = "Even" + System.lineSeparator();

        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Main.main(null);

//        assertEquals(expected , out.toString());
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void case2() {
        String input = "1 21" + System.lineSeparator();

        String expected = "Odd" + System.lineSeparator();

        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Main.main(null);

//        assertEquals(expected , out.toString());
        assertThat(out.toString(), is(expected));
    }
}